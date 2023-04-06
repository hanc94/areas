public class Diametro extends Calculos{
	private int m,n,r;
	public static void main(String[] args){
		Diametro diametro= new Diametro();
		diametro.r=10;
		diametro.m=5;
		diametro.n=4;
		diametro.CuadradoDiametro(diametro.m,diametro.n);
		diametro.CirculoDiametro(diametro.r);
		System.out.println(diametro.t);
	}
}
