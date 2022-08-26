package Ex_If;

import java.util.Scanner;

public class NotasBimestrais {

	public static void main(String[] args) {
		/*
		  Faça um programa que peça as 4 notas bimestrais e mostre a média. 
		*/		
		
		double n1,n2,n3,n4,media;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a 1° nota:");
		n1 = scan.nextDouble();
		System.out.print("Digite a 2° nota:");
		n2 = scan.nextDouble();
		System.out.print("Digite a 3° nota:");
		n3 = scan.nextDouble();
		System.out.print("Digite a 4° nota:");
		n4 = scan.nextDouble();
		
		media = (n1 +n2 + n3 + n4) / 4;
		
		System.out.println("\nSua nota média é:" + media);
		
		scan.close();
	}
}
