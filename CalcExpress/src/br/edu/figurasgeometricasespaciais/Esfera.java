package br.edu.figurasgeometricasespaciais;


public class Esfera extends HerancaEspacial{

	private double raio;
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		if (raio > 0) {
		  this.raio = raio;
		}
	}
	public double getArea() {
		return areaTotal;
	}
	
	public void calcAreaTotal() {
		areaTotal = 4 * Math.PI * Math.pow(raio, 2);
	}
	public void calcVolume() {
		volume = 4 * Math.PI/3 * Math.pow(raio, 3);
	}
	public void listaAtributos () {
		System.out.println("\nraio: " + getRaio() /*+ ", Área Total: " + area + " e Volume: " + volume*/);
	}
}