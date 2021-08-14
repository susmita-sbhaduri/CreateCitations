/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bhaduri.createcitations;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author susmita
 */
public class FormatCitation {
    public void gheu(String transText) {        
        String REGEX_1 = "[{][{](\\d+)[}][}]";
        String REGEX_2 = "</sup><sup>";
        String REPLACE_1 = "<sup>$1</sup>";
        String REPLACE_2 = ",</sup><sup>";
        
        Pattern pattern = Pattern.compile(REGEX_1, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(transText);
        String tempText = matcher.replaceAll(REPLACE_1);
        System.out.println(tempText);
        
        Pattern pattern_1 = Pattern.compile(REGEX_2, Pattern.CASE_INSENSITIVE);
        Matcher matcher_1 = pattern_1.matcher(tempText);
        String finalText = matcher_1.replaceAll(REPLACE_2);
        
        
        System.out.println(finalText);
        
       /*  int count = 0;
        int con_seq = 0;
        int pos_remove = 0;
        String temp;
        ArrayList<Integer> start_p = new ArrayList<>();
        ArrayList<Integer> end_p = new ArrayList<>();
        ArrayList<String> con_tent = new ArrayList<>();
        //int end_pos;
        String outString = "";
       while (matcher.find()) {
            start_p.add(matcher.start());
            end_p.add(matcher.end());
            if (con_tent.isEmpty()){
                outString = matcher.group().substring(2,matcher.end()-matcher.start()-2);    
                con_tent.add(outString);
                con_seq = 0;
            }
            else{
                if(end_p.get(end_p.size()-2)==matcher.start()){
                   con_seq = con_seq+1;
                   temp = con_tent.get(con_tent.size()-con_seq);
                   outString = matcher.group().substring(2,matcher.end()-matcher.start()-2);
                   temp = temp+","+outString;
                   pos_remove = con_tent.size()-con_seq;
                   con_tent.set(pos_remove,temp); 
                //   start_p.remove(start_p.size()-1);
                 //  end_p.remove(end_p.size()-1);
                   con_tent.add("");
                }
                else{
                    outString = matcher.group().substring(2,matcher.end()-matcher.start()-2);
                    con_tent.add(outString);
                    con_seq = 0;
                }
            }
                    
            System.out.println("matcher.start: " + matcher.start());
            System.out.println("matcher.end: " + matcher.end());
            System.out.println("matcher.group(): " + matcher.group());
        //    outString = matcher.group().substring(2,matcher.end()-matcher.start()-2);
        //    System.out.println("outString: " + outString);
           // System.out.println("transText.substring(0, start_pos): " + transText.substring(0, start_pos));
            //outString = matcher.group().substring(matcher.start()+3, matcher.end()-2);
            
            //outString = outString+transText.substring(start_pos, matcher.start())+matcher.group().substring(matcher.start()+3, matcher.end()-2);
            //System.out.println("outString: " + outString);
          //  start_pos = outString.length();
            
         //   end_pos = matcher.end();
            
            count++;
        }
        for (int counter = 0; counter < start_p.size(); counter++) {
            System.out.println("matcher.start: " + start_p.get(counter));
            System.out.println("matcher.end: " + end_p.get(counter));
            System.out.println("matcher.group(): " + con_tent.get(counter));
        }
        System.out.println("Number of matches: " + count);
        System.out.println(outString); */
       // System.out.println(transText);
    }
    
}
