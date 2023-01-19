/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kata5p1;

import java.util.List;

/**
 *
 * @author Minerva
 */
public class Kata5P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereç
        DBConnection app= new DBConnection();
        app.selectAll();
        app.createNewTable();
        
        String nombre_archivo="emails.txt";
        List<String> correos=MailListReader.read(nombre_archivo);
        app.insertEmails(correos);
        
    }
    
}
