package Encapsulamento;

public class Funcionarios {
	public String nome;
	public String End;
	private Double Salario;
	private int QtdFilho;
	private String CPF;
	private String RG;
	private String Cel;
	private String email;
	//Retornar valor setado do salario
	public Double getSalario() {
		return Salario;
	}//Setar valor do salario
	public void setSalario(Double salario) {
		Salario = salario;
	}
	public int getQtdFilho() {
		return QtdFilho;
	}
	public void setQtdFilho(int qtdFilho) {
		QtdFilho = qtdFilho;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getCel() {
		return Cel;
	}
	public void setCel(String cel) {
		Cel = cel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
