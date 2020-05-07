
package programa;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prontuario {

	private Integer codProntuario;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dtCadastro;

	Paciente paciente;
	private List<Doencas> doenca = new ArrayList<>();
	private List<ItemProntuario> itemprontuario = new ArrayList<>();

	public Prontuario() {

	}

	public Prontuario(Integer codProntuario, Date dtCadastro, Paciente paciente) {

		this.codProntuario = codProntuario;
		this.dtCadastro = dtCadastro;
		this.paciente = paciente;

	}

	public Integer getCodProntuario() {
		return codProntuario;
	}

	public void setCodProntuario(Integer codProntuario) {
		this.codProntuario = codProntuario;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<Doencas> getDoenca() {
		return doenca;
	}
	
	public List<ItemProntuario> getItemProntuario() {
		return itemprontuario;
	}

	public void AddDoenca(Doencas nmDoenca) {

		doenca.add(nmDoenca);

	}

	public void RemovDoenca(Doencas nm_doenca) {

		doenca.remove(nm_doenca);

	}
	
	public void AddItem(ItemProntuario item) {

		itemprontuario.add(item);

	}

	public void RemovItem(ItemProntuario item) {

		itemprontuario.remove(item);

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Código do Prontuário: " + "\n");
		sb.append(codProntuario + "\n");
		sb.append("Nome do Paciente: " + "\n");
		sb.append(paciente.getNmPaciente() + "\n");
		sb.append("Data do Prontuário: " + "\n");
		sb.append(sdf.format(dtCadastro) + "\n");
		sb.append("Doença: " + "\n");
		for (Doencas doencas: doenca) {
			sb.append(doencas + "\n");}
		sb.append("Itens:" + "\n");
		for(ItemProntuario itemprontuario: itemprontuario) {
			sb.append(itemprontuario);
		}
		
		return sb.toString();
		

		
		/*return codProntuario + "\n" 
				+ sdf.format(dtCadastro) + "\n" 
				+ paciente.getNmPaciente() + "\n"				
		        + doenca + "\n"
		        + itemprontuario;*/
		        				
	}

}
