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

public class DOMModificado {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(new File("alumnos.xml"));

            Element root = document.getDocumentElement();

            /* Crear nuevo alumno */
            Element alumnoTag = document.createElement("alumno");
            Element nombreTag = document.createElement("nombre");
            Element apellidoTag = document.createElement("apellido");
            Element direccionTag = document.createElement("direccion");

            alumnoTag.setAttribute("dni", "8888888X");
            nombreTag.setTextContent("Luis");
            apellidoTag.setTextContent("Ruiz");
            direccionTag.setTextContent("Allí");

            alumnoTag.appendChild(nombreTag);
            alumnoTag.appendChild(apellidoTag);
            alumnoTag.appendChild(direccionTag);

            Node primerAlumno = document.getElementsByTagName("alumno").item(0);
            root.insertBefore(alumnoTag, primerAlumno);

            NodeList nl = document.getElementsByTagName("alumno");

            for (int i = 0; i < nl.getLength(); i++) {
                Element elem = (Element) nl.item(i);

                Element instituto = document.createElement("instituto");
                instituto.setTextContent("IES ALIXAR");

                elem.appendChild(instituto);
            }

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origen = new DOMSource(root);
            StreamResult destino = new StreamResult(new File("alumnos_modificado.xml"));

            transformer.transform(origen, destino);

        } catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
            throw new RuntimeException(e);
        }
    }
}
