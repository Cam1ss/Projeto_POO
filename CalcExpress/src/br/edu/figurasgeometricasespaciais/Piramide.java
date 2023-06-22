package br.edu.figurasgeometricasespaciais;

public class Piramide extends HerancaEspacial{
    
	private double arestaBase;
	private double altura;
	private double areaBase;
	private double apotema;
	private double faceLateral;
	
	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAreaBase() {
		return areaBase;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public double getFaceLateral() {
		return faceLateral;
	}

	public void calcAreaTotal() {
		   areaBase = Math.pow(arestaBase, 2);
		   faceLateral = arestaBase * apotema/2;
		   areaTotal = areaBase + 4 * faceLateral;
			 
	}
	
	public void calcVolume() {
			  areaBase = Math.pow(arestaBase, 2);
			  volume = areaBase * altura/3;  
	}
	
	public void listaAtributos () {
		System.out.println("\nATRIBUTOS\n\nAresta da Base: " + arestaBase /* ", Área da Base: " + areaBase + ", Face Lateral: " + faceLateral + ", Área Total: " + areaTotal + " e Volume: " + volume*/);
		if (apotema > 0) {
			System.out.println("Apótema: " + apotema);
		}
		if (altura > 0) {
			System.out.println("Altura: " + altura);
		}
	}
	
}