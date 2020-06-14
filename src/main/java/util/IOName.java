package util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOName {

    public static final String FILE_NAME = "src/main/resources/input-output/Scores.txt";
    File file = new File("src/main/resources/input-output/Scores.txt");
    FileWriter fw;


    public void writeName(String name) throws IOException {
        try {
            fw = new FileWriter(FILE_NAME, true);
            // initialize our BufferedWriter
            BufferedWriter bw = new BufferedWriter(fw);
            //System.out.println("Starting the write operation");
            bw.write(name);
            bw.newLine();
            // close the BufferedWriter object to finish operation
            bw.close();
            //System.out.println("Finished");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
