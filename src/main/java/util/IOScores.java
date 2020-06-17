package util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This is the class that print on a text file the final user score
 */
public class IOScores {

    private static final String FILE_NAME = "src/main/resources/input-output/Scores.txt";

    /**
     * Print the user score in a text file
     * @param score Final UserScore
     */
    public void writeScore(int score) {
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
