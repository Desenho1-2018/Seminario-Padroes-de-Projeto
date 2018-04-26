package meubuilder;

public class CasaMadeiraBuilder implements CasaBuilder {
	private Casa casa;
	
	public CasaMadeiraBuilder() {
		casa = new Casa();
	}

	@Override
	public CasaBuilder builderChao() {
		casa.setTipoChao("Madeira");
		return this;
	}

	@Override
	public CasaBuilder buildParede() {
		casa.setTipoParede("Madeira");
		return this;
	}

	@Override
	public CasaBuilder buildTelhado() {
		casa.setTipoTelhado("Madeira");
		return this;
	}

	@Override
	public Casa build() {
		return casa;
	}
	
}
