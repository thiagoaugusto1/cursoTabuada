package app;

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
	
		for ( int i = 1; i <= 10; i++) {
			String line = " ";
			for (int j = 1; j <= 10; j++) {
				 
				line += i*j +  " " + " ";
				
			}
			System.out.println(line);
			
		}
		
		
	}
			
	}	
	
		

