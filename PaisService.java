
public class PaisService {
	PaisDAO dao = new PaisDAO();
	
	public int criar(Pais pais) {
		return dao.criar(pais);
	}
	
	public void atualizar(Pais pais){
		dao.atualizar(pais);
	}
	
	public void excluir(int PaisId){
		dao.excluir(PaisId);
	}
	
	public Pais carregar(int PaisId){
		return dao.carregar(PaisId);
	}

}
