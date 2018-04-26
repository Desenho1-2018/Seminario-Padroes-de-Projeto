package meubuilder;

public class BuilderClient {

	public static void main(String[] args) {
		/* Construir casa de Concreto */
		CasaBuilder builder = new CasaConcretoBuilder();
		CasaBuilderDirector casaBuildDirector = new CasaBuilderDirector(builder);
		System.out.println(casaBuildDirector.construct());
		
		/* Construir casa de Madeira */
		builder = new CasaMadeiraBuilder();
		casaBuildDirector = new CasaBuilderDirector(builder);
		System.out.println(casaBuildDirector.construct());
	}

}
