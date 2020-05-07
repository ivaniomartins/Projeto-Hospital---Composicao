package programa;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Paciente {
	private String nmPaciente;
	private String sexo;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dtNascimento;

	List<EnderecoPaciente> enderecopaciente = new ArrayList<>();

	public Paciente(String nmPaciente, String sexo, Date dtNascimento) {

		this.nmPaciente = nmPaciente;
		this.sexo = sexo;
		this.dtNascimento = dtNascimento;
	}

	public String getNmPaciente() {
		return nmPaciente;
	}

	public void setNmPaciente(String nmPaciente) {
		this.nmPaciente = nmPaciente;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public List<EnderecoPaciente> getEnderecopaciente() {
		return enderecopaciente;
	}

	public void AddEndereco(EnderecoPaciente endereco) {

		enderecopaciente.add(endereco);
	}

	public void RemoveEndereco(EnderecoPaciente endereco) {

		enderecopaciente.remove(endereco);
	}

       public String TipoSexo(String sexo) {
    	   String tipo = null;
    	   
    	   if (sexo == "Masculino") {
    		   tipo = String.valueOf('M');
    	   }
    	   else if (sexo == "Feminino") {
    		   tipo = String.valueOf('F');
    		   
    	   }
    	 return tipo;
       }

	public String toString() {

		return nmPaciente + " (" + sdf.format(dtNascimento) + ")  " + "\n" 
		                  +  getSexo() + "\n"
		                  + enderecopaciente;

	}

}
