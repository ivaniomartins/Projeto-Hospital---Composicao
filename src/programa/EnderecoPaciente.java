package programa;

public class EnderecoPaciente {
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;

	public EnderecoPaciente() {

	}

	public EnderecoPaciente(String rua, String bairro, String cidade, String estado) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String toString() {

		return rua + ", " + bairro + ", " + cidade + ", " + estado;
	}
}
