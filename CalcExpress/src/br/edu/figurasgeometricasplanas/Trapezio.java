package br.edu.figurasgeometricasplanas;


public class Trapezio extends HerancaPlana{
	
	private double baseMaior;
	private double baseMenor;
	private double altura;
	
	public double getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(double baseMaior) {
		   this.baseMaior = baseMaior;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		  this.baseMenor = baseMenor;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void CalcArea1() {
		area = (baseMenor + baseMaior) * altura/2;
	}
	
	public void listaAtributos() {
		System.out.println("\nATRIBUTOS \n\nbase maior: " + getBaseMaior() + "\nbase menor: " + getBaseMenor() + "\naltura: " + getAltura());	
	}
	
}
