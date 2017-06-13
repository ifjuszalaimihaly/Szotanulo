/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szotanulo;

import java.util.ArrayList;

/**
 *
 * @author Mihály
 */
public class Main {

    private static ArrayList<SzoPar> szavak;
    private static Szotanulo szotanulo;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        szavak = new ArrayList<>();
        szotanulo = new Szotanulo();
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    Main.szotanulo.getTanulandoText().setText("A megtanulandó szavak száma: " + szavak.size());
                }
            }
        });
        t.start();
        

    }

    public static ArrayList<SzoPar> getSzavak() {
        return szavak;
    }

    public static Szotanulo getSzotanulo() {
        return szotanulo;
    }

}
