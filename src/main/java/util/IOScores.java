package util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOScores {

    private static final String FILE_NAME = "src/main/resources/input-output/Scores.txt";

    public void writeScore(int score) throws IOException {
        try {
            FileWriter fw = new FileWriter(FILE_NAME, true);
            // initialize our BufferedWriter
            BufferedWriter bw = new BufferedWriter(fw);
            //System.out.println("Starting the write operation");
            bw.write(Integer.toString(score));
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
