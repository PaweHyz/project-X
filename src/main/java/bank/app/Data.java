package bank.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Data {

    private static List<Invoice> invoices;
    private static List<BankingOperation> bankingOperations;
    private static Set<Company> companies;

    public void readCompanies(){



    }

    public void readBankingOperations(){}

    public void readInvoices(){}



    public File readFilePath(){

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                File file = new File(scanner.nextLine());
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                return file;
            } catch (FileNotFoundException e) {
                System.out.println("W podanej ścieżce nie ma pliku !!!");
                continue;
            }
        }
    }
}
