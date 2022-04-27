package EjerciciosDOM;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class EjemploDOM_4 {
    public static void main(String[] args) {
//        Mostrar por pantalla todos los comentarios
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document doc = builder.parse(new File("personas.xml"));

            Element root = doc.getDocumentElement();
            NodeList nl = root.getChildNodes();
            int numComents = 0;

            for (int i = 0; i < nl.getLength(); i++) {
                if (nl.item(i).getNodeType() == Node.COMMENT_NODE) {
                    Comment comentario = (Comment) nl.item(i);
                    System.out.println(comentario.getTextContent());
                    numComents++;
                }
            }

            System.out.println("Hay " + numComents + " comentarios");
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
