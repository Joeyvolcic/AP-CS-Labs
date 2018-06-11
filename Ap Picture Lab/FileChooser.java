package picturelab;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.util.Properties;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * A class to make working with a file chooser easier for students. It uses a
 * JFileChooser to let the user pick a file and returns the chosen file name.
 *
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class FileChooser {

   static File currentMediaDirectory = null;
   static File defaultPictureFolder = new File("images");
  /////////////////////// methods /////////////////////////////
   /**
    * Method to get the full path for the passed file name
    *
    * @param fileName the name of a file
    * @return the full path for the file
    */
   public static String getMediaPath(String fileName) {
      String path = null;
      String directory = getMediaDirectory();
      boolean done = true;
      System.out.println("Media Directory: " + directory);
      // get the full path
      path = directory + fileName;
      return path;
   }

   public static void setCurrentDirectory(File dir) {
      currentMediaDirectory = dir;
   }
   
   public static File getCurrentDirectory() {
      if(currentMediaDirectory!=null)
         return currentMediaDirectory;
      else {
         return defaultPictureFolder;
      }
         
   }
   /**
    * Method to pick an item using the file chooser
    *
    * @param fileChooser the file Chooser to use
    * @return the path name
    */
   public static String pickPath(JFileChooser fileChooser) {
      String path = null;

      /* create a JFrame to be the parent of the file 
       * chooser open dialog if you don't do this then 
       * you may not see the dialog.
       */
      JFrame frame = new JFrame();
      frame.setAlwaysOnTop(true);

      // get the return value from choosing a file
      int returnVal = fileChooser.showOpenDialog(frame);

      // if the return value says the user picked a file 
      if (returnVal == JFileChooser.APPROVE_OPTION)
         path = fileChooser.getSelectedFile().getPath();
      return path;
   }

   /**
    * Method to let the user pick a file and return the full file name as a
    * string. If the user didn't pick a file then the file name will be null.
    *
    * @return the full file name of the picked file or null
    */
   public static String pickAFile() {
      JFileChooser fileChooser = null;

      // start off the file name as null
      String fileName = null;

      // get the current media directory
      String mediaDir = getMediaDirectory();

      /* create a file for this and check that the directory exists
       * and if it does set the file chooser to use it
       */
      try {
         File file = new File(mediaDir);
         if (file.exists())
            fileChooser = new JFileChooser(file);
      } catch (Exception ex) {
      }

      // if no file chooser yet create one
      if (fileChooser == null)
         fileChooser = new JFileChooser();

      // pick the file
      fileName = pickPath(fileChooser);

      return fileName;
   }

   /**
    * Method to get the directory for the media
    *
    * @return the media directory
    */
   public static String getMediaDirectory() {
      String directory = null;
      boolean done = false;
      File dirFile = null;

      // try to find the images directory
      try {
         // get the URL for where we loaded this class 
         //Class currClass = Class.forName("FileChooser");
         //URL classURL = currClass.getResource("FileChooser.class");
         //URL fileURL = new URL(classURL, "../images/");
         //directory = fileURL.getPath();
         //directory = URLDecoder.decode(directory, "UTF-8");
         //dirFile = new File(directory);
         directory = "H:/myPicLab";
         dirFile = new File("H:/myPicLab");
         if (dirFile.exists()) {
            return directory;
         }
      } catch (Exception ex) {
      }

      return directory;
   }
   
   public static Picture showOpenDialog(JFrame parent) {
      Picture pict =null;
      JFileChooser chooser = new JFileChooser("Select an image");
      chooser.setCurrentDirectory(getCurrentDirectory());
      
      chooser.setFileFilter(new FileNameExtensionFilter("Images", "jpg","jpeg","png"));
      chooser.showOpenDialog(parent);
      File f = chooser.getSelectedFile();
      if(f!=null) {
         pict = new Picture(f);
         setCurrentDirectory(chooser.getCurrentDirectory());
      }
      return pict;
   }

   public static boolean showSaveDialog(JFrame parent, Picture saveMe) {
      JFileChooser chooser = new JFileChooser("Save Image");
      chooser.setCurrentDirectory(getCurrentDirectory());      
      chooser.setFileFilter(new FileNameExtensionFilter("Images", saveMe.getExtension()));
      //chooser.setSelectedFile(new File(saveMe.getFileName()));
      chooser.showSaveDialog(parent);
      File f = chooser.getSelectedFile();
      if(f==null) //user cancelled save dialog.
         return false;
      
      // Check extension and add if needed.
      String fileName = f.getName();
      int posDot = fileName.lastIndexOf('.');
      if (posDot == -1) {
         fileName = fileName + "." + saveMe.getExtension();
         f = new File(f.getParentFile(),fileName);
      }    
      try {
         return saveMe.write(f);
      } catch (IOException ex) {
           JOptionPane.showMessageDialog(parent, "Unable to save image:\n" + ex.getMessage(), 
                   "Collage Maker File Error",JOptionPane.ERROR_MESSAGE);
           return false;
      }
   }
}
