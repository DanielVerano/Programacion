import java.sql.*;
import java.util.Scanner;

public class Query4 {
    public static void main(String[] args) {
//        Nombre de los empleados de una oficina
//        (Pedir el código por teclado)
//        Consulta utilizando PreparedStatement (para evitar SQLInjections)
        Connection connection = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el código de la oficina:");
        int codigo = sc.nextInt();

        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3336/classicmodels?user=root&password=root");

//            Preparamos la consulta que vamos a hacer
//            Los ? determinan los valores que vamos a reemplazar después
            String sql = "SELECT e.firstName , e.lastName \n" +
                    "FROM employees e \n" +
                    "WHERE e.officeCode = ?";

            PreparedStatement statement = connection.prepareStatement(sql);

//            Reemplazamos el parámetro 1 por el código que le hemos pasado
            statement.setString(1, String.valueOf(codigo));

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString(1));
                System.out.println("Apellidos: " + rs.getString(2));
                System.out.println("-----------------");
            }

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
