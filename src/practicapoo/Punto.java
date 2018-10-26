package practicapoo;

public class Punto {
	
	private double x;
	private double y;
	private int Npuntos;
	
	public Punto() {
		
	this.x=0;
	this.y=0;
	this.Npuntos++;
		
	}
	
	public Punto(double punto1, double punto2) {	
	
		this.x=punto1;
		this.y=punto2;
		this.Npuntos++;
		
	}
	
	public Punto(Punto puntos) { 
		this.x=puntos.x;
		this.y=puntos.y;
		this.Npuntos++;
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
	
	public int getPuntos() {
		return Npuntos;
	}
	
	public static double Distancia(Punto punto1, Punto punto2) {
		double distancia=0;
		distancia=Math.sqrt(((punto1.getX()-punto2.getX())*(punto1.getX()-punto2.getX()))+
                ((punto1.getY()-punto2.getY())*(punto1.getY()-punto2.getY())));
        return distancia;
	}
	
	public double Distancia_Entre(Punto punto1, Punto punto2){
		double distancia=0;
		distancia=Math.sqrt(((punto1.getX()-punto2.getX())*(punto1.getX()-punto2.getX()))+
                ((punto1.getY()-punto2.getY())*(punto1.getY()-punto2.getY())));
        return distancia;
    }

	public static double areaTriangulo(Punto punto1, Punto punto2, Punto punto3) {
		double area=0;
		double p;
		double lado1,lado2,lado3=0;
		lado1=punto1.Distancia_Entre(punto1,punto2);
		lado2=punto2.Distancia_Entre(punto2,punto3);
		lado3=punto3.Distancia_Entre(punto3,punto1);
		p=(lado1+lado2+lado3)/2;
		area=Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3));
		return area;		
	}
	
	public static void ImprimePunto(Punto punto1) {
		System.out.print("(" +punto1.x+","+punto1.y+")"+"\n");		
	}
	
	public void ImprimePuntoIn() {
		System.out.print("(" +this.x+","+this.y+")");		
	}
	
	public void ImprimePuntoToString() {
		System.out.print("(" +String.valueOf(this.x)+","+String.valueOf(this.y)+")");		
	}
	
	public static void ImprimeArea(Punto punto1, Punto punto2, Punto punto3) {
		System.out.print(Punto.areaTriangulo(punto1, punto2, punto3));
	}

}
