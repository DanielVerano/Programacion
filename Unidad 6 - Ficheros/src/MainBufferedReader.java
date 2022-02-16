import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainBufferedReader {
    public static void main(String[] args) {
        String texto = "";
        try {
            BufferedReader in = new BufferedReader(
                    new FileReader("ficheros/otro.txt"));
            String linea = in.readLine();

            while (linea != null) {
                texto += linea + '\n';
                linea = in.readLine();
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Se ejecuta en cualquier caso");
        }
        System.out.println(texto);
    }
}
