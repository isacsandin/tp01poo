package persistencia;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


import estoque.*;

public class PersistenciaEstoque {
	
	private static PersistenciaEstoque EstoqueInstance;
	private Connection conn;

	/**
	 * Conexão com banco de dados
	 * 
	 */
	private PersistenciaEstoque () {
		Conecta c = Conecta.getConnection();
		this.conn = c.conn;
	}
	 
	/**
	 * 
	 * Singleton. Usado para que haja apenas uma conexão com o banco sendo usada no sistema
	 */
	public static PersistenciaEstoque getInstance(){
		if(EstoqueInstance == null) {
			EstoqueInstance = new PersistenciaEstoque();
	    }
	    return EstoqueInstance;
	 }
	
	/**
	 * Removido
	 */
	public boolean save (){
		return true;
	}
	
/**
 * 
 * Salva uma compra
 * @param compra
 * @return true ao finalizar a compra
 */
	public boolean saveCompra (Compra compra){
		Statement stat;
		ArrayList<ItemCompra> itens = compra.overview();
		if (itens == null || itens.size() == 0){
			return false;
		}
		try {
			stat = conn.createStatement();
			stat.executeUpdate("insert into Compra (codFornecedor,data)" +
					"values('"+compra.getCnpjFornecedor()+"','"+compra.getDataCompra(null)+"')");
			for (ItemCompra itemCompra : itens) {
			stat.executeUpdate("insert into ItemCompra (CompraID,codItem,precoCompra,quant) " +
					"values((select max(id) from Compra),'"+itemCompra.getCodigoItem()+"','"+itemCompra.getPrecoCompra()+"','"+itemCompra.getQuant()+"')");
			}
			stat.close();
			Log.getLoginstance(null).info("Compra do fornecedor de CNPJ "+compra.getCnpjFornecedor()+" foi finalizada e registrada com sucesso em "+compra.getDataCompra(null));
			return true;
		} catch (SQLException e) {
			Log.getLoginstance(null).error("Ocorreu um erro: "+e.getMessage());
			return false;
		}
	}
	/**
	 * Salva um pedido
	 * 
	 * @param pedido
	 * @return boolean
	 */
	public boolean savePedido (Pedido pedido){
		Statement stat;
		ArrayList<ItemPedido> itens = pedido.overview();
		if (itens == null || itens.size() == 0){
			return false;
		}
		try {
			stat = conn.createStatement();
			stat.executeUpdate("insert into Pedido (codCliente,data)" +
					"values('"+pedido.getCpfCliente()+"','"+pedido.getDataPedido(null)+"')");
			for (ItemPedido itemPedido : itens) {
			stat.executeUpdate("insert into ItemPedido (pedidoID,codItem,precoPedido,quant) " +
					"values((select max(id) from Pedido),'"+itemPedido.getCodigoItem()+"','"+itemPedido.getPrecoPedido()+"','"+itemPedido.getQuant()+"')");
			}
			stat.close();
			return true;
		} catch (SQLException e) {
			Log.getLoginstance(null).error("Ocorreu um erro: "+e.getMessage());
			return false;
		}
	}
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private void getEstoque (){	
	}
	
