import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PaisDAO {
	public void save(Pais pais){
		 
		 
		 String sql = "INSERT INTO Pais(id, Nome, Populacao, Area)" + " VALUES(?,?,?,?)";
		 
		 Connection conn = null;
		 PreparedStatement pstm = null;
		 
		 try {
		
		 conn = ConnectionFactory.createConnectionToMySQL();
		
		 pstm = conn.prepareStatement(sql);
		 pstm.setInt(1, pais.getId());
		 pstm.setString(2, pais.getNome());
		 pstm.setLong(3, pais.getPopulacao());
		 pstm.setDouble(4, pais.getArea());
		 
		 pstm.execute();
		 
		 } catch (Exception e) {
		 
		 e.printStackTrace();
		 }finally{
		 
		 try{
		 if(pstm != null){
		 
		 pstm.close();
		 }
		 
		 if(conn != null){
		 conn.close();
		 }
		 
		 }catch(Exception e){
		 
		 e.printStackTrace();
		 }
		 }
		 }
		 
		 public void removeById(int id){
		 
		 String sql = "DELETE FROM Pais WHERE id = ?";
		 
		 Connection conn = null;
		 PreparedStatement pstm = null;
		 
		 try {
		 conn = ConnectionFactory.createConnectionToMySQL();
		 
		 pstm = conn.prepareStatement(sql);
		 
		 pstm.setInt(1, id);
		 
		 pstm.execute();
		 
		 } catch (Exception e) {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		 }finally{
		 
		 try{
		 if(pstm != null){
		 
		 pstm.close();
		 }
		 
		 if(conn != null){
		 conn.close();
		 }
		 
		 }catch(Exception e){
		 
		 e.printStackTrace();
		 }
		 }
		 }
		 
		 public void update(Pais pais){
		 
		 String sql = "UPDATE Pais SET Nome = ?, Populacao = ?, Area = ?" +
		 " WHERE id = ?";
		 
		 Connection conn = null;
		 PreparedStatement pstm = null;
		 
		 try {
		 conn = ConnectionFactory.createConnectionToMySQL();
		 
		 pstm = conn.prepareStatement(sql);
		 pstm.setString(1, pais.getNome());
		 pstm.setLong(2, pais.getPopulacao());
		 pstm.setDouble(3, pais.getArea());

		 pstm.setInt(4, pais.getId());
		 
		 pstm.execute();
		 
		 } catch (Exception e) {
		 
		 e.printStackTrace();
		 }finally{
		 
		 try{
		 if(pstm != null){
		 
		 pstm.close();
		 }
		 
		 if(conn != null){
		 conn.close();
		 }
		 
		 }catch(Exception e){
		 
		 e.printStackTrace();
		 }
		 }
		 }
		 
		 public List<Pais> getPais(){
		 
		 String sql = "SELECT * FROM Pais";
		 
		 List<Pais> pais = new ArrayList<Pais>();
		 
		 Connection conn = null;
		 PreparedStatement pstm = null;
		 ResultSet rset = null;
		 
		 try {
		 conn = ConnectionFactory.createConnectionToMySQL();
		 
		 pstm = conn.prepareStatement(sql);
		 
		 rset = pstm.executeQuery();
		 
		 while(rset.next()){
		 
		 Pais pais1 = new Pais(0, sql, 0, 0);
		
		 pais1.setId(rset.getInt("id"));
		 pais1.setNome(rset.getString("nome"));
		 pais1.setPopulacao(rset.getLong("populacao"));
		 pais1.setArea(rset.getDouble("area"));
		 pais.add(pais1);
		 }
		 } catch (Exception e) {
		 
		 e.printStackTrace();
		 }finally{
		 
		 try{
		 
		 if(rset != null){
		 
		 rset.close();
		 }
		 
		 if(pstm != null){
		 
		 pstm.close();
		 }
		 
		 if(conn != null){
		 conn.close();
		 }
		 
		 }catch(Exception e){
		 
		 e.printStackTrace();
		 }
		 }
		 
		 return getPais();
		 }
}
