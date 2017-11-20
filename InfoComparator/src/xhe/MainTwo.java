package xhe;

import java.util.Arrays;
import java.util.Scanner;

public class MainTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Cat catOne = new Cat("Vaska", 3);
		Cat catTwo = new Cat("Umka", 7);
		Cat catThree = new Cat("Kuzia", 5);
		Cat catFour = new Cat("Dimok", 1);
		Cat catFive = new Cat("Rigik", 2);
		
		Cat[] catArray = new Cat[] {catOne, null, catTwo, null, catThree, catFour, catFive};
		for (Cat cat : catArray) {
			System.out.println(cat);
		}
		//если в массиве есть null
		Arrays.sort(catArray,(a,b) -> CheckNull.checkNull(a,b)!=CheckNull.NOT_NULL?CheckNull.checkNull(a, b):
			a.getAge() - b.getAge());
		
		System.out.println();
		for (Cat cat : catArray) {
			System.out.println(cat);
		}
		
	}

}
