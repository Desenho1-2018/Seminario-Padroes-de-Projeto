
public final class Espada {
	private static Espada instancia_espada;
	private int dano = 100;
	private float durabilidade = 100;
	private String nome = "Marieta";
	
	private Espada() {}
	
	
	public static Espada obterInstancia() {
		
		if(instancia_espada == null) {
		
			instancia_espada = new Espada();
			return instancia_espada;
		
		} else {
			
			return instancia_espada;
			
		}	
	}
	

	public int retornaDano() {
		return this.dano;
	}
	
	public float retornaDurabilidade() {
		return this.durabilidade;
	}
	
	public String retornaNome() {
		return this.nome;
	}


	
	
}
