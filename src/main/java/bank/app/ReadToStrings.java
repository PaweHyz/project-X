package bank.app;

import java.io.*;
import java.util.Scanner;

public class ReadToStrings {

     public static File readFilePathFromKeyboard(){

        while (true) {
            System.out.println("Wpisz sciezke do pliku z ktorego chcesz pisac");
            try {
                String string = new Scanner(System.in).nextLine();
                if(string.toUpperCase().equals("EXIT")){
                    System.out.println(string);
                    return null;
                }
                File file = new File(string);
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                return file;
            } catch (FileNotFoundException e) {
                System.out.println("W podanej sciezce nie ma pliku!!!");
            }
        }


    }
}
