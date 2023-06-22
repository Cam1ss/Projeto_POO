package br.edu.figurasgeometricasplanas;

public class Circulo extends HerancaPlana{
	
	private double raio;
	
	public void setRaio(double raio) {
		  this.raio = raio;
	}

	public void CalcArea1() {
		area = Math.PI * Math.pow(raio, 2);
	}
	
	public void listaAtributos() {
		System.out.println("\nATRIBUTO\n\nraio: " + raio);
	
	}
	
}