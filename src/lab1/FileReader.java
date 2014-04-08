/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex
 */
public class FileReader {

    public static void main(String[] args) throws IOException {

//    File data = new File("src" + File.separatorChar + "Lab1.txt");
        File data = new File(File.separatorChar + "Users" + File.separatorChar
              + "Alex" + File.separatorChar + "Documents" + File.separatorChar + "ContactsList.txt");


    //Part 1
    List<String> fileContents = new ArrayList<String>();
        BufferedReader in = null;
        try {
	   in = new BufferedReader(new java.io.FileReader(data));
	   String line = in.readLine();
	   while(line != null){
		  System.out.println(line);
		  line = in.readLine();  // strips out any carriage return chars
	   }
	 
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
    for (String s : fileContents){
        System.out.println(s);
    }
        

    }
}
