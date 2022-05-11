import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {

    public static void transaccion1() {
        Connection con = ConexionDB.getConnection();

        try {
            con.setAutoCommit(false);

            PreparedStatement newOffice = con.prepareStatement("INSERT INTO offices \n" +
                    "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?);");
            newOffice.setString(1, "8");
            newOffice.setString(2, "Sevilla");
            newOffice.setString(3, "1234");
            newOffice.setString(4, "Direccion1");
            newOffice.setString(5, "NULL");
            newOffice.setString(6, "NULL");
            newOffice.setString(7, "Spain");
            newOffice.setString(8, "12345");
            newOffice.setString(9, "EMEA");

            PreparedStatement insertarEmpleados = con.prepareStatement("INSERT INTO employees \n" +
                    "VALUES(9998,'Pepe','Perez','x9998','pepe@pepe.com',8,NULL,'Sales Rep'),\n" +
                    "\t(9999,'Ana','Lopez','x9999','ana@ana.com',8,NULL,'Sales Rep');");

            PreparedStatement insertarCliente = con.prepareStatement("INSERT INTO customers \n" +
                    "VALUES(999,'Nuevo Cliente','Juan','Fernandez','1234','Direccion',NULL,'Sevilla',NULL,NULL,'España',9999,NULL);");

            System.out.println(newOffice.executeUpdate());
            System.out.println(insertarEmpleados.executeUpdate());
            System.out.println(insertarCliente.executeUpdate());

            con.commit();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public static void transaccion2() {
        Connection con = ConexionDB.getConnection();

        try {
            con.setAutoCommit(false);

            PreparedStatement ps1 = con.prepareStatement("INSERT INTO productlines \n" +
                    "VALUES(?,?,?,?);");
            ps1.setString(1, "Ferraris");
            ps1.setString(2, "Descripcion");
            ps1.setString(3, "NULL");
            ps1.setString(4, "NULL");

            PreparedStatement ps2 = con.prepareStatement("INSERT INTO products \n" +
                    "VALUES(?,?,?,?,?,?,?,?,?);");
            ps2.setString(1, "xyz-001");
            ps2.setString(2, "Testarrosa");
            ps2.setString(3, "Ferraris");
            ps2.setString(4, "1:1");
            ps2.setString(5, "Vendedor");
            ps2.setString(6, "Ferrari Testarrosa");
            ps2.setString(7, "10");
            ps2.setString(8, "80000");
            ps2.setString(9, "100000");

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
