import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {

    public static void insertarPedido() {
        Connection connection = ConexionDB.getConnection();

        try {
            connection.setAutoCommit(false);

            PreparedStatement ps1 = connection.prepareStatement("INSERT INTO orders \n" +
                    "VALUES(?,?,?,NULL,?,NULL,?);");
            ps1.setInt(1, 20000);
            ps1.setString(2, "2022-05-16");
            ps1.setString(3, "2022-05-17");
            ps1.setString(4, "In Process");
            ps1.setInt(5, 103);     // Código del cliente

            PreparedStatement ps2 = connection.prepareStatement("INSERT INTO orderdetails\n" +
                    "VALUES(?,?,?,?,?),\n" +
                    "\t(?,?,?,?,?);");
            ps2.setInt(1, 20000);
            ps2.setString(2, "S10_1678");
            ps2.setInt(3, 5);
            ps2.setInt(4, 100);
            ps2.setInt(5, 1);

            ps2.setInt(6, 20000);
            ps2.setString(7, "S10_1949");
            ps2.setInt(8, 10);
            ps2.setInt(9, 90);
            ps2.setInt(10, 2);

            System.out.println(ps1.executeUpdate());
            System.out.println(ps2.executeUpdate());

            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                e.printStackTrace();
            }
        }
    }
}
