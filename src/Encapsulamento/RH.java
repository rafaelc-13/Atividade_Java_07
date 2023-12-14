package Encapsulamento;

public class RH {
	public static void main(String[] args) {
		
		Funcionarios pessoa1 = new Funcionarios();
		pessoa1.nome = "Rafael";
		pessoa1.End = "Minha Rua, 101";
				
		//salario
		pessoa1.setSalario(2500.00);
		Double SalarioAtual = pessoa1.getSalario();
		
		//qtdfilho
		pessoa1.setQtdFilho(0);
		int Filhos = pessoa1.getQtdFilho();
		
		//CPF
		pessoa1.setCPF("111.222.323-77");
		String seuCPF = pessoa1.getCPF();
		
		//RG
		pessoa1.setRG("7777444");
		String seuRG = pessoa1.getRG();
		
		//Celular
		pessoa1.setCel("(81)9 9493-9090");
		String seuCel = pessoa1.getCel();
		
		//email
		pessoa1.setEmail("mecontratafullstack@gmai.com");
		String seuemail = pessoa1.getEmail();
		
		System.out.println("O Funcionario "+ pessoa1.nome);
		System.out.println("Tem o endereço "+ pessoa1.End);
		System.out.println("Seu salario é de "+ SalarioAtual);
		System.out.println("Ele possui "+ Filhos +" filhos");
		System.out.println("Seu CPF é "+ seuCPF);
		System.out.println("Seu RG é "+ seuRG);
		System.out.println("Numero para Contato: "+ seuCel);
		System.out.println("Para emails: "+ seuemail);
		
		
		
	}
}
