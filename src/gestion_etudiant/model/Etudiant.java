package gestion_etudiant.model;

public class Etudiant {
	String nom;
	int age;
	Double moyenne;
	String adresse;
	
	
	//constructeur par defaut
	public Etudiant() {}
	
	//constructeur avec paramètre
	public Etudiant(String nom,int age,double moyenne,String adresse) {
		this.nom=nom;
		this.age=age;
		this.moyenne=moyenne;
		this.adresse=adresse;
		
		
	}
	
	
	
	public void info() {
		System.out.println("le nom="+this.nom);
		System.out.println("l'age="+this.age);
		System.out.println("le moyenne="+this.moyenne);
		System.out.println("l'adresse="+this.adresse);
	}
	

}
