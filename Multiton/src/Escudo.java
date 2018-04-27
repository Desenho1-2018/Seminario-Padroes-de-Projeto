
public final class Escudo {
	private static Escudo instancia_escudo;
	private int defesa = 10;
	private float durabilidade = 50;
	private String nome = "Bacia";
	
	private Escudo() {}
	
	public static synchronized Escudo obterInstancia() {
		
		
		if(instancia_escudo == null) {
		
			instancia_escudo = new Escudo();
			return instancia_escudo;
		
		} else {
			
			return instancia_escudo;
			
		}	
	}
	

	public int retornaDefesa() {
		return this.defesa;
	}
	
	public float retornaDurabilidade() {
		return this.durabilidade;
	}
	
	public String retornaNome() {
		return this.nome;
	}
	
}
