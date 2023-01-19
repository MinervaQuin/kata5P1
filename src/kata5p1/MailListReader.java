/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata5p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Minerva
 */
public class MailListReader {
    

    
    
    public static ArrayList<String> read(String nombre_archivo){
        ArrayList<String> correos = new ArrayList();
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File(nombre_archivo)));
            
            String nombre_correo=reader.readLine();
            while( nombre_correo != null){
                if(nombre_correo.contains("@")){
                    correos.add(nombre_correo);
                }
                 nombre_correo=reader.readLine();
            }
            
        } catch (Exception e){
            System.out.println("Archivo no existe o no se encontró");
        }
        return correos;
    }
    
    
}
