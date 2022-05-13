import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {

    public static void transaccionUna() {
        Connection con = ConexionBD.getConnection();

        try {
            con.setAutoCommit(false);

            PreparedStatement ps1 = con.prepareStatement("INSERT INTO customers \n" +
                    "VALUES(?,?,?,?,?,?,NULL,?,NULL,NULL,?,NULL,NULL);");
            ps1.setInt(1, 500);
            ps1.setString(2, "Nuevo cliente");
            ps1.setString(3, "Pepe");
            ps1.setString(4, "Perez");
            ps1.setString(5, "12345678");
            ps1.setString(6, "Una dirección");
            ps1.setString(7, "Sevilla");
            ps1.setString(8, "España");

            PreparedStatement ps2 = con.prepareStatement("INSERT INTO payments \n" +
                    "VALUES(?,?,?,?),\n" +
                    "\t(?,?,?,?);");
            ps2.setInt(1, 500);
            ps2.setString(2, "ABCD1234");
            ps2.setString(3, "2022-05-11");
            ps2.setDouble(4, 1234.56);

            ps2.setInt(5, 500);
            ps2.setString(6, "EFGH5678");
            ps2.setString(7, "2022-05-12");
            ps2.setDouble(8, 2345.67);

            System.out.println(ps1.executeUpdate());
            System.out.println(ps2.executeUpdate());

            con.commit();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public static void transaccionDos() {
        Connection con = ConexionBD.getConnection();

        try {
            con.setAutoCommit(false);

            PreparedStatement ps1 = con.prepareStatement("INSERT INTO offices \n" +
                    "VALUES(?,?,?,?,NULL,NULL,?,?,?);");
            ps1.setInt(1, 8);
            ps1.setString(2, "Tokyo");
            ps1.setString(3, "+81 12345678");
            ps1.setString(4, "Nueva dirección Tokyo");
            ps1.setString(5, "Japón");
            ps1.setString(6, "1234-5678");
            ps1.setString(7, "Japón");

            PreparedStatement ps2 = con.prepareStatement("UPDATE employees \n" +
                    "SET officeCode = 8\n" +
                    "WHERE officeCode IN \n" +
                    "\t(\n" +
                    "\tSELECT o.officeCode \n" +
                    "\tFROM offices o \n" +
                    "\tWHERE o.city = 'Tokyo'\n" +
                    "\t);");

            System.out.println(ps1.executeUpdate());
            System.out.println(ps2.executeUpdate());

            con.commit();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
