package persistenciaDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import persistenciaDB.Conecta;
import pessoas.Fornecedor;


	public class PersistenciaFornecedor {

		private static PersistenciaFornecedor FornecedorInstance;
		public Connection conn;
		
		private PersistenciaFornecedor () {
			Conecta c = Conecta.getConnection();
			this.conn = c.conn;
		}
		 
		public static PersistenciaFornecedor getInstance(){
			if(FornecedorInstance == null) {
				FornecedorInstance = new PersistenciaFornecedor();
		    }
		    return FornecedorInstance;
		 }
	/**
	 * 
	 */
	public boolean save (){
		return true;
	}
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private void getFornecedor (){	
	}
	/**
	 * 
	 */
	public Fornecedor searchFornecedor (String query) {
		Statement stat;
		ResultSet rs;
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from Fornecedor where cnpj = query or name = query");
			Fornecedor fornecedor = new Fornecedor(rs.getString("cnpj"),rs.getString("nome"),rs.getString("endereco"),rs.getString("telefone"));
			return fornecedor;
		} catch (SQLException e) {
			return null;
		}
	}
	/**
	 * 
	 */
	public boolean cadastro (Fornecedor fornecedor) {
		Statement stat;
		ResultSet rs;
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from Fornecedor where cnpj = "+fornecedor.getCnpj()+" or name ="+fornecedor.getNome());
			if ( ! rs.wasNull()){
				return false;
			}
			
			stat.executeUpdate("insert into Fornecedor (cnpj,nome,endereco,telefone) " +
					"values('"+fornecedor.getCnpj()+"','"+fornecedor.getNome()+"','"+fornecedor.getEndereco()+"','"+fornecedor.getTelefone()+"')");
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public boolean removerFornecedor(String query){
		Statement stat;
		try {
			stat = conn.createStatement();
			stat.executeUpdate("delete from Fornecedor wehre cpf = "+query+" or nome = "+query);
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public void purge(){
		Statement stat;
		try {
			stat = conn.createStatement();
			stat.executeUpdate("delete from Fornecedor");
		} catch (SQLException e) {
		}
	}
	
	/**
	 * 
	 */
	public ArrayList<Fornecedor> overview () {
		ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
		Statement stat;
		ResultSet rs;
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from Fornecedor");
			if (rs.wasNull()){
				return null;
			}
			while (rs.next()){
				Fornecedor fornecedor = new Fornecedor(rs.getString("cnpj"),rs.getString("nome"),rs.getString("endereco"),rs.getString("telefone"));
				fornecedores.add(fornecedor);	
			}
			return fornecedores;
		} catch (SQLException e) {
			return null;
		}
	}
}
