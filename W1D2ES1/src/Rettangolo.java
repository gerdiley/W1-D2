
public class Rettangolo {
	
	double altezza;
	double larghezza;

	public Rettangolo(double altezza, double larghezza) {
		// TODO Auto-generated constructor stub
		this.altezza = altezza;
		this.larghezza = larghezza;
	}

	public double area() {
		return this.larghezza * this.altezza;
	}
	
	public double perimetro() {
		return (this.altezza*2) + (this.larghezza*2);
	}
	
	public void StampaRettangolo() {
		
		System.out.println("Area:" + this.area());
		System.out.println("Perimetro:" + this.perimetro());
		
	}
}



