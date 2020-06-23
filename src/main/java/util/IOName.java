package util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This is the class that print on a text file the user name.
 */
public class IOName {

    /**
     * Print the user name in a text file.
     * @param name UserName
     * @throws IOException  IO exception
     */
    public void writeName(final String name) throws IOException {
        final File folder = new File(System.getProperty("user.home"), "FlappyBirdScores.txt");
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(folder, true));
            bw.write(name);
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
