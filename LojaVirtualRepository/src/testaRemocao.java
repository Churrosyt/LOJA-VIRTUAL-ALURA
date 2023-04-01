import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class testaRemocao {
	
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
		
		Statement stm = connection.createStatement();
		int loja = 1;
		stm.execute("DELETE FROM PRODUTO WHERE ID = %d" , loja);
		
		Integer linhasModificadas = stm.getUpdateCount();
		
		System.out.println("Quantidades de linha que foram modificadas: " + linhasModificadas);
		
		
		
	}

}
