/*
* File: App.java
* Author: Zentai Pál
* Copyright: 2022, Zentai Pál
* Group: Szoft-I-N
* Date: 2022_02_15
* Github: https://github.com/Pali002/
* Licenc: GNU GPL
*/

import java.util.Scanner;

class App{
	public static void main (String[] args){
		System.out.println("Zentai Pal, 2022_02_15");
		System.out.println("Feladat_0301");
		System.out.println("Kor alapu kup terfogata");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Sugar: ");
		double sugar = sc.nextDouble();
		
		System.out.print("Magassag: ");
		double magassag = sc.nextDouble();
		
		double terfogat =
		(1.0/3.0) *
		Math.pow(sugar, 2) *
		Math.PI *
		magassag;
		
		System.out.println("Terfogat: " + terfogat);
	}	
}
