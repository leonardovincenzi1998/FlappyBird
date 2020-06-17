package util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This is the class that print on a text file the username.
 */
public class IOName {
    /**
     * Scores.txt file path.
     */
    public static final String FILE_NAME = "src/main/resources/input-output/Scores.txt";

    /**
     * Print the user name in a text file.
     * @param name UserName
     */
    public void writeName(final String name) {
        try {
            FileWriter fw = new FileWriter(FILE_NAME, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(name);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
