package EjerciciosDOM;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class EjemploDOM_5 {
    public static void main(String[] args) {
//        Calcular la edad media de las personas
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document document = builder.parse(new File("personas.xml"));

            NodeList nodosEdad = document.getElementsByTagName("edad");

            double media = 0;

            for (int i = 0; i < nodosEdad.getLength(); i++) {
                int edad = Integer.parseInt(nodosEdad.item(i).getTextContent());
                media += edad;
            }

            System.out.println("Media de las personas: " + (media / nodosEdad.getLength()));
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
