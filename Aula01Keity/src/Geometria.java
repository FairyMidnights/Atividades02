import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Figura F1 = new Triangulo (3,3,3);
         Figura F2 = new Circulo (5);
         Figura F3 = new Retangulo(2,4,0);
         Figura F4 = new Quadrado (4,4,0);
         Figura F5 = new Losango (6,4,6);
         
		 ArrayList <Figura> lista = new ArrayList<Figura>();
		 
		 lista.add(F1);
		 lista.add(F2);
		 lista.add(F3);
		 lista.add(F4);
		 lista.add(F5);
		 
		 for (Figura fg : lista) {
		      System.out.println("Área da figura: " + fg.area());
		    }
		 
	}

}
