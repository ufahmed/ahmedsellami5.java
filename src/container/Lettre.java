package container;

public class Lettre extends Courrier {
	private double poids;
	private String format;
	
	Lettre(boolean mode,String adress,double poids,String format){
		super(mode,adress);
		this.poids=poids;
		if(format.toUpperCase().equals("A3") ||format.toUpperCase()=="A4" ) {
			this.format=format.toUpperCase();
		}
	}
	
	 public String toString() {
		 
		 return (super.toString() + "poids:"+this.poids+"format:"+this.format);
		 
	 }
	public void decrire() {
		//super.decrire();
		System.out.println(this.toString());
		
		
	}
	public double affranchir() {
		double tarif_base;
		if(this.format=="A4") {
			tarif_base=2.50;
		}
		else {
			tarif_base=3.50;
		}
		double montant=tarif_base+0.5*this.poids;
		if(super.mode==false){
			return  montant;
		}
		else {
			return montant *2;
		}
	}
	
	
	
	
	
	

}
