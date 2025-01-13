package number_in_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {

    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            int total = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                total += Integer.parseInt(line);
            }
            bufferedReader.close();

            System.out.println("Total = " + total);
        } catch (Exception e) {
            System.err.println("File not found");
        }

    }

    public static void main(String[] args) {
            System.out.println("Enter file path: ");
            Scanner scanner = new Scanner(System.in);
            String filePath = scanner.nextLine();
            ReadFileExample readFileExample = new ReadFileExample();
            readFileExample.readFileText(filePath);
        }

    }

