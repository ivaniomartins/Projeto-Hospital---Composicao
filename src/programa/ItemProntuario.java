package programa;
public class ItemProntuario {

	private double qtdMedicamento;
	private double vlUnitario;

	private Medicamento medicamento;

	public ItemProntuario() {

	}

	public ItemProntuario(double qtdMedicamento, double vlUnitario, Medicamento medicamento) {

		this.qtdMedicamento = qtdMedicamento;
		this.vlUnitario = vlUnitario;
        this.medicamento = medicamento;	
	}

	public double getQtdMedicamento() {
		return qtdMedicamento;
	}

	public void setQtdMedicamento(double qtdMedicamento) {
		this.qtdMedicamento = qtdMedicamento;
	}

	public double getVlUnitario() {
		return vlUnitario;
	}

	public void setVlUnitario(double vlUnitario) {
		this.vlUnitario = vlUnitario;
	}


	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setProntuario(Medicamento medicamento) {
		this.medicamento = medicamento;
	}


	public double Vtotaliza(Double qtdMedicamento, Double vlUnitario) {

	double vlTotal = qtdMedicamento * vlUnitario;

		return vlTotal;
	}

	public String toString() {
	return	"Medicamento:  " + "\n"
		     + medicamento.getDsMedicamento() + "\n"
			 + "Quantidade:  " + "\n"		 
			 + qtdMedicamento + "\n"
			 + "Valor Unitário: " + "\n"
			 + vlUnitario + "\n"
			 + "Valor Total: " + "\n"
			 + String.format("%.2f", Vtotaliza(qtdMedicamento, vlUnitario));

		
	}

}
