package univille.activity;

import java.util.ArrayList;
import java.util.List;
import univille.activity.domain.model.Student;
import univille.activity.stack.Stack;

public class Main
{
	public static void main(String[] args)
	{
		Stack pe1 = new Stack(20);
		Stack pe2 = new Stack(20);

		// TODO - Aqui os estudantes deve ser inseridos por Scanner.
		//  Fazer um IF para se caso for M adicionar na pe1 e F na p2

		for (Student student : getStudentsF())
		{
			pe1.push(student);
		}

		for (Student student : getStudentsM())
		{
			pe2.push(student);
		}

		while (!pe1.isEmpty())
		{
			Student student = pe1.pop();
			System.out.println(
				String.format("Name: %s, Registration: %s, Gender: %s%n", student.getName(),
					student.getRegistration(), student.getGender()));
		}

		while (!pe2.isEmpty())
		{
			Student student = pe2.pop();
			System.out.println(
				String.format("Name: %s, Registration: %s, Gender: %s%n", student.getName(),
					student.getRegistration(), student.getGender()));
		}
	}

	// TODO - REMOVE
	static List<Student> getStudentsM()
	{
		List<Student> students = new ArrayList<>();

		students.add(new Student("John1", 1001, 'M'));
		students.add(new Student("John2", 1002, 'M'));
		students.add(new Student("John3", 1003, 'M'));
		students.add(new Student("John4", 1004, 'M'));
		students.add(new Student("John5", 1005, 'M'));
		students.add(new Student("John6", 1006, 'M'));
		students.add(new Student("John7", 1007, 'M'));
		students.add(new Student("John8", 1008, 'M'));
		students.add(new Student("John9", 1009, 'M'));
		students.add(new Student("John10", 1010, 'M'));
		students.add(new Student("John11", 1011, 'M'));
		students.add(new Student("John12", 1012, 'M'));
		students.add(new Student("John13", 1013, 'M'));
		students.add(new Student("John14", 1014, 'M'));
		students.add(new Student("John15", 1015, 'M'));
		students.add(new Student("John16", 1016, 'M'));
		students.add(new Student("John17", 1017, 'M'));
		students.add(new Student("John18", 1018, 'M'));
		students.add(new Student("John19", 1019, 'M'));
		students.add(new Student("John20", 1020, 'M'));

		return students;
	}


	// TODO - REMOVE
	static List<Student> getStudentsF()
	{
		List<Student> students = new ArrayList<>();

		students.add(new Student("Jane1", 2001, 'F'));
		students.add(new Student("Jane2", 2002, 'F'));
		students.add(new Student("Jane3", 2003, 'F'));
		students.add(new Student("Jane4", 2004, 'F'));
		students.add(new Student("Jane5", 2005, 'F'));
		students.add(new Student("Jane6", 2006, 'F'));
		students.add(new Student("Jane7", 2007, 'F'));
		students.add(new Student("Jane8", 2008, 'F'));
		students.add(new Student("Jane9", 2009, 'F'));
		students.add(new Student("Jane10", 2010, 'F'));
		students.add(new Student("Jane11", 2011, 'F'));
		students.add(new Student("Jane12", 2012, 'F'));
		students.add(new Student("Jane13", 2013, 'F'));
		students.add(new Student("Jane14", 2014, 'F'));
		students.add(new Student("Jane15", 2015, 'F'));
		students.add(new Student("Jane16", 2016, 'F'));
		students.add(new Student("Jane17", 2017, 'F'));
		students.add(new Student("Jane18", 2018, 'F'));
		students.add(new Student("Jane19", 2019, 'F'));
		students.add(new Student("Jane20", 2020, 'F'));

		return students;
	}

}