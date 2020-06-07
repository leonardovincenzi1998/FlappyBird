package view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ScoresImpl {

    public static final String FILE_NAME = "src/main/resources/input-output/Scores.txt";
    File file = new File("src/main/resources/input-output/Scores.txt");
    FileWriter fw;


    public ScoresImpl() throws IOException {
    }

    public void writeScore(int score) throws IOException {
        try {
            fw = new FileWriter(FILE_NAME,true);
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





        //final FileWriter w = new FileWriter(FILE_NAME);
        //System.out.println(score);


        /*FileWriter fw;
        try {
            fw = new FileWriter("Scores.txt");
            // initialize our BufferedWriter
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("Starting the write operation");
            // write values
            bw.write(65);
            bw.newLine();
            bw.write(35);

            // close the BufferedWriter object to finish operation
            bw.close();
            System.out.println("Finished");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
    }




}
