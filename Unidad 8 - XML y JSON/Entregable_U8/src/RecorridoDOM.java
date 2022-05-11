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
import java.util.ArrayList;
import java.util.Collections;

public class RecorridoDOM {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        ArrayList<Alumno> alumnos = new ArrayList<>();

        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(new File("alumnos.xml"));

            NodeList nl = document.getElementsByTagName("alumno");

            for (int i = 0; i < nl.getLength(); i++) {
                Element alum = (Element) nl.item(i);

                String dni = alum.getAttribute("dni");

                NodeList nl2 = alum.getChildNodes();
                String nombre = "", apellidos = "", direccion = "";

                for (int j = 0; j < nl2.getLength(); j++) {

                    if (nl2.item(j).getNodeType() == Node.ELEMENT_NODE) {
                        Element hijo = (Element) nl2.item(j);

                        switch (hijo.getTagName()) {
                            case "nombre":
                                nombre = hijo.getTextContent();
                                break;
                            case "apellido":
                                apellidos = hijo.getTextContent();
                                break;
                            case "direccion":
                                direccion = hijo.getTextContent();
                                Alumno nuevo = new Alumno(dni, nombre, apellidos, direccion);
                                alumnos.add(nuevo);
                                break;
                            default:
                                break;
                        }
                    }
                }
            }

            System.out.println(alumnos);

            System.out.println("DNIS ordenados:");

            ArrayList<String> dnis = new ArrayList<>();

            for (Alumno alumno : alumnos) {
                dnis.add(alumno.getDni());
            }

            Collections.sort(dnis);
            System.out.println(dnis);

        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}