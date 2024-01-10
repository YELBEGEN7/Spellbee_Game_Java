package com.spell.project;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Text {
    ArrayList<String> Words=new ArrayList<>();
    ArrayList<String >PangramWords=new ArrayList<>();



    public void Reader(){
        String filename="sozlukv2.txt";
        String str;
        Control control=new Control();
        try(BufferedReader buffer=new BufferedReader(new FileReader(filename))) {
            while ((str=buffer.readLine())!=null){

                if(control.TrueLength(str)){
                    Words.add(str);
                    if(control.Letter(str).size()==7){
                        PangramWords.add(str);
                    }
                }
            }

        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
