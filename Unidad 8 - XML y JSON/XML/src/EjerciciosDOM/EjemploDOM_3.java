package EjerciciosDOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class EjemploDOM_3 {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document doc = builder.parse(new File("alumnos.xml"));

//            Número de nodos hijos del documento (siempre es 1)
            System.out.println("Número de nodos del documento: " + doc.getChildNodes().getLength());

            Element root = doc.getDocumentElement();
            System.out.println("Número de nodos del elemento raiz: " + root.getChildNodes().getLength());

//            Lista de nodos de tipo nombre
            NodeList nameNodes = root.getElementsByTagName("nombre");

            for (int i = 0; i < nameNodes.getLength(); i++) {
                System.out.println(nameNodes.item(i).getTextContent());
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
