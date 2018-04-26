
public class Cavaleiro {

	private String nome;
	private Espada arma;
	private int level;
	
	public Cavaleiro(String n, Espada e, int l) {
		this.nome = n;
		this.arma = e;
		this.level = l;
	}
	
	public String retornaNome() {
		return this.nome;
	}
	
	public Espada retornaArma() {
		return this.arma;
	}
	
	public int retornaLevel() {
		return this.level;
	}
	
}
