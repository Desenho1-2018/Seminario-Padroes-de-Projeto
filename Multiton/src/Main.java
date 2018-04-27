
public class Main {

	public static void main(String[] args) {
		
		Cavaleiro cavaleiro1 = new Cavaleiro("Quixote", Espada.obterInstancia(), Escudo.obterInstancia(), 10);
		Cavaleiro cavaleiro2 = new Cavaleiro("Arthur", Espada.obterInstancia(),Escudo.obterInstancia(), 9 );
		
		System.out.println("\n=========================Descricao dos cavaleiros criados==========================\n");
		System.out.println("Cavaleiro " + cavaleiro1.retornaNome() + " de level " + cavaleiro1.retornaLevel());
		System.out.println("Hash do cavaleiro: " + cavaleiro1.hashCode());
		System.out.println("A arma do cavaleiro " + cavaleiro1.retornaNome() + " eh a " + cavaleiro1.retornaArma().retornaNome());
		System.out.println("Descricao da arma do cavaleiro " + cavaleiro1.retornaNome());
		System.out.println("Nome : " + cavaleiro1.retornaArma().retornaNome());
		System.out.println("Dano : " + cavaleiro1.retornaArma().retornaDano());
		System.out.println("Durabilidade : " + cavaleiro1.retornaArma().retornaDurabilidade());
		System.out.println("Hash da arma: " + cavaleiro1.retornaArma().hashCode() + "\n");
		System.out.println("O Escudo do cavaleiro " + cavaleiro1.retornaNome() + " eh a " + cavaleiro1.retornaEscudo().retornaNome());
		System.out.println("Descricao do ascudo do cavaleiro " + cavaleiro1.retornaNome());
		System.out.println("Nome : " + cavaleiro1.retornaEscudo().retornaNome());
		System.out.println("Defesa : " + cavaleiro1.retornaEscudo().retornaDefesa());
		System.out.println("Durabilidade : " + cavaleiro1.retornaEscudo().retornaDurabilidade());
		System.out.println("Hash da arma: " + cavaleiro1.retornaEscudo().hashCode() + "\n");
		System.out.println("Cavaleiro " + cavaleiro2.retornaNome() + " de level " + cavaleiro2.retornaLevel());
		System.out.println("Hash do cavaleiro: " + cavaleiro2.hashCode());
		System.out.println("A arma do cavaleiro " + cavaleiro2.retornaNome() + " eh a " + cavaleiro2.retornaArma().retornaNome());
		System.out.println("Descricao da arma do cavaleiro " + cavaleiro2.retornaNome());
		System.out.println("Nome : " + cavaleiro2.retornaArma().retornaNome());
		System.out.println("Dano : " + cavaleiro2.retornaArma().retornaDano());
		System.out.println("Durabilidade : " + cavaleiro2.retornaArma().retornaDurabilidade());
		System.out.println("Hash da arma: " + cavaleiro2.retornaArma().hashCode() + "\n");
		System.out.println("O escudo do cavaleiro " + cavaleiro2.retornaNome() + " eh a " + cavaleiro2.retornaEscudo().retornaNome());
		System.out.println("Descricao do escudo do cavaleiro " + cavaleiro2.retornaNome());
		System.out.println("Nome : " + cavaleiro2.retornaEscudo().retornaNome());
		System.out.println("Defesa : " + cavaleiro2.retornaEscudo().retornaDefesa());
		System.out.println("Durabilidade : " + cavaleiro2.retornaEscudo().retornaDurabilidade());
		System.out.println("Hash da arma: " + cavaleiro2.retornaEscudo().hashCode() + "\n");
		System.out.println("=================================================================================\n");
		
	}

}