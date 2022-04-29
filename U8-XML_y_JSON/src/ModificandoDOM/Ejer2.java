package ModificandoDOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;

public class Ejer2 {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        Persona p1 = new Persona("Pepe", 35);
        Persona p2 = new Persona("Ana", 26);
        Persona p3 = new Persona("Juan", 41);

        List<Persona> personas = List.of(p1, p2, p3);

        try {
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document doc = builder.newDocument();

            Element root = doc.createElement("personas");
            doc.appendChild(root);

            for (Persona persona : personas) {
                Element personaTag = crearEtiquetaPersona(persona, doc);
                root.appendChild(personaTag);
            }

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origen = new DOMSource(root);
            StreamResult destino = new StreamResult(new File("personas2.xml"));

            transformer.transform(origen, destino);

        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }
    }

    public static Element crearEtiquetaPersona(Persona p, Document doc) {
        Element persona = doc.createElement("persona");
        Element nombre = doc.createElement("nombre");
        Element edad = doc.createElement("edad");

        persona.setAttribute("id", String.valueOf(p.getId()));
        nombre.setTextContent(p.getNombre());
        edad.setTextContent(String.valueOf(p.getEdad()));

        persona.appendChild(nombre);
        persona.appendChild(edad);

        return persona;
    }
}
