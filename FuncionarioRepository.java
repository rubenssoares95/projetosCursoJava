package repositories;
import java.io.File;
import java.io.PrintWriter;

import entities.Funcionario;

public class FuncionarioRepository {

		public void gravarArquivo(Funcionario funcionario) throws Exception {
			
			PrintWriter printWriter = new PrintWriter(new File("c:\\temp\\funcionario.txt"));
			
			printWriter.write("\nDADOS DO FUNCIONARIO");
			
			printWriter.write("\n\tId do Funcionario..: " + funcionario.getIdFuncionario());
			
			printWriter.write("\n\tNome...............: " + funcionario.getNome());
			
			printWriter.write("\n\tCPF................: " + funcionario.getCpf());
			
			printWriter.write("\n\tMatricula..........: " + funcionario.getMatricula());
			
			printWriter.write("\n\tSalario............: " + funcionario.getSalario());
			
			printWriter.flush();
			printWriter.close();
			
		}
}
