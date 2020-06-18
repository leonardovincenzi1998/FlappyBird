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
     * @throws IOException  IO exception
     */
    public void writeName(final String name) throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(FILE_NAME, true));
            bw.write(name);
            bw.newLine();
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
