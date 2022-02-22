import java.io.*;
import java.util.Arrays;

public class FicherosBinarios {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pepe","Pérez");
        Persona p2 = new Persona("Lola","García");

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }

        try {
            FileOutputStream archivo = new FileOutputStream("ficheros_binarios/personas.dat");
            ObjectOutputStream out = new ObjectOutputStream(archivo);
//            out.writeObject(p);

            /*for (int i = 0; i < numeros.length; i++) {
                out.writeObject(numeros[i]);
            }*/

//            out.writeObject(numeros);

            Persona[] personas = new Persona[]{p1, p2};
            out.writeObject(personas);

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream archivo = new FileInputStream("ficheros_binarios/personas.dat");
            ObjectInputStream in = new ObjectInputStream(archivo);

//            Persona person = (Persona) in.readObject();
//            System.out.println(person);

            /*for (int i = 0; i < numeros.length; i++) {
                int num = (int) in.readObject();
                System.out.println(num);
            }*/

//            int[] n = (int[]) in.readObject();
//            System.out.println(Arrays.toString(n));

            Persona[] personas = (Persona[]) in.readObject();
            System.out.println(Arrays.toString(personas));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
