package tabville;

public class Capitale extends Ville {
	
	private String monument;

	public Capitale() {
		super();
		monument = "Aucun ";		
	}
	public Capitale(String pNom, int pNbre, String pPays,String monument) {
		super (pNom, pNbre, pPays);
		this.monument = monument;
	}

	public String getMonument() {
		return monument;
	}

	public void setMonument(String monument) {
		this.monument = monument;
	}

	public Capitale(String pNom, int pNbre, String pPays) {
		super(pNom, pNbre, pPays);		
	} 
	
	public String decrisToi() {
		String str = super.decrisToi() + "\n" + monument +" en est un monument"; 
		 System.out.println("Invocation de super.decrisToi()");
		return str;
	}
}
