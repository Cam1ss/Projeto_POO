package br.edu.figurasgeometricasplanas;

public class Losango extends HerancaPlana{

	private double diagonalMaior;
	private double diagonalMenor;
	
	public double getDiagonalMaior() {
		return diagonalMaior;
	}

	public void setDiagonalMaior(double diagonalMaior) {
		this.diagonalMaior = diagonalMaior;
	}

	public double getDiagonalMenor() {
		return diagonalMenor;
	}

	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}

	public void CalcArea1() {
		area = diagonalMaior * diagonalMenor/2;
	}
	
	
	public void listaAtributos() {
		System.out.println("\nATRIBUTOS \n\ndiagonal maior: " + getDiagonalMaior() + "\ndiagonal menor: " + getDiagonalMenor());
	
	}
	
}