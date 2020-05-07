package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import programa.Doencas;
import programa.EnderecoPaciente;
import programa.ItemProntuario;
import programa.Medicamento;
import programa.Paciente;
import programa.Prontuario;

public class CadPaciente {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner print = new Scanner(System.in);

		System.out.print("Informe o nome do Paciente: ");
		String NmPaciente = print.nextLine();
		System.out.print("Informe o Sexo: ");
		String Sexo = print.nextLine();
		System.out.print("Informe a Data de Nascimento DD/MM/YYYY: ");
		Date DtNascimento = sdf.parse(print.next());

		Paciente paciente = new Paciente(NmPaciente, Sexo, DtNascimento);

		System.out.println("Informe endereco: ");

		System.out.print("Rua: ");
		String Rua = print.next();
		print.nextLine();

		System.out.print("Bairro: ");
		String Bairro = print.nextLine();

		System.out.print("Cidade: ");
		String Cidade = print.nextLine();

		System.out.print("Estado: ");
		String Estado = print.nextLine();

		EnderecoPaciente enderecopaciente = new EnderecoPaciente(Rua, Bairro, Cidade, Estado);

		paciente.AddEndereco(enderecopaciente);

		System.out.println();

		System.out.println("Informe quantas doenças foram diagnósticas no paciente " + paciente.getNmPaciente());

		int n = print.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.print("Informe a doença diagnósticada: ");
			print.nextLine();
			String NmDoenca = print.nextLine();

			Doencas doencas = new Doencas(NmDoenca);

			System.out.println();
			System.out.println("Informe quantos medicamentos serão prescritos: ");
			int m = print.nextInt();

			for (int j = 1; j <= m; j++) {

				System.out.println("Informe o código da Prescrição:  ");
				int pront = print.nextInt();

				Prontuario prontuario = new Prontuario(pront, new Date(), paciente);

				prontuario.AddDoenca(doencas); 

				print.nextLine();

				System.out.println("Informe o nome do Medicamento: ");
				String NmMedic = print.nextLine();
				Medicamento medicamento = new Medicamento(NmMedic);

				System.out.println("Quantidade do medicamento:  " + NmMedic);
				double QtdMed = print.nextDouble();
				System.out.println("Valor unitário para cobrança: ");
				double VlUnit = print.nextDouble();

				System.out.println("Valor total do medicamento: " + NmMedic);

				ItemProntuario itemprontuario = new ItemProntuario(QtdMed, VlUnit, medicamento);

				System.out.println(itemprontuario.Vtotaliza(QtdMed, VlUnit));


				prontuario.AddItem(itemprontuario);

				System.out.println(paciente);

				System.out.println("-------------");

				System.out.println(prontuario);

			}

		}

		print.close();

	}

}
