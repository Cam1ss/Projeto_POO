package br.edu.figurasgeometricasespaciais;

public class Tetraedro extends HerancaEspacial{
	
	private double arestaBase;
	private double areaBase;
	
	public double getArestaBase() {
		return arestaBase;
	}
	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getAreaBase() {
		return areaBase;
	}
	
	 public void calcAreaTotal() {
		 areaTotal = Math.pow(getArestaBase(), 2) * Math.sqrt(3);
	
    }
	public void calcVolume() {
			 volume = Math.pow(getArestaBase(), 3)/12 * Math.sqrt(2);
	}
	
	public void listaAtributos () {
		System.out.println("\nATRIBUTOS\n\naresta da base: " + getArestaBase() /*+ "\naltura da base: " + getAlturaBase() + "\nárea da base: " + areaBase + "\naltura do tetraedro: " + getAltura() + ", Área Total: " + area + " e Volume: " + volume*/);
	}
}