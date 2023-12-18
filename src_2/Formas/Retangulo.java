package Formas;

public class Retangulo {
	private Double base;
	private Double altura;
	private Double area = 0.0;
	private Double perimetro = 0.0;
	
	public Retangulo(){}
	
	
	public Double getArea() {
		return area;
	}
	public void setArea() {
		this.area = this.base * this.altura;
	}
	public Double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro() {
		this.perimetro = 2 * (this.base + this.altura);
	}
	public Double getBase() {
		return base;
	}
	public void setBase(Double base) {
		this.base = base;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	} 

}
