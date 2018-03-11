
public class TestePais {
	 
	public static void main(String args[]){
	 
	 PaisDAO paisDAO = new PaisDAO();
	 
	 Pais pais = new Pais(0, null, 0, 0);
	 pais.setNome("Japao");
	 pais.setPopulacao(50686963);
	 pais.setArea(98798);
	 
	 paisDAO.save(pais);
	 
	 Pais pais1 = new Pais(0, null, 0, 0);
	 pais1.setId(01);
	 pais1.setNome("NOME NOVO");
	 pais1.setPopulacao(32);
	 pais1.setArea(1289);
	 
	 paisDAO.update(pais1);
	 
	 paisDAO.removeById(02);
	 
	 
	 for(Pais p : paisDAO.getPais()){
	 
	 System.out.println("NOME: " + p.getNome());
	 }
	 }
	
}
