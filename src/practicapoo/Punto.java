package practicapoo;

public class Punto {
	
	private double x;
	private double y;
	private int Npuntos;
	
	public Punto() {
		
	this.x=0;
	this.y=0;
	Npuntos++;
		
	}
	
	public Punto(double punto1, double punto2) {	//Constructor con parámetros
	
		this.x=punto1;
		this.y=punto2;
		Npuntos++;
		
	}
	
	public Punto(Punto puntos) { //Constructor copia
		this.x=puntos.x;
		this.y=puntos.y;
		this.Npuntos=puntos.Npuntos++;
	}
	
	public void setX(double puntoX) {
		this.x=puntoX;
	}
	
	public double getX() {
		return x;
	}
	
	public void setY(double puntoY) {
		this.y=puntoY;
	}
	
	public double getY() {
		return y;
	}
	
	public static double Distancia(Punto punto1, Punto punto2) {
		double distancia=0;
		distancia=Math.sqrt(((punto1.getX()-punto2.getX())*(punto1.getX()-punto2.getX()))+
                ((punto1.getY()-punto2.getY())*(punto1.getY()-punto2.getY())));
        return distancia;
	}
	
	public static double distanciaDesdeOrigen(Punto punto1){
        double distancia=0;
        double cateto1=punto1.getX();
        double cateto2=punto1.getY();
        distancia=Math.sqrt(cateto1*cateto1+cateto2*cateto2);
        return distancia;
    }
	
	public static double areaTriangulo(Punto punto1, Punto punto2, Punto punto3) {
		double area=0;
		double p=(punto1.getX()+punto2.getY()+punto3.getX())/2;
		area=Math.sqrt(p*(p-punto1.getX())*(p-punto2.getY())*(p-punto3.getX()));
		return area;		
	}
	
	
}
