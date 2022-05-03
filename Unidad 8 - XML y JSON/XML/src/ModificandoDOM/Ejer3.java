package ModificandoDOM;

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
import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Scanner sc = new Scanner(System.in);

        try {
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document doc = builder.parse(new File("personas.xml"));

            Element root = doc.getDocumentElement();

//            Borrar la primera persona
            root.removeChild(root.getElementsByTagName("persona").item(0));

            Persona p = pedirPersona(sc);
            NodeList nl = doc.getElementsByTagName("persona");
            Element ultimaPersona = (Element) nl.item(nl.getLength() - 1);
            Element personaClonada = (Element) ultimaPersona.cloneNode(true);
            Element personaModificada = modificarPersona(personaClonada, p);

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    public static Persona pedirPersona(Scanner sc) {
        String nombre;
        int edad;
        System.out.println("Introduce el nombre:");
        nombre = sc.nextLine();
        System.out.println("Introduce la edad:");
        edad = sc.nextInt();
        sc.nextLine();

        return new Persona(nombre, edad);
    }

    public static Element modificarPersona(Element etiqueta, Persona persona) {
        etiqueta.setAttribute("id", String.valueOf(persona.getId()));
        NodeList nl = etiqueta.getChildNodes();

        for (int i = 0; i < nl.getLength(); i++) {
            if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                Element elem = (Element) nl.item(i);

                switch (elem.getTagName()) {
                    case "nombre":
                        elem.setTextContent(persona.getNombre());
                        break;
                    case "edad":
                        elem.setTextContent(String.valueOf(persona.getEdad()));
                        break;
                }
            }
        }

        return etiqueta;
    }
}
