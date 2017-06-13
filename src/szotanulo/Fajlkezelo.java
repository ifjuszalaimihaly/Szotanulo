/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szotanulo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Mihály
 */
public class Fajlkezelo {
    
    private static String fajlnev;

    public static String getFajlnev() {
        return fajlnev;
    }

    public static void setFajlnev(String fajlnev) {
        Fajlkezelo.fajlnev = fajlnev;
    }

   
    
    

    public static void kiir() {
        try {
            Writer w = new OutputStreamWriter(new FileOutputStream(fajlnev + ".txt"), "ISO8859_2");
            BufferedWriter out = new BufferedWriter(w);
            Collections.sort(Main.getSzavak());
            for (SzoPar sz : Main.getSzavak()) {
                out.write(sz.getAngol() + "_" + sz.getMagyar());
                out.newLine();
            }
            out.flush();
        } catch (FileNotFoundException e) {

        } catch (IOException ex) {

        }
    }

    public static void beolvas() {
        
        try {
            Reader r = new InputStreamReader(new FileInputStream(fajlnev + ".txt"), "ISO8859_2");
            System.out.println(fajlnev + ".txt");
            BufferedReader in = new BufferedReader(r);

            String s = "";
            while (s != null) {
                int i = 0;
                s = in.readLine();
                String angol = "";
                String magyar = "";
                if (s != null) {
                    while (s.charAt(i) != '_') {
                        angol += s.charAt(i);
                        i++;
                    }                    
                    i++;
                    magyar = s.substring(i);
                    SzoPar szopar = new SzoPar(angol, magyar);                   
                    Main.getSzotanulo().bevitelEllenorzes(szopar);
                }
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
                
        } catch (IOException ex) {

        }

    }

}
