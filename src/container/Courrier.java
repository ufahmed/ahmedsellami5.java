package container;

public class Courrier {
	protected boolean mode;
	private String adresse;
	private double tarif=0.5;
	
	
	Courrier(boolean mode,String adress){
		this.mode=mode;
		this.adresse=adress;
	}
	
	public boolean estValid() {
		boolean ok = false;
		//adresse.isEmpty()
		if(this.adresse!=null && this.adresse.length()>0) {
			 ok=true;
		}
		else if(this.adresse==null){
			ok=false;
			
		}
		return ok;
	}
	
	public String toString() {
		return ("mode:"+this.mode+"adresse:"+
	                       this.adresse+"tarif base:"+this.tarif);
	}
	public void decrire() {
		System.out.println(this.toString());
	}
	
	public double affranchir() {
		if(estValid()==true) {
			if(this.mode==true) {
				return this.tarif*2;
			}
			else{
				return this.tarif;
			}
		}
		else {
			return 0;
		}
	}
	
	
	
	
	
	

}
