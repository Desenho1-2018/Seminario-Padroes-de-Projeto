package meubuilder;

public class Casa {
	private String tipoChao;
	private String tipoParede;
	private String tipoTelhado;
	
	public String getTipoChao() {
		return tipoChao;
	}
	public void setTipoChao(String tipoChao) {
		this.tipoChao = tipoChao;
	}
	public String getTipoParede() {
		return tipoParede;
	}
	public void setTipoParede(String tipoParede) {
		this.tipoParede = tipoParede;
	}
	public String getTipoTelhado() {
		return tipoTelhado;
	}
	public void setTipoTelhado(String tipoTelhado) {
		this.tipoTelhado = tipoTelhado;
	}
	public String toString() {
		return new String("\nConstruindo casa \n Tipo de chão: " + tipoChao + "\n Tipo de parede: " + tipoParede + "\n Tipo de telhado: " + tipoTelhado);
	}
	
}
