package com.General;
import java.io.File;
import java.io.FileWriter;

public class FileWrite {
    public static void main(String[] args) {
        try{
            File file = new File("abc.txt");
            FileWriter fw = new FileWriter(file);
            fw.write(45678);
            fw.close();
            
        }
        catch(Exception e){

        }
    }
}
