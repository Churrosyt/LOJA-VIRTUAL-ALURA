import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class testaRemocao {
	
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
		
		PreparedStatement stm = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");
		stm.setInt(1, 2);
		stm.execute();
		
		Integer linhasModificadas = stm.getUpdateCount();
		
		System.out.println("Quantidades de linha que foram modificadas: " + linhasModificadas);
		stm.close();
		connection.close();
		
		
		
	}

}
