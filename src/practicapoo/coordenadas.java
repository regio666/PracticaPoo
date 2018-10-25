package practicapoo;

public class coordenadas {

	public static void main(String[] args) {
		
		Punto p1=new Punto();		
		p1.setX(3);
		p1.setY(4);
		p1.ImprimePunto(p1);
		
		Punto p2=new Punto(7,4);
		p2.ImprimePunto(p2);
		
		Punto p3=new Punto(p1);
		p3.setX(3);
		p3.setY(7);
		p3.ImprimePuntoToString();
		
		System.out.println("");
		System.out.print("La distancia entre los puntos ");
		p1.ImprimePuntoToString();
		System.out.print(" y ");
		p2.ImprimePuntoToString();
		System.out.print(" vale "+p1.Distancia(p1, p2));
	}

}
