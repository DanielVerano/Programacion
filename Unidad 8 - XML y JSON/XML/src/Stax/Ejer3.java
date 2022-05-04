package Stax;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Ejer3 {
    public static void main(String[] args) {
//        Volcar a un fichero XML una lista de módulos
        Modulo mod1 = new Modulo("LM", 4, 1);
        Modulo mod2 = new Modulo("PROG", 8, 2);
        Modulo mod3 = new Modulo("BBDD", 6, 3);
        Modulo mod4 = new Modulo("SSII", 6, 4);
        Modulo mod5 = new Modulo("ENDES", 3, 5);
        Modulo mod6 = new Modulo("FOL", 3, 6);

        ArrayList<Modulo> modulos = new ArrayList<>();
        modulos.add(mod1);
        modulos.add(mod2);
        modulos.add(mod3);
        modulos.add(mod4);
        modulos.add(mod5);
        modulos.add(mod6);

        XMLOutputFactory xmlof = XMLOutputFactory.newInstance();

        try {
//            1. Crear un escritor de eventos
            XMLEventWriter eventWriter = xmlof.createXMLEventWriter(new FileOutputStream("modulos.xml"));

//            2. Crear un creador de eventos
            XMLEventFactory eventFactory = XMLEventFactory.newInstance();

//            3. Crear el inicio del documento
            StartDocument startDocument = eventFactory.createStartDocument();
            eventWriter.add(startDocument);

//            4. Crear los elementos Characters para maquetar el documento
            Characters newLine = eventFactory.createCharacters("\n");
            Characters newLineTab = eventFactory.createCharacters("\n\t");
            Characters tab = eventFactory.createCharacters("\t");
            eventWriter.add(newLine);

//            5. Crear la etiqueta raíz (root)
            StartElement startRoot = eventFactory.createStartElement("", "", "ciclo");
            eventWriter.add(startRoot);
            eventWriter.add(newLineTab);

            for (int i = 0; i < modulos.size(); i++) {
                //                Creación de los elementos de apertura de etiqueta
                StartElement startModulo = eventFactory.createStartElement("", "", "modulo");
                StartElement startNombre = eventFactory.createStartElement("", "", "nombre");
                StartElement startHoras = eventFactory.createStartElement("", "", "horas");

//                Creación de los atributos
                Attribute id = eventFactory.createAttribute("id", String.valueOf(modulos.get(i).getCodigo()));

//                Creación de los elementos de fin de etiqueta
                EndElement endModulo = eventFactory.createEndElement("", "", "modulo");
                EndElement endNombre = eventFactory.createEndElement("", "", "nombre");
                EndElement endHoras = eventFactory.createEndElement("", "", "horas");

//                Creación de los elementos del contenido de las etiquetas
                Characters textoNombre = eventFactory.createCharacters(modulos.get(i).getNombre());
                Characters textoHoras = eventFactory.createCharacters(String.valueOf(modulos.get(i).getHoras()));

//                Se añaden todos los elementos en el orden correcto
//                Inicio de etiqueta
//                Los atributos se añaden en los inicios de etiqueta
                eventWriter.add(startModulo);
                eventWriter.add(id);
                eventWriter.add(newLineTab);
                eventWriter.add(tab);

//                Añadir la etiqueta nombre
                eventWriter.add(startNombre);
                eventWriter.add(textoNombre);
                eventWriter.add(endNombre);
                eventWriter.add(newLineTab);
                eventWriter.add(tab);

//                Añadir la etiqueta horas
                eventWriter.add(startHoras);
                eventWriter.add(textoHoras);
                eventWriter.add(endHoras);
                eventWriter.add(newLineTab);

//                Cerrar la etiqueta
                eventWriter.add(endModulo);

                if (i == modulos.size() - 1) {
                    eventWriter.add(newLine);
                } else {
                    eventWriter.add(newLineTab);
                }
            }

            EndElement endRoot = eventFactory.createEndElement("", "", "ciclo");
            eventWriter.add(endRoot);

            EndDocument endDocument = eventFactory.createEndDocument();
            eventWriter.add(endDocument);

        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
