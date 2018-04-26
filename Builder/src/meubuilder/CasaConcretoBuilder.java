package meubuilder;

public class CasaConcretoBuilder implements CasaBuilder {
	
	private Casa casa;

	public CasaConcretoBuilder() {
		casa = new Casa();
	}
	
	@Override
	public CasaBuilder builderChao() {
		casa.setTipoChao("Concreto");
		return this;
	}

	@Override
	public CasaBuilder buildParede() {
		casa.setTipoParede("Concreto");
		return this;
	}

	@Override
	public CasaBuilder buildTelhado() {
		casa.setTipoTelhado("Concreto");
		return this;
	}

	@Override
	public Casa build() {
		return casa;
	}
	
}
