package Heranca_Atividade;

public class principal {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("luis_Fernando","Senai",4000,"(15)586886","vila rio branco","??/??/????");
		System.out.println("\nFuncionario: ");
		System.out.println("Nome: "+ funcionario.getNome());
		System.out.println("Matricula: "+ funcionario.getMatricula());
		System.out.println("Salario: "+ funcionario.getSalario());
		System.out.println("Telefone: "+ funcionario.getTelefone());
		System.out.println("Endereço: "+ funcionario.getEndereco());
		System.out.println("Data de nascimento: "+ funcionario.getDataNascimento());
		
		Administrador administrador = new Administrador("Lucas_Henrique","Senai",10000,"(15)986876","vila Barte","??/??/????",156878);
		System.out.println("\nAdministrador: ");
		System.out.println("Nome: "+ administrador.getNome());
		System.out.println("Matricula: "+ administrador.getMatricula());
		System.out.println("Salario: "+ administrador.getSalario());
		System.out.println("Telefone: "+ administrador.getTelefone());
		System.out.println("Endereço: "+ administrador.getEndereco());
		System.out.println("Data de nascimento: "+ administrador.getDataNascimento());
		System.out.println("CRA: "+ administrador.getCra());
		
		Medico  medico = new Medico("Isabela_Inocente","Senai",8000,"(15)986876","vila barte","??/??/????",569855);
		System.out.println("\nMedico: ");
		System.out.println("Nome: "+ medico.getNome());
		System.out.println("Matricula: "+ medico.getMatricula());
		System.out.println("Salario: "+ medico.getSalario());
		System.out.println("Telefone: "+ medico.getTelefone());
		System.out.println("Endereço: "+ medico.getEndereco());
		System.out.println("Data de nascimento: "+ medico.getDataNascimento());
		System.out.println("CRA: "+ medico.getCrm());
		
		Engenheiro  engenheiro = new Engenheiro("Victor_Freitag","Senai",7000,"(15)986876","jardin leonel","??/??/????",998755);
		System.out.println("\nEngenheiro: ");
		System.out.println("Nome: "+ engenheiro.getNome());
		System.out.println("Matricula: "+ engenheiro.getMatricula());
		System.out.println("Salario: "+ engenheiro.getSalario());
		System.out.println("Telefone: "+ engenheiro.getTelefone());
		System.out.println("Endereço: "+ engenheiro.getEndereco());
		System.out.println("Data de nascimento: "+ engenheiro.getDataNascimento());
		System.out.println("CREA: "+ engenheiro.getNumCrea());
	}

}
