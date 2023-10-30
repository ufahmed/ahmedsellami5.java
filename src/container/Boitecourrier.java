package container;

public class Boitecourrier {

	Courrier[] tab;
	
	public Boitecourrier(int n)
	{
		tab=new Courrier[n];
	}
	public double affranchir() {
		double total = 0;
		for(int i=0;i<tab.length;i++) {
			total=total+tab[i].affranchir();
			
			
			
		}
		return total;
		
	}
	
	public int courrierInvalid(){
		int nb=	0;
		for(int i=0;i<tab.length;i++) {
			if(tab[i].estValid()==false) {
				nb=nb+1;
				
			
		    }
		}
		return nb;	
	}
	public void affiche() {
		for(int i=0;i<tab.length;i++) {
			tab[i].decrire();
			
		}
	}
		
}

