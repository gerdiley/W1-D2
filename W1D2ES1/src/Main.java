
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rettangolo r1 = new Rettangolo(10, 20);
		Rettangolo r2 = new Rettangolo(15, 25);
		
		r1.StampaRettangolo();
		
		StampaDueRettangoli(r1, r2);
		
	}
	
	

	private static void StampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
		// TODO Auto-generated method stub
//		area 1
	System.out.println("Area 1: " + r1.area());	
	System.out.println("Perimetro 1: "+r1.perimetro());	
	
	
//		area 2 
	System.out.println("Area2: " + r2.area());
	System.out.println("Perimetro2: " + r2.perimetro());
	
//		somma aree 
	System.out.println("Somma Aree: " + (r1.area() + r2.area()));
	
//		somma perimetri r2
	System.out.println("Somma Perimetri: " + (r1.perimetro() + r2.perimetro()));
	}

	
	
}
