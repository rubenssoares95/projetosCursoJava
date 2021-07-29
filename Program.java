package principal;

import entities.Funcionario;
import repositories.FuncionarioRepository;

public class Program {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setIdFuncionario(1);
		funcionario.setNome("Ana Paula");
		funcionario.setCpf("123.456.789-00");
		funcionario.setMatricula("2021-001");
		funcionario.setSalario(3000.00);
		
		System.out.println("\nDADOS DO FUNCIONARIO");
		System.out.println("\tId do Funcionario..: " + funcionario.getIdFuncionario());
		System.out.println("\tNome...............: " + funcionario.getNome());
		System.out.println("\tCPF................: " + funcionario.getCpf());
		System.out.println("\tMatricula..........: " + funcionario.getMatricula());
		System.out.println("\tSalario............: " + funcionario.getSalario());
		
		
		FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
		
			try {
				funcionarioRepository.gravarArquivo(funcionario);
				System.out.println("\nDados gravados com sucesso!");
			}
			catch (Exception e) {
				System.out.println("\nErro ao gravar arquivo!");
				System.out.println(e.getMessage());
			}
		
	}

}
