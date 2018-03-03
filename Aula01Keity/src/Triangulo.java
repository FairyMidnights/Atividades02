
public class Triangulo extends Poligono {

	public Triangulo(double a, double b,double l) {
		super(a, b, l);
		// TODO Auto-generated constructor stub
	}
	public double area() {
		return ((getAltura()*getBase()) / 2);
	}
}
