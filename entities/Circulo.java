package entities;
public  class Circulo implements IAreaCalculavel {

	final double PI = 3.14;
	
	public Circulo(){
		
		
	}
	
	
	Circulo(double pi){
		
	}
	
	

	public double getPI() {
		return PI;
	}

	@Override
	public double areaRetangulo(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double areaCirculo(double raio) {
		
		return Math.PI * raio * raio;
	}


	@Override
	public double areaQuadrado(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
	
}
