package br.edu.figurasgeometricasespaciais;

public class Cubo extends HerancaEspacial{
	private double lado;
	private double areaLateral;
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		  this.lado = lado;
	}
	
	public double getAreaLateral() {
		return areaLateral;
	}
	
	public void CalcAreaTotal() {
		areaTotal = Math.pow(lado, 2) * 6;
	}
	public void CalcAreaLateral() {
		areaLateral = Math.pow(lado, 2) * 4;
		
	}
	public void CalcVolume() {	
		volume = Math.pow(lado, 3);
	}
	public void listaAtributos() {
		System.out.println("\nATRIBUTO\n\nlado: " + getLado() /*+ ", Área Total: " + areaTotal + ", Área Lateral: " + areaLateral + "e Volume: " + volume*/);
	}
}
