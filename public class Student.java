public class Student 
{
     Instance variables
    private String name;
    private int age;
    private double grade;

     Instance method to set the student's name
    public void setName(String name) 
    {
        this.name = name;
    }
	
	 Instance method to get the student's name
    public String getName()
     {
        return name;
    }
	
	 Instance method to set the student's age
    public void setAge(int age) 
    {
        this.age = age;
    }

     Instance method to get the student's age
    public int getAge()
    {
        return age;
    }

     Instance method to get the student's grade
    public double getGrade()
    {
        return grade;
    }

     Instance method to set the student's grade
    public void setGrade(double grade)
    {
        this.grade = grade;
    }

     Instance method to display student information
    public void displayInfo()
    {
        System.out.println(Name  + name);
        System.out.println(Age  + age);
        System.out.println(Grade  + grade);
    }
	
	public static void main(String[] args)
    {
		Student student1 = new Student();
        student1.setName(Bob);
        student1.setAge(21);
        student1.setGrade(3.9);

         Displaying Added student information
        System.out.println(nAdded Information);
        student1.displayInfo();
    }
}
