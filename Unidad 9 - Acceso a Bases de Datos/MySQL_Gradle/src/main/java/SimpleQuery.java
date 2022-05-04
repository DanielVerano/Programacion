import java.sql.*;

public class SimpleQuery {
    public static void main(String[] args) {
        Connection connection = null;

        try {
//            1. Crear una conexión a la base de datos
//            Hay que pasarle la dirección y el puerto donde esté el servidor,
//            la base de datos con la que vamos a trabajar y
//            el usuario y contraseña
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3336/classicmodels?user=root&password=root");

//            2. Creamos un objeto statement para ejecutar las sentencias SQL
            Statement statement = connection.createStatement();

//            3. Opcionalmente, establecemos un tiempo máximo de respuesta
            statement.setQueryTimeout(30);

//            4. Ejecutamos la sentencia SQL, que nos devuelve un ResultSet
//            Para las operaciones CRUD, utilizaremos executeUpdate
            ResultSet resultSet = statement.executeQuery("select * from customers");

//            5. Iteramos sobre el ResultSet
            while (resultSet.next()) {
//                Obtenemos un campo cadena
                System.out.println("CustomerName:" + resultSet.getString("customerName"));
//                Obtenemos un campo entero
                System.out.println("CustomerNumber:" + resultSet.getInt("customerNumber"));
//                Obtenemos un campo por posición
                System.out.println("Tercer campo:" + resultSet.getString(3));
                System.out.println("------------------");
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
