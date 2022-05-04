import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Query5 {
    public static void main(String[] args) {
//        Insertar una nueva categoría
        Connection connection = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre de la categoría:");
        String nombre = sc.nextLine();
        System.out.println("Introduce la descripción:");
        String desc = sc.nextLine();

        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3336/classicmodels?user=root&password=root");

            String sql = "INSERT INTO productlines (productLine, textDescription)\n" +
                    "VALUES(?,?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.setString(2, desc);

            int i = statement.executeUpdate();

//            Mostrar el resultado de la consulta
            System.out.println(i);

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
