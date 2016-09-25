/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oushneek
 */
public class Count {

    private int wordCount=0;
    int i,j,tokentmp=0,flag=0,p,q=2,m,n,tmp;
    
    String[] wordlist =new String[10000000];
    String[] voclist=new String[10000000];
    
    private Integer[] freq=new Integer[10000000];
    
    String test=new String();
    String strtmp;
    boolean x;
    
     void read(BufferedReader in) {
        try {
            /*  WORD COUNTING  */
            
            while ((test = in.readLine()) != null){
                
               
                StringTokenizer b= new StringTokenizer(test,", |;!?:.১২৩৪৫৬৭৮৯০(){}[]");
                tokentmp=b.countTokens();
                wordCount+=tokentmp;
                while(b.hasMoreTokens()){
                    wordlist[i++]=b.nextToken();
                    //System.out.print(wordlist[i-1]);
                   
                
                }
            }
           
        } catch (IOException ex) {
            Logger.getLogger(Count.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*  VOCABULARY SIZE  */
       
        voclist[1]=wordlist[1];
        freq[1]=1;
        //System.out.println(voclist[1]);
       
        for(j=2;j<i;j++){
            //System.out.println(wordlist[j]);
                for(p=1;p<j;p++){
                    if(wordlist[j].equals(wordlist[p])){
                        flag=1;
                        break;
                    }
                    else
                        flag=0;
                }
                if(flag==1){
//                   ++freq[p];
                    flag=0;
                }
                else{
                    voclist[q]=wordlist[j];
                    //System.out.print(voclist[q]+" ");
                    freq[q++]=1;
                    flag=0;
                }
        }
        
        /*  TOP 10 FREQUENT WORDS   */
        
//        for(m=1;m<q;m++){
//            for(n=m+1;n<q;n++){
//                if(freq[m]<freq[n]){
//                    
//                    //System.out.println("beforw swap : "+voclist[m]+" "+freq[m]);
//                    tmp=freq[m];
//                    strtmp=voclist[m];
//                     //System.out.println("strtmp =: "+voclist[m]+"tmp="+freq[m]);
//                    
//                    freq[m]=freq[n];
//                    voclist[m]=voclist[n];
//                    
//                    freq[n]=tmp;
//                    voclist[n]=strtmp;
//                }
//            }
//        }
//        
        /*  REQUIRED OUTPUT  */
        
        System.out.println("CORPUS SIZE = "+(wordCount));
        System.out.println("VOCABULARY SIZE= "+(q));
//        for(i=1;i<=10;i++)
//            System.out.println(voclist[i]+" = "+freq[i]);
    }
}