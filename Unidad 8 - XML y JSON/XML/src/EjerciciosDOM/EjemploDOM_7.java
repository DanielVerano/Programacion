package EjerciciosDOM;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class EjemploDOM_7 {
    public static void main(String[] args) {
//        Construir los objetos de persona mientras se va leyendo el DOM

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document document = builder.parse(new File("personas.xml"));

            Element root = document.getDocumentElement();
            NodeList personas = root.getElementsByTagName("persona");
            String nombre;
            int edad, id;

            for (int i = 0; i < personas.getLength(); i++) {
                NodeList nl = personas.item(i).getChildNodes();

                for (int j = 0; j < nl.getLength(); j++) {
                    if (nl.item(j).getNodeType() == Node.ELEMENT_NODE) {
                        Element elem = (Element) nl.item(j);
                        Attr atributo = elem.getAttributeNode("id");
                        id = Integer.parseInt(atributo.getValue());

                        if (elem.getTagName().equals("nombre")) {
                            nombre = elem.getTextContent();
                        } else {
                            edad = Integer.parseInt(elem.getTextContent());
                        }
                    }
                }
//                new Persona
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
