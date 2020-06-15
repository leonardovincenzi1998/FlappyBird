package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class User {

    private String name;
    private String score;

    public User(String name, String score){
        this.name = name;
        this.score = score;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }


    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }



    /**
     * @return the score
     */
    public String getScore() {
        return this.score;
    }


    /**
     * @param score the score to set
     */
    public void setScore(String score) {
        this.score = score;
    }





}
