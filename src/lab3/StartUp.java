/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class StartUp {
    
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter = 0;

        File data = new File(File.separatorChar + "Users" + File.separatorChar
                + "Alex" + File.separatorChar + "Documents" + File.separatorChar + "ContactsList.txt");

        BufferedReader in = null;

        System.out.println("What Record Woud You Like To Look Up?");
        int recordNumber = input.nextInt();

        try {

            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();

            ArrayList contacts = new ArrayList();
            

            while (line != null) {
                
                

                if (line.equals("Contact")) {
                    contacts.add(counter, new Contact());
                    counter++;
                }

                if (line.contains("Name: ")) {
                   Contact contact = (Contact)contacts.get( counter - 1);
                   contact.setName(line.substring(6));
                }

                if (line.contains("Number: ")) {
                    Contact contact = (Contact)contacts.get( counter - 1);
                    contact.setNumber(line.substring(8));
                }

                if (line.contains("Street: ")) {
                    Contact contact = (Contact)contacts.get( counter - 1);
                    contact.setStreet(line.substring(8));
                }

                if (line.contains("City: ")) {
                    Contact contact = (Contact)contacts.get( counter - 1);
                    contact.setCity(line.substring(6));
                }

                if (line.contains("State: ")) {
                    Contact contact = (Contact)contacts.get( counter - 1);
                    contact.setState(line.substring(7));
                }

                if (line.contains("Zip: ")) {
                    Contact contact = (Contact)contacts.get( counter - 1);
                    contact.setZip(line.substring(5));
                }

                line = in.readLine();

            }

//            for (int i = 0; i < contacts.size(); i++) {
//                Contact printContact = (Contact) contacts.get(recordNumber - 1);
//                System.out.println(contact.toString());
//            }

            if (recordNumber < 0 || recordNumber > contacts.size()) {
                System.out.println("File may not exist try again");
            } else {
                Contact printContact = (Contact) contacts.get(recordNumber - 1);
                System.out.println(printContact.getCity());

            }

        } catch (IOException ioe) {
            System.out.println("Record Not Found or Does Not Exist");
        } finally {
            try {
                in.close();
            } catch (Exception e) {

            }
        }

    }

}
    

