package br.edu.figurasgeometricasespaciais;

public class Prisma extends HerancaEspacial{
   
	private double arestaBase;
	private double arestaLateral;
	private double altura;
	private double alturaBase;
	private double areaFace;
	private double areaLateral;
	private double areaBase;
	
	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getArestaLateral() {
		return arestaLateral;
	}

	public void setArestaLateral(double arestaLateral) {
		this.arestaLateral = arestaLateral;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAlturaBase() {
		return alturaBase;
	}

	public void setAlturaBase(double alturaBase) {
		this.alturaBase = alturaBase;
	}

	public double getAreaFace() {
		return areaFace;
	}

	public double getAreaLateral() {
		return areaLateral;
	}


	public double getAreaBase() {
		return areaBase;
	}

	public void calcAreaFace() {
		areaFace = arestaBase * arestaLateral;
	}
	
	public void calcAreaLateral() {
				areaLateral = 3* arestaBase * arestaLateral;
			 }
	
	public void calcAreaTotal() {
		    calcAreaBase();
		    calcAreaLateral();
			areaTotal = 2 * areaBase + areaLateral;
	}	
	
	public void calcAreaBase() {
		    	  areaBase = Math.sqrt(3) * Math.pow(arestaBase, 2) / 4;
	}
	
	public void calcVolume() {
	    calcAreaBase();
		volume = areaBase * altura;
	}
	
	public void listaAtributos () {
		System.out.println("\nATRIBUTOS\n\nAresta da Base: " + arestaBase /*+ ", Altura da Base: " + alturaBase + ", Área da Base: " + areaBase + ", Área da Face: " + areaFace + ", Área Lateral: " + areaLateral + ", Altura do Prisma: " + altura /*+ ", Área Total: " + areaTotal + " e Volume: " + volume*/);
		if (arestaLateral > 0) {
			System.out.print("Aresta Lateral: " + arestaLateral);
		}
		if (altura > 0) {
			System.out.print("Altura do Prisma: " + altura);
		}
	}
	
}