	/**
	 * Pesquisa por um item quando inserido seu código
	 * 
	 * @param codigo
	 * @return o item (e suas informações)
	 */
	public Item searchItem (int codigo) {
		Statement stat;
		ResultSet rs;
		Item item = null;
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from Item where codigo='"+codigo+"'");
			if (rs.next()) {
				item = new Item(rs.getString("nome"),rs.getInt("codigo"),rs.getFloat("precoCusto"),rs.getFloat("margemLucro"),rs.getInt("quant"));
			}
			rs.close();
			stat.close();
			return item;
		} catch (SQLException e) {
			Log.getLoginstance(null).error("Ocorreu um erro: "+e.getMessage());
			return null;
		}
	}
	/**
	 * 
	 * Pesquisa por um item quando inserido seu nome
	 * @param nome
	 * @return o item (e suas informações 
	 */
	public Item searchItem (String nome) {
		Statement stat;
		ResultSet rs;
		Item item = null;
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from Item where nome='"+nome+"'");
			if (rs.next()) {
				item = new Item(rs.getString("nome"),rs.getInt("codigo"),rs.getFloat("precoCusto"),rs.getFloat("margemLucro"),rs.getInt("quant"));
			}
			rs.close();
			stat.close();
			return item;
		} catch (SQLException e) {
			Log.getLoginstance(null).error("Ocorreu um erro: "+e.getMessage());
			return null;
		}
	}
	
	/**
	 * 
	 * Remove um item a partir da informação do codigo
	 * @param codigo
	 * @return true se é possível remover o item
	 */
	public boolean delItem(int codigo){
		Statement stat;
		try {
			stat = conn.createStatement();
			stat.executeUpdate("delete from Item where codigo="+codigo);
			stat.close();
			return true;
		} catch (SQLException e) {
			Log.getLoginstance(null).error("Ocorreu um erro: "+e.getMessage());
			return false;
		}
	}
	
	/**
	 * 
	 * Remove um item a partir da informação do nome 
	 * @param nome
	 * @return true se é possível remover
	 */
	public boolean delItem(String nome){
		Statement stat;
		try {
			stat = conn.createStatement();
			stat.executeUpdate("delete from Item where nome="+nome);
			stat.close();
			return true;
		} catch (SQLException e) {
			Log.getLoginstance(null).error("Ocorreu um erro: "+e.getMessage());
			return false;
		}
	}
	
	/**
	 * 
	 * Cadastra um item novo no banco de dados
	 * @param item
	 * @return true se é possível cadastrar
	 */
	public boolean cadastro (Item item) {
		Statement stat;
		//ResultSet rs;
		try {
			stat = conn.createStatement();
			stat.executeUpdate("insert into Item (nome,codigo,precoCusto,margemLucro,quant) " +
					"values('"+item.getNome()+"','"+item.getCodigo()+"','"+item.getPrecoCusto()+"','"+item.getMargemLucro()+"','"+item.getQuant()+"')");
			stat.close();
			return true;
		} catch (SQLException e) {
			Log.getLoginstance(null).error("Ocorreu um erro: "+e.getMessage());
			return false;
		}
	}
	
	/**
	 * Remove a lista de itens do banco de dados
	 * 
	 */
	public void purge(){
		Statement stat;
		try {
			stat = conn.createStatement();
			stat.executeUpdate("delete from Item");
			stat.close();
		} catch (SQLException e) {
			Log.getLoginstance(null).error("Ocorreu um erro: "+e.getMessage());
		}
	}
	
	
	/**
	 * Retorna uma copia da lista de itens
	 */
	public ArrayList<Item> overview () {
		ArrayList<Item> itens = new ArrayList<Item>();
		Statement stat;
		ResultSet rs;
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from Item");
			while (rs.next()){
				Item item = new Item(rs.getString("nome"),rs.getInt("codigo"),rs.getFloat("precoCusto"),rs.getFloat("margemLucro"),rs.getInt("quant"));
				itens.add(item);	
			}
			rs.close();
			stat.close();
			return itens;
		} catch (SQLException e) {
			Log.getLoginstance(null).error("Ocorreu um erro: "+e.getMessage());
			return null;
		}
	}

	/**
	 * Finaliza um pedido
	 * @param pedido
	 * @throws IOException
	 */
	public boolean finalizarPedido(Pedido pedido){

		ArrayList<ItemPedido> listaPedido = pedido.overview();
		if (listaPedido == null || listaPedido.size() == 0){
			return false;
		}
	    for (ItemPedido item : listaPedido) {
	    	Item itemReferencia = this.searchItem(item.getCodigoItem());
	    	itemReferencia.setQuant(itemReferencia.getQuant()-item.getQuant());
	    }
		this.savePedido(pedido);
		return true;
	}
	

	/**
	 * Finaliza uma compra
	 * 
	 * @param compra
	 * @throws IOException
	 */
	public boolean finalizarCompra(Compra compra){
		ArrayList<ItemCompra> listaCompra = compra.overview();
		if (listaCompra == null || listaCompra.size() == 0){
			return false;
		}
	    for (ItemCompra item : listaCompra) {
	    	Item itemReferencia = this.searchItem(item.getCodigoItem());
	    	itemReferencia.setQuant(itemReferencia.getQuant() + item.getQuant());
	    	itemReferencia.setPrecoCusto(Estoque.calculaPrecoMedioPonderado(item));
	    }
		this.saveCompra(compra);
		return true;
	}
}
