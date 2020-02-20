package app;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
	
		
		for ( int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
				
			}
			System.out.println();
			
		}
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println();
	
		
		
		int mult = 11;
		int tab = 11;
		int[][] resultado = new int[mult][tab];

		for (int c = 1; c < mult; c++) {
		    for (int a = 1; a < tab; a++) {
		        int result = c * a;
		        resultado[c][a] = result;
		        System.out.println(c + "x" + a + "=" + resultado[c][a]);
		       
		    }
		    System.out.println();
		}

		System.out.println("----------------------------------------------------------------------------------");
		System.out.println();
		
	

		
	}
			
	}	
	


