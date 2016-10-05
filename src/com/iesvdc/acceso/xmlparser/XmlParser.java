/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesvdc.acceso.xmlparser;

import com.iesvirgendelcarmen.acceso.xml.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author profesor
 */
public class XmlParser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length==1){ 
            try {                
                Document doc = DomUtil.parse(args[0], false);   
                RecursiveWalker rw = new RecursiveWalker(doc);
                System.out.println(rw.toString());
            } catch (ParserConfigurationException | IOException | SAXException ex) {
                System.out.println("## ERROR:: "+ex.getLocalizedMessage());
            }
        } else {
            System.out.println("Uso del programa... \n");
        }
    }
    
}


