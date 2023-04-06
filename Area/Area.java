public class Area extends Calculos{ 
	private int r,m,n;
	public static void main(String[] args){
		Area area= new Area();
		area.r=10;
		area.m=5;
		area.n=4;
		area.CuadradoArea(area.m,area.n);
		area.CirculoArea(area.r);
		System.out.println(area.t);
	}
}
