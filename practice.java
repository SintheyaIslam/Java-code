public class Student{
	private String name;
	private int age;
	private double cgpa;
	
	/*public Student()
	{
		
	}*/
	
	public Student(String n, int a, double c)
	{
		name = n;
		age = a;
		cgpa = c;
	}
	
	public void displayInfo()
	{
		System.out.println("Name is : " +name);
		System.out.println("Age is : " +age);
		System.out.println("CGPA is : " +cgpa);
	}
	
	
	public static void main (String[] args)
	{
		Student s = new Student("Raihan", 25, 3.5);
		s.displayInfo();
	}
}