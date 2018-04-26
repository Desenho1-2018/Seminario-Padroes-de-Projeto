package meubuilder;

public class CasaBuilderDirector {
	private CasaBuilder builder;
	
	public CasaBuilderDirector(final CasaBuilder builder) {
		this.builder = builder;
	}
	public Casa construct() {
		return builder.builderChao().buildParede().buildTelhado().build();
	}
}
