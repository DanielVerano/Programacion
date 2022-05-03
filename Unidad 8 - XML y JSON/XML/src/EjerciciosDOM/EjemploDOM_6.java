package EjerciciosDOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class EjemploDOM_6 {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document document = builder.parse(new File("personas.xml"));

            Element root = document.getDocumentElement();
            NodeList nl = root.getChildNodes();

            double media = 0;

            for (int i = 0; i < nl.getLength(); i++) {
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    Element persona = (Element) nl.item(i);

                    NodeList nl2 = persona.getChildNodes();

                    for (int j = 0; j < nl2.getLength(); j++) {
                        if (nl2.item(j).getNodeType() == Node.ELEMENT_NODE) {
                            Element elem = (Element) nl2.item(j);

                            if (elem.getTagName().equals("edad")) {
                                media += Integer.parseInt(elem.getTextContent());
                            }
                        }
                    }
                }
            }
            System.out.println("Media: " + (media / root.getElementsByTagName("edad").getLength()));
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
