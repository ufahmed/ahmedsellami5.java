package container;

public class main {
	public static void main(String[] args) 
	{
		Boitecourrier b=new Boitecourrier(2);
		Lettre l1=new Lettre(true,"zefef",20,"A4");
		Colis  c1=new Colis(false,"azdazd",10.5,4.5);
		b.tab[0]=l1;
		b.tab[1]=c1;
		
		double x=b.affranchir();
		int n=b.courrierInvalid();
		b.affiche();
		
		
	}

}
