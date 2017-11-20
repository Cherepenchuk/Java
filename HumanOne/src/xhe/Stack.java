package xhe;

public class Stack {
	Object [] objectArray = new Object[10];
	int index;
	Stack() { 
		index = -1;//Stack is empty
	}
	void push (Object objectOne) {//put object into Stack
		
		if (index == objectArray.length )
			System.out.println("Стек заполнен.");
		else
				objectArray[++index] = objectOne;
	}
	Object pop () {//get element out of stack 
		if(index<0) {
			System.out.println("Стек не загружен.");
			return 0;
		}
		else 
			return objectArray [index--];
	}
}