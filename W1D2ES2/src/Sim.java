
public class Sim {
	String numero;
	double credito = 0;
	String[][] ultimeChiamate;
	
	public Sim (String numero, double credito, String[][] ultimeChiamate) {
		this.numero = numero;
		this.credito = credito;
		this.ultimeChiamate  = ultimeChiamate;}
		
		
	public void stampaDati(){
		System.out.println("numero:" + numero);
		System.out.println("credito:" + credito);
		System.out.println("numero:" + java.util.Arrays.deepToString(ultimeChiamate));
	}	

}