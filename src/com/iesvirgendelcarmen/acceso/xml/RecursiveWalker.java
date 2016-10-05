/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesvirgendelcarmen.acceso.xml;

import org.w3c.dom.Node;


/**
 *
 * @author profesor
 */
public class RecursiveWalker {
    private Node raiz;

    public RecursiveWalker(Node raiz) {
        this.raiz = raiz;
    }

    public RecursiveWalker() {
    }

    public Node getRaiz() {
        return raiz;
    }

    public void setRaiz(Node raiz) {
        this.raiz = raiz;
    }
    
    private String recursiveWalk(Node actual){
        String resultado="";
        
        if (actual.hasChildNodes()) {
            for (int i = 0; i < actual.getChildNodes().getLength(); i++) {
                resultado+=recursiveWalk(actual.getChildNodes().item(i));
            }
        }
        
        resultado+="\n TIPO NODO: "+actual.getNodeType()+
                " NOMBRE NODO:"+actual.getLocalName()+
                " VALOR NODO: "+actual.getNodeValue();
        
        if (actual.hasAttributes()) {
            resultado+="\nATRIBUTOS de "+actual.getNodeName()+":";
            for (int i = 0; i < actual.getAttributes().getLength(); i++) {                
                resultado+="\n  atributo:"+actual.getAttributes().item(i).getNodeName();
                resultado+="  valor:"+actual.getAttributes().item(i).getNodeValue();
            }
        }
        
        return resultado;
    } 

    @Override
    public String toString() {
        return recursiveWalk(this.raiz);
    }
    
    
}

















