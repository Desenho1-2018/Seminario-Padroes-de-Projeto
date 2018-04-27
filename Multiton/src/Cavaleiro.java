
public class Cavaleiro {

	
	private String nome;
	private Espada arma;
	private Escudo escudo;
	private int level;
	
	
	public Cavaleiro(String n, Espada e, Escudo s , int l) {
		this.nome = n;
		this.arma = e;
		this.level = l;
		this.escudo = s;
	}
	
	public String retornaNome() {
		return this.nome;
	}
	
	public Espada retornaArma() {
		return this.arma;
	}
	
	public Escudo retornaEscudo(){
		return this.escudo;
		
	}
	
	public int retornaLevel() {
		return this.level;
	}
	
}