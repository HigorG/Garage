
public class Carro {
	private	String modelo;
	private	String placa;
	private int	   ano;
	private	String cor;


	public Carro() {
		
	}
	public String getModelo() {
		return this.modelo;
	}

	public String getPlaca() {
		return this.placa;
	}
	public int getAno() {
		return this.ano;
	}
	public String getCor() {
		return this.cor;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setCor(String cor) {
		this.cor=cor;
	}
	public void Ligar() {
		System.out.println("Carro"+this.modelo+"ligado");
	}
	public void Frear() {
		System.out.println("Carro"+this.modelo+"freado");
	}
	public void Direita() {
		System.out.println("Carro"+this.modelo+"Virado para direita");
	}
	public void Esquerda() {
		System.out.println("Carro"+this.modelo+"Virado para esquerda");
	}
	public void Semgasolina() {
		System.out.println("Carro"+this.modelo+"Carro está sem Gasolina");
	}
	
}

 