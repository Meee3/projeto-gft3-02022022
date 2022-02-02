package entities;

public class Quadrado implements IAreaCalculavel {
	
	
	private double ladoA, ladoB;
	private double result;
	
	
	
	public Quadrado(){
		
	}
	
	public Quadrado(double a, double b){
	
		this.ladoA = a;
		this.ladoB = b;
		
	}
	

	@Override
	public double areaRetangulo(double a, double b) {
		return 0;
	}


	@Override
	public double areaCirculo(double raio) {
		return 0;
	}

	@Override
	public double areaQuadrado(double a, double b) {
		return a * b;
	}



	


	
	

	
	
	
	
	
	
	
	

	
	

}
