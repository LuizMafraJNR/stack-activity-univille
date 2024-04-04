package univille.activity.stack;

import java.util.Objects;
import univille.activity.domain.model.Student;

public class Stack implements StackService
{
	private int maxSize;
	private int top;
	private Student[] stackArray;

	public Stack(int maxSize)
	{
		this.maxSize = maxSize;
		this.stackArray = new Student[maxSize];
		this.top = -1;
	}

	@Override
	public void push(Student student)
	{
		if (Objects.equals(top, maxSize - 1))
		{
			System.out.println("Stack is full!");
			return;
		}
		top++;
		stackArray[top] = student;
	}

	@Override
	public Student pop()
	{
		if(isEmpty()){
			System.out.println("Stack is empty!");
			return null;
		}
		Student unstackItems = stackArray[top];
		top--;
		return unstackItems;
	}

	@Override
	public Student peek()
	{
		if (isEmpty())
		{
			System.out.println("Stack is empty!");
			return null;
		}
		return stackArray[top];
	}

	@Override
	public boolean isEmpty()
	{
		return Objects.equals(top, -1);
	}

	@Override
	public void destroy()
	{
		top = -1;
		for (int i = 0; i < maxSize; i++)
		{
			stackArray[i] = null;
		}
	}

	@Override
	public boolean isFull()
	{
		return Objects.equals(top, maxSize - 1);
	}
}
