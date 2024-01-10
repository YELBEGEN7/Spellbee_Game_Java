package com.spell.project;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Control {
    public boolean TrueLength(String word){
        if(word.length()>3 && word.length()<8){
            return true;
        }
        else
            return false;
    }
    public Set Letter(String str){
        Set<Character> PangramND=new HashSet<>();
        for(int i =0 ;i<str.length();i++){
            PangramND.add(str.charAt(i));
        }
        return  PangramND;
    }
    public boolean equels(ArrayList list,String word){
        boolean x=true;
        for(int i = 0 ;i<list.size();i++){
            if(list.get(i).toString().toLowerCase().equals(word.toLowerCase())){
                x=true;
                i=list.size();
            }
            else
                x=false;
        }
        return x;
    }
    public ArrayList CenterIn(ArrayList word, String Center){
        ArrayList<String > centerin=new ArrayList<>();
        boolean x=false;
        for(int i =0 ;i<word.size();i++){
            if(word.get(i).toString().contains(Center)){
                centerin.add(word.get(i).toString());
            }
        }
        return centerin;
    }
    public ArrayList ListContains(ArrayList list, ArrayList str){
        ArrayList<String>absentlist=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(str.containsAll(Letter(list.get(i).toString())))
                absentlist.add(list.get(i).toString());
        }
        return absentlist;
    }
    public ArrayList deletecenter(ArrayList list,int index){
        list.remove(index);
        return list;
    }

}