import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Consultas {

    public static void empleadosOficinaMayor() {
        Connection con = ConexionBD.getConnection();

        try {
            PreparedStatement ps1 = con.prepareStatement("SELECT e.officeCode  \n" +
                    "FROM employees e \n" +
                    "GROUP BY e.officeCode \n" +
                    "ORDER BY COUNT(*) DESC LIMIT 1;");
            PreparedStatement ps2 = con.prepareStatement("SELECT *\n" +
                    "FROM employees e \n" +
                    "WHERE e.officeCode = ?;");

            ResultSet rs1 = ps1.executeQuery();
            rs1.next();
            int ofiMayor = rs1.getInt(1);

            ps2.setInt(1, ofiMayor);
            ResultSet rs2 = ps2.executeQuery();

            while (rs2.next()) {
                System.out.println("Número de empleado: " + rs2.getString(1));
                System.out.println("Apellido: " + rs2.getString(2));
                System.out.println("Nombre: " + rs2.getString(3));
                System.out.println("Extensión: " + rs2.getString(4));
                System.out.println("Email: " + rs2.getString(5));
                System.out.println("Número de oficina: " + rs2.getString(6));
                System.out.println("Código de empleado al que reporta: " + rs2.getString(7));
                System.out.println("Puesto de trabajo: " + rs2.getString(8));
                System.out.println("------------------");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void productosNoVendidos() {
        Connection con = ConexionBD.getConnection();

        try {
            PreparedStatement ps1 = con.prepareStatement("SELECT p.*\n" +
                    "FROM products p \n" +
                    "LEFT JOIN orderdetails o \n" +
                    "ON p.productCode = o.productCode \n" +
                    "WHERE o.productCode IS NULL;");
            ResultSet rs = ps1.executeQuery();

            while (rs.next()) {
                System.out.println("Código de producto: " + rs.getString(1));
                System.out.println("Nombre: " + rs.getString(2));
                System.out.println("Categoría: " + rs.getString(3));
                System.out.println("Escala: " + rs.getString(4));
                System.out.println("Vendedor: " + rs.getString(5));
                System.out.println("Descripción: " + rs.getString(6));
                System.out.println("Stock: " + rs.getString(7));
                System.out.println("Precio de compra: " + rs.getString(8));
                System.out.println("MSRP: " + rs.getString(9));
                System.out.println("-----------------");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void informeCategoria() {
        Connection con = ConexionBD.getConnection();
        Scanner sc = new Scanner(System.in);
        String categoria;

        System.out.println("Introduzca una categoría:");
        categoria = sc.nextLine();

        try {
            PreparedStatement ps1 = con.prepareStatement("SELECT p.productName , \n" +
                    "\tSUM(o.quantityOrdered) unidadesVendidas\n" +
                    "FROM products p \n" +
                    "INNER JOIN orderdetails o \n" +
                    "ON p.productCode = o.productCode \n" +
                    "WHERE p.productLine = ?\n" +
                    "GROUP BY p.productName ;");
            PreparedStatement ps2 = con.prepareStatement("SELECT SUM(o.quantityOrdered) totalUnidades\n" +
                    "FROM products p \n" +
                    "INNER JOIN orderdetails o \n" +
                    "ON p.productCode = o.productCode \n" +
                    "WHERE p.productLine = ?;");

            ps1.setString(1, categoria);
            ps2.setString(1, categoria);
            ResultSet rs1 = ps1.executeQuery();
            ResultSet rs2 = ps2.executeQuery();

            while (rs1.next()) {
                System.out.println("Nombre del producto: " + rs1.getString(1));
                System.out.println("Unidades vendidas: " + rs1.getInt(2));
                System.out.println("------------------");
            }

            rs2.next();
            System.out.println("Total de unidades vendidas: " + rs2.getInt(1));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
