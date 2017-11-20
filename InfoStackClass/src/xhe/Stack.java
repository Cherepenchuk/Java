package xhe;
// в этом классе определяется целочисленный стек, в котором
//можно хранить до 10 целочесленных значений 
public class Stack {
	int[] stck = new int [10];
	int tos;
	//методы
	Stack() { //инициализация вершины стека, "-1" означает пустой стек
		tos = -1;
	}
	void push (int item) {//разместить элемент в стеке
		if (tos==9)
			System.out.println("Стек заполнен.");
		else
			stck[++tos] = item;
	}
	int pop () {//извлечь элемент из стека
		if(tos<0) {
			System.out.println("Стек не загружен.");
			return 0;
		}
		else 
			return stck[tos--];
	}
}
