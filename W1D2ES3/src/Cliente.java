
public class Cliente {
	String codiceCliente;
	String nome;
	String cognome;
	String email;
	String dataIscrizione;
		
		public Cliente( String codiceCliente, String nome, String cognome, String email, String dataIscrizione) {
			this.codiceCliente = codiceCliente;
			this.nome = nome;
			this.cognome = cognome;
			this.email = email;
			this.dataIscrizione = dataIscrizione;
		}
		
		public void StampaDatiCliente() {
			System.out.println("Codice Cliente: " + this.codiceCliente);
			System.out.println("Nome Cliente: " + this.nome);
			System.out.println("Cognome: " + this.cognome );
			System.out.println("Email: " + this.email);
			System.out.println("dataIscrizione: " + this.dataIscrizione);
		}
}
