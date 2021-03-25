package edu.ru.assignment04;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        try {
            File myObj = new File("/Users/mac/sourcecode/Assignment04/assignment04/src/main/java/edu/ru/assignment04/names.txt");
            Scanner myReader = new Scanner(myObj);

            ArrayList<String> names = new ArrayList<String>();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                names.add(data);
            }
            myReader.close();

            Collections.sort(names);

            PrintWriter writer = new PrintWriter("/Users/mac/sourcecode/Assignment04/assignment04/src/main/java/edu/ru/assignment04/sortedNames.txt");
            for (int i = 0; i < names.size(); i++) {
                writer.println(names.get(i));
            }
            
           printArrayListToFile(names,"/Users/mac/sourcecode/Assignment04/assignment04/src/main/java/edu/ru/assignment04/sortedNames.txt" );
           
           File sortedFile = new File("/Users/mac/sourcecode/Assignment04/assignment04/src/main/java/edu/ru/assignment04/sortedNames.txt");
           Scanner myReader2 = new Scanner(sortedFile);
           
           while (myReader2.hasNextLine()){
               System.out.println(myReader2.nextLine());
           }
           

//            Scanner outputFile = new Scanner(writer);
//            while (outputFile.hasNextLine()){
//                String sortedName = outputFile.nextLine();
//                
//                System.out.println(sortedName);
//            }
//            
//            outputFile.close();
        } catch (Exception e) {
            System.out.println("Error occurred.");
            System.out.println(e.getMessage());
        }

    }

    public static void printArrayListToFile(ArrayList<String> arrayList, String filename)
            throws IOException {
        PrintWriter writer = new PrintWriter(filename);
        for (String line : arrayList) {
            writer.println(line);
        }
        writer.close();
    }
}
