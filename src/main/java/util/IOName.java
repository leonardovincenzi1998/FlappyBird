package util;

import java.io.*;
import java.util.Objects;

/**
 * This is the class that print on a text file the user name.
 */
public class IOName {
    /**
     * Scores.txt file path.
     */
    private static final String FILE_NAME = "src/main/resources/input-output/Scores.txt";
    private static final String FILE_NAME2 = "input-output/Scores.txt";
    //private static final String FILE_NAME = ClassLoader.getSystemResource("input-output/Scores.txt").toString();
    /**
     * Print the user name in a text file.
     * @param name UserName
     * @throws IOException  IO exception
     */
    public void writeName(final String name) throws IOException {
        OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream(String.valueOf(getClass().getClassLoader().getResourceAsStream(FILE_NAME2))));
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(os);
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
