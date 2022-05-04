import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Query6 {
    public static void main(String[] args) {
//        Añadir una nueva categoría y un nuevo producto que pertenezca a esa categoría
//        Hacerlo realizando una transacción
        Connection connection = null;

        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3336/classicmodels?user=root&password=root");

            connection.setAutoCommit(false);

            String newCategoria = "insert into productlines (productLine, textDescription) \n" +
                    "VALUES('boniatos', 'boniatos');";
            String newProducto = "insert into products\n" +
                    "VALUES('s99_001', 'boniatos', 'boniatos', '1:1', 'EmpresaBoniatos', 'Boniatos', 1000, 2.5, 2.5);";

            PreparedStatement statement1 = connection.prepareStatement(newCategoria);
            PreparedStatement statement2 = connection.prepareStatement(newProducto);

            int i1 = statement1.executeUpdate();
            int i2 = statement2.executeUpdate();

            System.out.println(i1);
            System.out.println(i2);

            connection.commit();
        } catch (SQLException e) {
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    e.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
