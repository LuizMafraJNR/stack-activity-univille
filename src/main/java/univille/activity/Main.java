package univille.activity;

import univille.activity.domain.model.Student;
import univille.activity.stack.Stack;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Stack pe1 = new Stack(20);
		Stack pe2 = new Stack(20);

		String stop = "n";
		do {
			System.out.println("Enter the student name: ");
			String name = scanner.next();
			System.out.println("Enter the student registration: ");
			int registration = scanner.nextInt();
			System.out.println("Enter the student gender: ");
			char gender = String.valueOf(scanner.next().charAt(0)).toUpperCase().charAt(0);
			if (gender != 'M' || gender != 'F' || gender != 'm' || gender != 'f')
			{
				System.out.println("Enter a valid gender (M/F)");
				gender = String.valueOf(scanner.next().charAt(0)).toUpperCase().charAt(0);
			}
			System.out.println("Do you want stop? (s/n)");
			stop = scanner.next();

			if (gender == 'M' || gender == 'm')
			{
				pe1.push(new Student(name, registration,gender));
			} else {
				pe2.push(new Student(name, registration,gender));
			}
		} while(stop.equalsIgnoreCase("n"));

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
}