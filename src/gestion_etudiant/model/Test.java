package gestion_etudiant.model;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//instance:appel de constructeur
		
		Etudiant e1=new Etudiant();
		Etudiant e2=new Etudiant("mahdi",30 , 20,"Testour");
        //appel de methode info
		e1.info();
		e2.info();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donner votre nom");
		String nom = sc.nextLine();
		
		System.out.println("Donner votre age");
		int age = sc.nextInt();
		
		
		System.out.println("Donner votre moyenne");
		String moy = sc.nextLine();
		
		
		System.out.println("Donner votre adresse");
		String adress = sc.nextLine();
		
		
		
		
		System.out.println("Vous avez taper : "+nom + " Age = "+age+ "Moyenne = "+moy+ " Adress = "+adress );
	}
	
	

}
