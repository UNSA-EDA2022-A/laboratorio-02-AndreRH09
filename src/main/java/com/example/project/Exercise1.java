package Lab2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.esCuadradoPerfecto(n));			
		}
	}

	public boolean esCuadradoPerfecto(int numero) {
            
            if(numero <=0)
                return false;
            else{
                System.out.println(numCuadrado((int) Math.sqrt(numero)));
               if(numCuadrado((int) Math.sqrt(numero)) == numero)
                   return true;
            }
            return false;
	}
        
        public int numCuadrado(int n) {
            
            if(n == 1)
                return 1;
            else{
                return  2 * n - 1 +numCuadrado(n - 1);
            }
        }
}
