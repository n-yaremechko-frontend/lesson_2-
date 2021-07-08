package Ua_Lviv_Gorodok;

public class Application {

	public static void main(String[] args) {

		boolean a = true;
		boolean z = false;
		System.out.println("Boolean = " + z );
		System.out.println("Boolean = " + a );
		System.out.println();
		char b;
		System.out.println("Char = " + Character.MIN_VALUE);
		System.out.println("Char = " + Character.MAX_VALUE);
		System.out.println();
		byte c;
		System.out.println("Byte = " + Byte.MIN_VALUE);
		System.out.println("Byte = " + Byte.MAX_VALUE);
		System.out.println();
		short d;
		System.out.println("Short = " + Short.MIN_VALUE);
		System.out.println("Short = " + Short.MAX_VALUE);
		System.out.println();
		int e;
		System.out.println("Int = " + Integer.MIN_VALUE);
		System.out.println("Int = " + Integer.MAX_VALUE);
		System.out.println();
		long f;
		System.out.println("Long = " + Long.MIN_VALUE);
		System.out.println("Long = " + Long.MAX_VALUE);
		System.out.println();
		float g;
		System.out.println("Float = " + Float.MIN_VALUE);
		System.out.println("Float = " + Float.MAX_VALUE);
		System.out.println();
		double h;
		System.out.println("Double = " + Double.MIN_VALUE);
		System.out.println("Double = " + Double.MAX_VALUE);
		
		int array [] = {2,42,64,35,56,98,12,54,76,34};
		boolean isSorted = false;	
		int data = 0;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < array.length-1; i++) {
				if (array[i] > array [i+1]) {
				isSorted = false;
				data = array[i];
				array[i] = array[i+1];
				array [i+1] = data;
				
				}
				
				}
			
		}
		System.out.println();
		System.out.println("Найменше -" +array[0]);
		System.out.println("Найбільше -" +array[9]);
	}

}
