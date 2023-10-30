package container;

public class Colis extends Courrier{
	private double poids;
	private double volume;
	
	Colis(boolean mode, String adress,double poids,double litre) {
		super(mode, adress);
		this.poids=poids;
		this.volume=litre;
		
	}
	
	 public String toString() {
		 return (super.toString()+"poids:"+this.poids+"volume:"+this.volume);
		 
	 }
	public void decrire() {
		System.out.println(this.toString());
		
		
	}
	
	public double affranchir() {
		return 0.25*this.volume+this.poids*1.0;
	}
	
	

}
