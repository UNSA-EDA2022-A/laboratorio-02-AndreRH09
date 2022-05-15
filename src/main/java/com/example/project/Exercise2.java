package com.example.project;

import java.util.Scanner;

public class Exercise2 {
	
	public static void main(final String[] args) {
                
                Exercise2 obj = new Exercise2();
                Scanner sc = new Scanner(System.in);
		while (true) {

			int n = sc.nextInt(), suma, aux;
			int a[] = new int[n];

			for (int i = 0; i < n; i++) {
				aux = sc.nextInt();     //Se reemplaza n para no interferir con la condicion i < n del for
				a[i] = aux;
			}
                        
			suma = sc.nextInt();

			System.out.println(obj.esSubconjuntoSumaExt(a, suma));
		}
	}

	public boolean esSubconjuntoSumaExt(int a[], int suma) {
		
                return esSubconjuntoSumaExt(a, 0, suma);        //Se usa sobrecarga de metodo, para agregar 1 parametro (int n)
                
	}
        
	public boolean esSubconjuntoSumaExt(int a[],int n, int suma) {
                
                // Casos base
                /*Puede existir el caso, que la suma del subconjunto solucion tome un multiplo de 7 (por obligacion)
                , Entonces sobrepasar la suma que se busca*/
                if (suma < 0)           
                        return false;
                
                if (suma == 0){
                        if(a[a.length - 1] % 7 == 0)      //Verifica que el ultimo numero sea multiplo de 7, y si lo es, lo toma dentro del subconjunto respuesta
                                return esSubconjuntoSumaExt(a, n, suma - 7);
                        
                        return true;
                }
                
                if (n == a.length)
                        return false;
                
                if(n < a.length - 1){           //Verfica los números del array hasta el penultimo
                        if(a[n] % 7 == 0 && a[n + 1] == 1)                //Busca de multiplos de 7 seguidos de uno, y si es verdad, lo descarta del subconjunto rpta
                                return esSubconjuntoSumaExt(a, n + 1, suma);
                        if(a[n] % 7 == 0)                       //Busca multiplos de 7 en el array, y toma en el subconjunto solucion aquellos ya filtrados (que no les sigue un 1)
                                return esSubconjuntoSumaExt(a, n + 1, suma - a[n]);
                }
                
                /* verificamos si conseguimos la suma por alguna de las siguientes formas:
                (a) incluyendo el primer elemento
                (b) excluyendo el primer elemento */
                return esSubconjuntoSumaExt(a, n + 1, suma - a[n]) || esSubconjuntoSumaExt(a, n + 1, suma );
	}
        
}
