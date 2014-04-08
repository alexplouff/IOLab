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
public class SpecificLineReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File data = new File(File.separatorChar + "Users" + File.separatorChar
                + "Alex" + File.separatorChar + "Documents" + File.separatorChar + "ContactsList.txt");

        BufferedReader in = null;

        try {
            int counter = 1;
            in = new BufferedReader(new java.io.FileReader(data));
            String line = in.readLine();
            while (line != null) {
                if (counter > 4 && counter < 8) {
                    System.out.println(line);
                }

                line = in.readLine();
                counter++;

            }

        } catch (IOException ioe) {
            System.out.println("Problem");
        } finally {
            try {
                in.close();
            } catch (Exception e) {

            }
        }
    }

}
