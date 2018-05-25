
public class GoogleTester {
public static void main (String []args){
	GoogleEmployee one = new GoogleEmployee("Bob", "34", "98,000", "Design Commander");
	System.out.println(one + "\n***************************");
	
	BusinessEmployee two = new BusinessEmployee("Jan", "46", "103,500", "Accountant", "Chrome");
	System.out.println(two + "\n***************************");
	DesignEmployee three = new DesignEmployee("Sammy", "29", "110,00", "Software Engineer", "Sky Map", "5");
	System.out.println(three +"\n***************************");
	SalesEmployee four = new SalesEmployee("Benny", "35", "200,000", "Product Sales Consultant", "Company B", "Google glass");
	System.out.println(four +"\n***************************");
	three.setSalary("175,000");
	three.setTeamNumber("3");
	System.out.println(three +"\n***************************");
}
}
