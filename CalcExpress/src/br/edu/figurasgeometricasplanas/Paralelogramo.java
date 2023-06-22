package br.edu.figurasgeometricasplanas;

import java.util.Scanner;

public class Paralelogramo extends HerancaPlana{

	Scanner sc = new Scanner(System.in);
	
	private double base;
	private double altura;
	
	public void CalcArea1() {
		area = base * altura;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
		}

	public void listaAtributos() {
		System.out.println("\nATRIBUTOS \n\nbase: " + getBase() + "\naltura: " + getAltura());
	
	}
	
}