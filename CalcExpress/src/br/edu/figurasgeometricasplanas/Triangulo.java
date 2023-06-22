package br.edu.figurasgeometricasplanas;

public class Triangulo extends HerancaPlana{
   
	private double base;
	private double altura;
	
	public void setBase(double base) {
		   this.base = base;
		}

	public void setAltura(double altura) {
			   this.altura = altura;
			}
	
	public void calcArea1() {
		area = (base * altura)/2;
	}

	public void listaAtributos() {
		System.out.println("\nATRIBUTOS \n\nbase: " + base + "\naltura: " + altura);
	
	}
}