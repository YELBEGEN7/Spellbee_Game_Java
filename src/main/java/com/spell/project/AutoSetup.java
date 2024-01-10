package com.spell.project;


import java.util.ArrayList;
import java.util.Random;

public class AutoSetup {

    Random random=new Random();
    Text text=new Text();
    Control control=new Control();

    public String  select_word(){
        text.Reader();
        return text.PangramWords.get(random.nextInt(text.PangramWords.size()));

    }
    String pangram_word=select_word();
    public int select_center(){
        return random.nextInt(7);
    }
    ArrayList<Character>SelectWordLetter=new ArrayList<Character>(control.Letter(pangram_word));
    int centerindex=select_center();
    String selectcenter= String.valueOf(SelectWordLetter.get(centerindex));
    ArrayList<String> aslist=new ArrayList<>(control.ListContains(text.Words,SelectWordLetter));
    ArrayList<String> absentlist=new ArrayList<>(control.CenterIn(aslist,selectcenter));
    ArrayList<Character >nocenter=new ArrayList<>(control.deletecenter(SelectWordLetter,centerindex));

}