package fileHandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("src/main/resources/inputfile.text"));
        lines.forEach(System.out::println);
        Scanner sc = new Scanner(new File("src/main/resources/inputfile.text"));
        if (sc.hasNext()){
            System.out.println(sc.nextLine());
        }

    }
}
