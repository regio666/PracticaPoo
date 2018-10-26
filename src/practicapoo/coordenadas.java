package practicapoo;

import java.util.Scanner;

public class coordenadas {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		double x;
		double y;
		double lado4;
		double lado5;
		double lado6;
		
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
		
		Punto p4=new Punto();
		Punto p5=new Punto();
		Punto p6=new Punto();
		
		System.out.println("");
		System.out.print("Pimer punto X= ");
		x=sc.nextDouble();
		System.out.print("\n"+"Pimer punto Y= ");
		y=sc.nextDouble();
		p4.setX(x);
		p4.setY(y);
		
		System.out.print("\n"+"Segundo punto X= ");
		x=sc.nextDouble();
		System.out.print("\n"+"Segundo punto Y= ");
		y=sc.nextDouble();
		p5.setX(x);
		p5.setY(y);
		
		System.out.print("\n"+"Tercer punto X= ");
		x=sc.nextDouble();
		System.out.print("\n"+"Tercer punto Y= ");
		y=sc.nextDouble();
		p6.setX(x);
		p6.setY(y);
		
		System.out.print("El area del triángulo formada por los puntos: ");
		p4.ImprimePuntoToString();
		p5.ImprimePuntoToString();
		p6.ImprimePuntoToString();
		System.out.print(" cuyos lagos miden ");
		lado4=p4.Distancia_Entre(p4,p5);
		System.out.print(lado4+" ");
		lado5=p5.Distancia_Entre(p5,p6);
		System.out.print(lado5+" ");
		lado6=p6.Distancia_Entre(p6,p4);
		System.out.print(lado6+" ");
		System.out.print("vale ");
		p4.ImprimeArea(p4,p5,p6);
		
		System.out.println("\n"+"Número de puntos es de "+p1.getPuntos());
	}

}
