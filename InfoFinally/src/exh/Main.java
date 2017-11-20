package exh;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = div(7,0);
		System.out.println(c);
	}
		
		public static int div(int a, int b) {
			int c;
			try {
				c= a/b;
				return c;
			} finally { //у него приоритет максимальный 
				System.out.println("Finally work");
				c=10;
				return c;
			}
			
		}


}
