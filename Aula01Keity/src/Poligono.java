
public abstract class Poligono extends Figura {

	 public double altura, base, lado;
	 
	 public Poligono(double a, double b, double l) {
		  altura = a;
		  base = b;
		  lado = l;
	 }
	 
	 public double getAltura() {
		return altura; 
	 }
	 
	 public double getBase() {
		 return base;
	 }
	 
	 public double getLado() {
		 return lado;
	 }
	 
	 
	 public void setAltura(double a) {
		 altura = a;
	 }
	 
	 public void setBase(double b) {
		 base = b;
	 }
	 
	 public void setlado(double l) {
		 lado = l;
	 }
	 
	 public double area() {
			return 0;
		}
}
