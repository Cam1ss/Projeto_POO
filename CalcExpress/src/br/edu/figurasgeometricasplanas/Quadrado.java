package br.edu.figurasgeometricasplanas;

import java.util.Scanner;

public class Quadrado extends HerancaPlana{
    
	private double lado;
	
	public void setLado(double lado) {
		  this.lado = lado;
	}
    
	Scanner sc = new Scanner(System.in);
	
	public void CalcArea1() {
		area = Math.pow(lado, 2);
	}
	
	
	public void listaAtributos() {
		System.out.println("\nATRIBUTO\n\nlado: " + lado);
	}
		
}
