/*b. Crie uma classe Pais com os atributos id (int), nome (String), populacao (long) e area
(double).
c. Crie um construtor com os campos, um construtor padr�o, gets e sets.
d. Crie os m�todos do CRUD de Pais.
e. Crie um m�todo que retorna o pa�s com maior n�mero de habitantes.
f. Crie um m�todo que retorna o pa�s com menor �rea.
g. Crie um m�todo que retorne um vetor de 3 pa�ses.
h. Crie uma classe de testes que, al�m de testar os CRUDs, teste tamb�m os m�todos
maiorPopulacao, menorArea e vetorTresPaises.*/

public class Pais {

	private static final int Pais = 0;
	private int id;
	private String nome;
	private long populacao;
	private double area;
	
	public Pais (int id, String nome, long populacao, double area) {
	this.id = id;
	this.nome = nome;
	this.populacao = populacao;
	this.area = area;
	}
	/////////////////////////////////////////////////////
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public long getPopulacao() {
		return populacao;
	}
	public double getArea() {
		return area;
	}
	
	///////////////////////////////////////////////////
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPopulacao(long populacao) {
		this.populacao = populacao;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
    /////////////////////////////////////////////////////
    public static long MaiorPopulacao (long populacao) {
		
		if (populacao > populacao - 1) {
			return populacao;
		}
		else {
			return 1;
		}
	
	}
	
	public static double MenorArea(double area) {
		
		if(area < area + 1 ) {
			return area;
		}
		else {
			return 1;
		}
		
	}
	
	public static int [] ListaPais() {
		int[] lista =  new int [3];
		 for(int i = 0; i < lista.length; i++) {
			 lista[i] = Pais;
		 }
		 
		 return lista;
	} 
	

}
