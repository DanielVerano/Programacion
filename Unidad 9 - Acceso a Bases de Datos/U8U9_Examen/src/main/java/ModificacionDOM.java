import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificacionDOM {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(new File("restaurante.xml"));
            Element root = document.getDocumentElement();

            NodeList nl = document.getElementsByTagName("plato");

//            Insertar la nueva etiqueta 'disponible' en cada plato
            for (int i = 0; i < nl.getLength(); i++) {
                Node plato = nl.item(i);

                Element disponibleTag = document.createElement("disponible");
                disponibleTag.setTextContent("si");
                plato.appendChild(disponibleTag);
            }

//            Insertar el nuevo plato
            Element platoTag = document.createElement("plato");
            Element nombreTag = document.createElement("nombre");
            Element precioTag = document.createElement("precio");
            Element disponibleTag = document.createElement("disponible");

            platoTag.setAttribute("calorias", "500");
            nombreTag.setTextContent("Lentejas");
            precioTag.setTextContent("10");
            disponibleTag.setTextContent("si");

            platoTag.appendChild(nombreTag);
            platoTag.appendChild(precioTag);
            platoTag.appendChild(disponibleTag);
            root.appendChild(platoTag);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origen = new DOMSource(root);
            StreamResult destino = new StreamResult(new File("examen2.xml"));

            transformer.transform(origen, destino);
        } catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
            e.printStackTrace();
        }
    }
}
