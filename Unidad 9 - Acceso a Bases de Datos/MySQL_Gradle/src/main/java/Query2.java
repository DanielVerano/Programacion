import java.sql.*;

public class Query2 {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3336/classicmodels?user=root&password=root");

            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);

//            Nombre y categoría de todos los productos
            ResultSet resultSet = statement.executeQuery("select productName, productLine from products");

            int rowsAffected = statement.executeUpdate("update products set buyPrice=100.0 where productCode='S10_1678'");
            System.out.println("Número de filas afectadas: " + rowsAffected);

            /*while (resultSet.next()) {
//                System.out.println("Nombre: " + resultSet.getString("productName"));
//                System.out.println("Categoría: " + resultSet.getString("productLine"));

                System.out.println("Nombre: " + resultSet.getString(1));
                System.out.println("Categoría: " + resultSet.getString(2));
                System.out.println("------------------");
            }*/
        } catch (SQLException e) {
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
