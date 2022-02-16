import java.io.FileReader;
import java.io.IOException;

public class MainFileReader {

    public static void main(String[] args) {
        String texto = "";
        try {
            FileReader in = new FileReader("./ficheros/saludo.txt");
            int c = in.read();

            while (c != -1) {
                texto += (char) c;
                c = in.read();
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(texto);
    }
}
