import java.sql.*;
import java.util.Scanner;

public class Query3 {
    public static void main(String[] args) {
//        Pedir por consola un código de cliente y calcular el total de pagos que ha realizado
        Connection connection = null;
        Scanner sc = new Scanner(System.in);
        int codigo;

        System.out.println("Introduce el código de cliente:");
        codigo = sc.nextInt();

        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3336/classicmodels?user=root&password=root");

            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);

            ResultSet resultSet = statement
                    .executeQuery("select sum(p.amount) as total from payments p where p.customerNumber=" + codigo);

//            No es necesario iterar porque sabemos que la consulta devuelve una fila
            resultSet.next();

            //                System.out.println("Total de pagos para el cliente " + codigo + ": " + resultSet.getDouble(1));
            System.out.println("Total de pagos para el cliente " + codigo + ": " + resultSet.getDouble("total"));

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
