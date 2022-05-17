import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consultas {

    public static List<ProductLine> getProductLines() {
        Connection connection = ConexionDB.getConnection();
        ArrayList<ProductLine> result = new ArrayList<>();

        try {
            PreparedStatement ps = connection.prepareStatement("SELECT *\n" +
                    "FROM productlines p ;");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ProductLine actual = new ProductLine();
                actual.setName(rs.getString(1));
                actual.setTextDescription(rs.getString(2));
                actual.setHtmlDescription(rs.getString(3));
//                actual.setImageUrl(rs.getString(4));      // Se puede obviar
                result.add(actual);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void categoriaMasVendida() {
        Connection connection = ConexionDB.getConnection();

        try {
            PreparedStatement ps = connection.prepareStatement("SELECT p.productLine , " +
                    "SUM(o.quantityOrdered) unidadesVendidas \n" +
                    "FROM orderdetails o\n" +
                    "INNER JOIN products p \n" +
                    "ON o.productCode = p.productCode \n" +
                    "GROUP BY p.productLine \n" +
                    "ORDER BY unidadesVendidas DESC LIMIT 1;");
            ResultSet rs = ps.executeQuery();
            rs.next();

            System.out.println("La categoría " + rs.getString(1) +
                    " es la que ha vendido más unidades con " + rs.getInt(2) +
                    " unidades");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
