/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Oushneek
 */
public class TakeFile {
    public void read(){
        try {
                BufferedReader br = new BufferedReader(new FileReader("F:/CSE-363(Ad_Algo)/LAB/2010331027_Oct01_2009/1.coverStory.txt"));
                
                Count counter= new Count();
                counter.read(br);
                
            
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TakeFile.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}