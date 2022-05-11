import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecorridoStax {
    public static void main(String[] args) {
        XMLInputFactory xmlif = XMLInputFactory.newInstance();

        try {
            XMLEventReader xmlEventReader = xmlif.createXMLEventReader(new FileInputStream("alumnos.xml"));
            int totalAlumnos = 0;
            int alumnosEnDireccion = 0;

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca una dirección para buscar:");
            String direccion = sc.nextLine();
            boolean esDireccion = false;

            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();

                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();

                    if (startElement.getName().getLocalPart().equals("alumno")) {
                        totalAlumnos++;
                    } else if (startElement.getName().getLocalPart().equals("direccion")) {
                        esDireccion = true;
                    }
                } else if (xmlEvent.isCharacters()) {
                    Characters characters = xmlEvent.asCharacters();

                    if (esDireccion && characters.getData().equals(direccion)) {
                        alumnosEnDireccion++;
                        esDireccion = false;
                    }
                }
            }

            System.out.println("Hay " + totalAlumnos + " alumnos en el fichero");
            System.out.println("Hay " + alumnosEnDireccion + " alumnos que viven en " + direccion);
        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el fichero");
        }
    }
}
