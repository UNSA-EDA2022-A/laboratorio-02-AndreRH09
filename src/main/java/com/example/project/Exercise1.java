package com.example.project;

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
            
            if(numero <=0)		//El ejercicio no toma al 0 como un cuadrado perfecto y no existen cuadrados negativos
                return false;
            else{
               if(numCuadrado((int) Math.sqrt(numero)) == numero)	//Llama al metodo y comprueba si es que el cuadrado encontrado es igual al numero
                   return true;
            }
            return false;		
	}
        
        public int numCuadrado(int n) {		//Para utilizar la formula recursiva se necesita la raiz entera que significa el n-simo cuadrado 
            
            if(n == 1)		//En el caso A(n) = 2 n - 1, para n = 1; A(1) = 1 , o llamdo caso base
                return 1;
            else{
                return  2 * n - 1 +numCuadrado(n - 1);		//Aqui la formula recursiva es A(n) = 2n - 1 + A(n-1)
            }
        }
}
