package Stax;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ejer1 {
    public static void main(String[] args) {
//        Calcular el precio total de todos los pedidos
//        Hay que mirar los eventos de inicio de etiqueta y de tipo texto
//        La variable tag la usaremos para saber a qué etiqueta corresponde un evento de tipo texto
        XMLInputFactory xmlif = XMLInputFactory.newInstance();
        int precio = 0, cantidad = 0;
        double total = 0;
        String tag = null;

        try {
            XMLEventReader eventReader = xmlif.createXMLEventReader(new FileInputStream("pedidos.xml"));

            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();

                if (event.isStartElement()) {
                    StartElement startElement = event.asStartElement();

                    tag = startElement.getName().getLocalPart();

                } else if (event.isCharacters()) {
                    Characters characters = event.asCharacters();

//                    isWhiteSpace para comprobar que no estamos en un salto de línea
                    if (tag.equals("precio") && !characters.isWhiteSpace()) {
                        precio = Integer.parseInt(characters.getData());
                    } else if (tag.equals("cantidad") && !characters.isWhiteSpace()) {
                        cantidad = Integer.parseInt(characters.getData());
                        total += precio * cantidad;
                    }
//                    tag = "";
                }
            }

            System.out.println("El precio total es " + total);
        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
