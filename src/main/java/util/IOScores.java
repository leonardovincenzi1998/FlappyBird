package util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This is the class that print on a text file the final user score.
 */
public class IOScores {

    /**
     * Print the user score in a text file.
     * @param score Final UserScore
     * @throws IOException IO exception
     */
    public void writeScore(final int score) throws IOException {
        final File folder = new File(System.getProperty("user.home"), "FlappyBirdScores.txt");
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(folder, true));
            bw.write(Integer.toString(score));
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (bw != null) {
                bw.close();
            }
        }

    }





}
