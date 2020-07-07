package tasks1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        try (FileReader reader = new FileReader("file2.txt")) {
            StringBuilder builder = new StringBuilder();

            int a;
            while ((a = reader.read()) != -1) {
                builder.append((char)a);
            }

            String b = builder.toString();
            String[] words = b.split("\\s+");
            Arrays.sort(words);

            for (String word : words) {
                System.out.println(word);
            }
        }

        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
