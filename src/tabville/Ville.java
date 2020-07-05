package tabville;

public class Ville {
	
protected String nomVille; 
protected String nomPays;
protected int nbreHabitants;
protected char categorie; 
public static int nbrInstances;
protected static int nbrInstancesBis;


public Ville() {
	System.out.println("creation d'une ville :");
	nomVille ="inconnu";
	nomPays = "inconnu";
	nbreHabitants=0;
	this.setCategorie();
	nbrInstances++;
	nbrInstancesBis++;
	
}

public Ville(String pNom, int pNbre, String pPays) {
	System.out.println("creation d'une ville avec parametres:");
	nomVille = pNom ;
	nomPays = pPays;
	nbreHabitants = pNbre ;
	this.setCategorie();
	nbrInstances++;
	nbrInstancesBis++;
}

public String getNomVille() {
	return nomVille;
}

public void setNomVille(String pNom) {
	nomVille = pNom;
}

public String getNomPays() {
	return nomPays;
}

public char getCategorie() {
	return categorie;
}

public void setCategorie(char categorie) {
	this.categorie = categorie;
}

public void setNomPays(String pPays) {
	nomPays = pPays;
}

public int getNbreHabitants() {
	return nbreHabitants;
}

public void setNbreHabitants(int pNbre) {
	nbreHabitants = pNbre;	
}
public static int getNbrInstancesBis() {
	return nbrInstancesBis;
}

public static void setNbrInstancesBis(int nbrInstancesBis) {
	Ville.nbrInstancesBis = nbrInstancesBis;
}


public static int nbrInstancesBis() {
	return nbrInstancesBis;
}

// categorie
private void setCategorie() {
	 
    int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
    char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

    int i = 0;
    while (i < bornesSuperieures.length && nbreHabitants > bornesSuperieures[i])
      i++;

    categorie = categories[i];
  }
// description de la ville 
public String decrisToi() {
	return nomVille + " est une ville de "+ nbreHabitants + " habitants et est de categorie " + categorie;
}
//comparer
public String comparer(Ville v1) {
	String str =new String();
	if (v1.getNbreHabitants()>nbreHabitants )
		str= v1.getNomVille()+ " est une ville plus peuplee que " +nomVille;
	else 
		str = nomVille + " est une ville plus peuplee que " + v1.getNomVille();
	return str; 
}

}