/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.figurasgeometricasespaciais;

public class HerancaEspacial {
   
	protected double areaTotal;
	protected double volume;
	
	public double getAreaTotal() {
		return areaTotal;
	}
	
	public double getVolume() {
		return volume;
	}
	
	public void Valid(double x) {
		if (x <= 0) {
			System.out.println("\nValor Inválido");
		}
	}
	
}