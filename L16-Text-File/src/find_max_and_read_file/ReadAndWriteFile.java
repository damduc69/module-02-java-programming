package find_max_and_read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> list = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("File not found");
        }
        return list;
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Max = " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> list = readAndWriteFile.readFile("F:\\CODEGYM\\MODULE 2\\L16-Text-File\\src\\numbers.txt");
        int max = findMax(list);
        readAndWriteFile.writeFile("F:\\CODEGYM\\MODULE 2\\L16-Text-File\\src\\max.txt", max);
    }

}
