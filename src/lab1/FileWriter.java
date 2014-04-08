/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;
import java.io.*;
/**
 *
 * @author Alex
 */
public class FileWriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        
        
           File data = new File(File.separatorChar + "Users" + File.separatorChar
              + "Alex" + File.separatorChar + "Documents" + File.separatorChar + "ContactsList.txt");

        BufferedReader in = null;
        
                boolean append = true;
	  PrintWriter out = new PrintWriter(
						new BufferedWriter(
						new java.io.FileWriter(data, append)));;
        out.println();
        out.println();
        out.println("Scott Plouff (414) 322 3244");
        out.println("\nN52 W14418 Aryshire Ct");
        out.println("\nMenomonee Falls WI, 53051");
        out.close();
    }
    
}
