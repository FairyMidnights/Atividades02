


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class PaisDAO {
	public int criar(Pais pais) {
		String sqlInsert = "INSERT INTO Pais(PaisNome, PaisPopulacao, PaisArea) VALUES (?, ?, ?)";
		
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setChar(1, pais.getPaisNome());
			stm.setInt(2, pais.getPaisPopulacao());
			stm.setInt(3, pais.getPaisArea());
			stm.execute();
			String sqlQuery = "SELECT LAST_INSERT_ID()";
			try (PreparedStatement stm2 = conn.prepareStatement(sqlQuery);
					ResultSet rs = stm2.executeQuery();) {
				if (rs.next()) {
					pais.setPaisId(rs.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pais.getPaisId();
	}

	public void atualizar(Pais pais) {
		String sqlUpdate = "UPDATE Pais SET PaisNome=?, PaisPopulacao=?, PaisArea=? WHERE PaisId=?";
		
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
			stm.setChar(1, pais.getPaisNome());
			stm.setInt(2, pais.getPaisPopulacao());
			stm.setInt(3, pais.getPaisArea());
			stm.setInt(4, pais.getPaisId());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluir(int PaisId) {
		String sqlDelete = "DELETE FROM Pais WHERE PaisId = ?";
		
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setInt(1, PaisId);
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Pais carregar(int PaisId) {
		Pais pais = new Pais();
		pais.setPaisId(PaisId);
		String sqlSelect = "SELECT PaisNome, PaisPopulacao, PaisArea FROM Pais WHERE Pais.PaisId = ?";
		
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setInt(1, pais.getPaisId());
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					pais.setPaisNome(rs.getChar("PaisNome"));
					pais.setPaisPopulacao(rs.getInt("PaisPopulacao"));
					pais.setPaisArea(rs.getInt("PaisArea"));
				} else {
					pais.setPaisId(-1);
					pais.setPaisNome(null);
					pais.setPaisPopulacao(null);
					pais.setPaisArea(null);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return pais;
	}

}
