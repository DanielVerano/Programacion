import java.sql.*;
import java.util.Scanner;

public class Consultas {

    public static void pagosCliente() {
        Connection con = ConexionDB.getConnection();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número de cliente: (customerNumber)");
        String numero = sc.nextLine();

        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT c.contactFirstName , c.contactLastName , c.country , SUM(p.amount) \n" +
                    "FROM customers c \n" +
                    "INNER JOIN payments p \n" +
                    "ON c.customerNumber = p.customerNumber \n" +
                    "WHERE c.customerNumber = " + numero);

            resultSet.next();

            System.out.println(resultSet.getString(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getString(3));
            System.out.println(resultSet.getString(4));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void infoPedido() {
        Connection con = ConexionDB.getConnection();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número de pedido:");
        String numero = sc.nextLine();

        try {
            PreparedStatement preparedStatement1 = con.prepareStatement("SELECT p.productName , o.priceEach , o.quantityOrdered , \n" +
                    "o.priceEach * o.quantityOrdered subpedido \n" +
                    "FROM orderdetails o \n" +
                    "INNER JOIN products p \n" +
                    "ON o.productCode = p.productCode \n" +
                    "WHERE o.orderNumber = ?;");
            PreparedStatement preparedStatement2 = con.prepareStatement("SELECT SUM(o.quantityOrdered * o.priceEach) \n" +
                    "FROM orderdetails o \n" +
                    "WHERE o.orderNumber = ?;");

            preparedStatement1.setString(1, numero);
            preparedStatement2.setString(1, numero);
            ResultSet resultSet = preparedStatement1.executeQuery();
            ResultSet total = preparedStatement2.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getInt(2));
                System.out.println(resultSet.getInt(3));
                System.out.println(resultSet.getInt(4));
            }

            total.next();
            System.out.println("Total del pedido: " + total.getString(1));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void datosJefe() {
        Connection con = ConexionDB.getConnection();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de un empleado: (employeeNumber)");
        String numEmpleado = sc.nextLine();
        try {
            PreparedStatement preparedStatement = con.prepareStatement("SELECT e2.firstName , e2.lastName\n" +
                    "FROM employees e\n" +
                    "LEFT JOIN employees e2\n" +
                    "ON e.reportsTo = e2.employeeNumber\n" +
                    "WHERE e.employeeNumber = ?;");
            preparedStatement.setString(1, numEmpleado);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println("Nombre del jefe: " + resultSet.getString(1));
                System.out.println("Apellidos del jefe: " + resultSet.getString(2));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void listarEmpleadosCiudad() {
        Connection con = ConexionDB.getConnection();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la ciudad de una oficina:");
        String nombre = sc.nextLine();

        try {
            PreparedStatement ps = con.prepareStatement("SELECT *\n" +
                    "FROM employees e \n" +
                    "INNER JOIN offices o \n" +
                    "ON e.officeCode = o.officeCode \n" +
                    "WHERE o.city = ?;");

            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            if (rs.getFetchSize() == 0) {
                System.out.println("No existen empleados para esa oficina");
            }

            while (rs.next()) {
                System.out.print(rs.getString(1) + " ");
                System.out.print(rs.getString(2) + " ");
                System.out.println(rs.getString(3));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
