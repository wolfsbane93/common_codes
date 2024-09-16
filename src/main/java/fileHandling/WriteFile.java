package fileHandling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class WriteFile {

    private static final Logger log = LoggerFactory.getLogger(WriteFile.class);

    public static void main(String[] args) throws IOException {

        try(FileWriter writer =new FileWriter("src/main/resources/outputfile.text",true)){
            writer.write("uyu7yi7yiy");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
