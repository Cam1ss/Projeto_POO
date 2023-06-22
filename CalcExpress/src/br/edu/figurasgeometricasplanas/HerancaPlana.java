/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.figurasgeometricasplanas;

public class HerancaPlana {
     
	protected double area;
	
	public double getArea() {
		return area;
	}
	
	public void Valid(double x) {
		if (x <= 0) {
			System.out.println("\nValor Inválido");
		}
	}
	
	
}
