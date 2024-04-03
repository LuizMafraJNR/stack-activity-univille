package univille.activity.stack;

import univille.activity.domain.model.Student;

public interface StackService
{
	void push(Student student);
	Student pop();
	Student peek();
	boolean isEmpty();
	boolean isFull();
	void destroy();
}
