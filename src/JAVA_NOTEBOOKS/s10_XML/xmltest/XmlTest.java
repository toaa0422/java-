package JAVA_NOTEBOOKS.s10_XML.xmltest;

import java.io.*;
import java.util.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;


//DOM
public class XmlTest{
    public static void main(String arge[]){
        long lasting =System.currentTimeMillis();
        try{
            File f=new File("C:\\Users\\fury5\\Desktop\\java_save\\src\\JAVA_NOTEBOOKS\\s10_XML\\xmltest\\xmltest.xml");
            DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=factory.newDocumentBuilder();
            Document doc = builder.parse(f);
            NodeList nl = doc.getElementsByTagName("VALUE");
            for (int i=0;i<nl.getLength();i++){
                System.out.print("车牌号码:" + doc.getElementsByTagName("NO").item(i).getFirstChild().getNodeValue());
                System.out.println("车主地址:" + doc.getElementsByTagName("ADDR").item(i).getFirstChild().getNodeValue());
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
