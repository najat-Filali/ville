package tabville;

public class Test {

	public static void main(String[] args) {
	
		Ville v = new Ville();
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbrInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNbrInstancesBis());
			                        
		Ville v1 = new Ville("Marseille", 5000, "France"); 
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbrInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNbrInstancesBis());
		
		Ville v2 = new Ville("Rio", 321654, "Brésil");
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbrInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNbrInstancesBis());
		
		System.out.println("\n v = "+v.getNomVille()+" ville de  "+v.getNbreHabitants()+ " habitants se situant en "+v.getNomPays());
		System.out.println(" v1 = "+v1.getNomVille()+" ville de  "+v1.getNbreHabitants()+ " habitants se situant en "+v1.getNomPays());
		System.out.println(" v2 = "+v2.getNomVille()+" ville de  "+v2.getNbreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");
	
		System.out.println("\n\n"+v1.decrisToi());
		System.out.println(v.decrisToi());
		System.out.println(v2.decrisToi()+"\n\n");
		System.out.println(v1.comparer(v2));
		
		Capitale cap = new Capitale("Paris", 654987, "France", "la tour Eiffel");
		System.out.println("\n"+cap.decrisToi());
		                
		        
		
	/*	
		
		  Nous allons interchanger les Villes v1 et v2
		  tout ça par l'intermédiaire d'un autre objet Ville.        
		       
		Ville temp = new Ville();
		temp = v1;
		v1 = v2;
		v2 = temp;
		       
		System.out.println(" v1 = "+v1.getNomVille()+" ville de  "+v1.getNbreHabitants()+ " habitants se situant en "+v1.getNomPays());
		System.out.println(" v2 = "+v2.getNomVille()+" ville de  "+v2.getNbreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");

		     
		  Nous allons maintenant interchanger leurs noms
		  cette fois par le biais de leurs mutateurs.
		  
		v1.setNomVille("Hong Kong");
		v2.setNomVille("Djibouti");
		      
		System.out.println(" v1 = "+v1.getNomVille()+" ville de  "+v1.getNbreHabitants()+ " habitants se situant en "+v1.getNomPays());
		System.out.println(" v2 = "+v2.getNomVille()+" ville de  "+v2.getNbreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");
*/
	}

}
