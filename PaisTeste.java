


import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaisTeste {
	Pais pais, copia;
	PaisService paisService;
	static int PaisId = 0;

	
	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
		pais = new Pais();
		pais.setPaisId(PaisId);
		pais.setPaisNome(Franca);
		pais.setPaisPopulacao(354656);
		pais.setPaisArea(4321);
		copia = new Pais();
		copia.setPaisId(PaisId);
		copia.setPaisNome(Franca);
		copia.setPaisPopulacao(354656);
		copia.setPaisArea(4321);
		paisService = new PaisService();
		System.out.println(pais);
		System.out.println(copia);
		System.out.println(PaisId);
	}
	
	@Test
	public void test00Carregar() {
		System.out.println("carregar");
		
		Pais fixture = new Pais();
		fixture.setPaisId(1);
		fixture.setPaisNome(Australia);
		fixture.setPaisPopulacao(4321);
		fixture.setPaisPopulacao(344656);
		PaisService novoService = new PaisService();
		Pais novo = novoService.carregar(1);
		assertEquals("testa inclusao", novo, fixture);
	}

	@Test
	public void test01Criar() {
		System.out.println("criar");
		PaisId = paisService.criar(pais);
		System.out.println(PaisId);
		copia.setPaisId(PaisId);
		assertEquals("testa criacao", pais, copia);
	}

	@Test
	public void test02Atualizar() {
		System.out.println("atualizar");
		pais.setPaisPopulacao(999999);
		copia.setPaisPopulacao(999999);		
		paisService.atualizar(pais);
		pais = paisService.carregar(pais.getPaisId());
		assertEquals("testa atualizacao", pais, copia);
	}

	@Test
	public void test03Excluir() {
		System.out.println("excluir");
		copia.setPaisId(-1);
		copia.setPaisNome(null);
		copia.setPaisPopulacao(null);
		copia.setPaisArea(null);
		paisService.excluir(PaisId);
		pais = paisService.carregar(PaisId);
		assertEquals("testa exclusao", pais, copia);
	}
}