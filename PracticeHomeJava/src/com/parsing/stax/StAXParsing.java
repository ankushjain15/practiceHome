package com.parsing.stax;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.xml.sax.InputSource;

public class StAXParsing {
	public static void main(String[] args) throws XMLStreamException, FileNotFoundException {
		XMLInputFactory xmlipfactory = XMLInputFactory.newInstance();
		XMLStreamReader reader = 
				xmlipfactory.createXMLStreamReader(new FileInputStream("GC_Working_PO_CenovustoSLB_4Lines_P2PPreprod.xml"));
		
		while(reader.hasNext()){
			int event = reader.next();
			switch(event){
			case XMLStreamConstants.START_ELEMENT:
				System.out.println("startElement : " + reader.getLocalName());
				break;
			case XMLStreamConstants.CHARACTERS:
				System.out.println(reader.getText().trim());
			}
			
		}
	}
}
