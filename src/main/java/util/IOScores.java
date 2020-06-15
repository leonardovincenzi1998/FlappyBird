package util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOScores {

    private static final String FILE_NAME = "src/main/resources/input-output/Scores.txt";

    public void writeScore(int score) throws IOException {
        try {
            FileWriter fw = new FileWriter(FILE_NAME, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(Integer.toString(score));
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }




}
