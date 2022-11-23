package esercizicarlo;

import java.util.Scanner;

public class fradiecianni {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String nome;
		
		int anni;
		
		do {
		System.out.println("Scrivi il tuo mome");
		Scanner n = new Scanner(System.in);
		 nome=n.nextLine();
		
		 System.out.println("Scrivi eta");
		 Scanner a = new Scanner(System.in);
		 anni=a.nextInt();
		
		 
		 System.out.println(nome);
		 
		 System.out.println(anni+10);
		
		
		
	}
while (anni!=0);
}
}