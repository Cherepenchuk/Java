package xhe;

@FunctionalInterface
interface Func {
	public int get(int n);
} 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Func func; //объ€вление переменной фунц интерфейса
		
		func = A ::getStaticMethod; //ссылка на статитческий метод
		System.out.println(func.get(8));
		
		A a = new A(); //создание переменной класса реализующего интерфейс
						//чтобы можно было вызвать не статический метод
		
		func = a::getMethod; //ссылка на обычный метод
		System.out.println(func.get(8));
		
		func = n -> n*n; //л€мбда-функции,  "->" - означает отображение
		//func = (int n) -> n*n;//можно указать так , но от этого ничего не изменитс€ 
		System.out.println(func.get(5));
		
		func = n -> { //если нужно несколько условий поставить
			int fact = 1;
			for(int i = 1; i<=n; i++) {
				fact *=i;
			}
			return fact;
		}; //";" - об€зательны после закрыти€ тела реализации
		System.out.println(func.get(5)); // ответ 120 ????
	}

}
class A { //дл€ функц интерс не надо писать implements
	public static int getStaticMethod(int n) { //статический метод
		return 3*n;
	}
	public int getMethod (int n) {//обычный метод
		return 5*n;
	}
}
