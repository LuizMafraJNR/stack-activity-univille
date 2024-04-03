package univille.activity.domain.model;

public class Student
{
	private String name;
	private int registration;
	private char gender;

	public Student(String name, int registration, char gender)
	{
		this.name = name;
		this.registration = registration;
		this.gender = gender;
	}

	public String getName()
	{
		return name;
	}

	public int getRegistration()
	{
		return registration;
	}

	public char getGender()
	{
		return gender;
	}
}
