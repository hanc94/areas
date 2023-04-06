import java.util.Scanner;
public class Main extends Calculos{
	public static void main(String[] arg){
		Scanner entrada= new Scanner(System.in);
		Main oper=new Main();
		int r,m,n,o1,o2;
		System.out.println("Calculo de Area y perimetro\nCirculos y rectangulos");
		System.out.println("Ingrese que calculo desea hacer:\n1)Area\n2)perimetro\n3)ambas");
		o1=entrada.nextInt();
		System.out.println("Ahora de que figura geometrica\n1)Circulo\n2)Rectangulo\n3)Ambas");
		o2=entrada.nextInt();
		switch (o1){
			case 1:
				switch (o2){
					case 1:
						System.out.println("ingrese radio del circulo");
						r=entrada.nextInt();
						oper.CirculoArea(r);
						break;
					case 2:
						System.out.println("ingrese lado a del rectangulo");
						m=entrada.nextInt();
						System.out.println("ingrese lado b del rectangulo");
						n=entrada.nextInt();
						oper.CuadradoArea(m,n);
						break;
					case 3:
						System.out.println("ingrese radio del circulo");
						r=entrada.nextInt();
						System.out.println("ingrese lado a del rectangulo");
						m=entrada.nextInt();
						System.out.println("ingrese lado b del rectangulo");
						n=entrada.nextInt();
						oper.CirculoArea(r);
						oper.CuadradoArea(m,n);
						break;
					default:
						System.out.println("ingreso una opción invalida");
						break;
				}
				break;
			case 2:
				switch (o2){
					case 1:
						System.out.println("ingrese radio del circulo");
						r=entrada.nextInt();
						oper.CirculoDiametro(r);
						break;
					case 2:
						System.out.println("ingrese lado a del rectangulo");
						m=entrada.nextInt();
						System.out.println("ingrese lado b del rectangulo");
						n=entrada.nextInt();
						oper.CuadradoDiametro(m,n);
						break;
					case 3:
						System.out.println("ingrese radio del circulo");
						r=entrada.nextInt();
						System.out.println("ingrese lado a del rectangulo");
						m=entrada.nextInt();
						System.out.println("ingrese lado b del rectangulo");
						n=entrada.nextInt();
						oper.CirculoDiametro(r);
						oper.CuadradoDiametro(m,n);
						break;
					default:
						System.out.println("ingreso una opción invalida");
						break;
				}
				break;
			case 3:
				switch (o2){
					case 1:
						System.out.println("ingrese radio del circulo");
						r=entrada.nextInt();
						oper.CirculoDiametro(r);
						oper.CirculoArea(r);
						break;
					case 2:
						System.out.println("ingrese lado a del rectangulo");
						m=entrada.nextInt();
						System.out.println("ingrese lado b del rectangulo");
						n=entrada.nextInt();
						oper.CuadradoArea(m,n);
						oper.CuadradoDiametro(m,n);
						break;
					case 3:
						System.out.println("ingrese radio del circulo");
						r=entrada.nextInt();
						System.out.println("ingrese lado a del rectangulo");
						m=entrada.nextInt();
						System.out.println("ingrese lado b del rectangulo");
						n=entrada.nextInt();
						oper.CirculoDiametro(r);
						oper.CirculoArea(r);
						oper.CuadradoDiametro(m,n);
						oper.CuadradoArea(m,n);
						break;
					default:
						System.out.println("ingreso una opción invalida");
						break;
				}
				break;
			default:
				System.out.println("ingreso una opción invalida");
				break;
		
		}
	}
}
