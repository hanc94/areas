import java.lang.*;
public class Calculos{
	boolean t=true;
	public void CirculoArea(int r){
		System.out.println("El area del circulo es: "+r*r);
	}
	public void CuadradoArea(int m,int n){
		System.out.println("El area del rectangulo es: "+m*n);
	}
	public void CirculoDiametro(int r){
		System.out.println("El diametro del circulo es: "+(2*3.1416*r));
	}
	public void CuadradoDiametro(int m,int n){
		int r=2*m+2*n;		
		System.out.println("El diametro del rectangulo es: "+r);
	}
}
