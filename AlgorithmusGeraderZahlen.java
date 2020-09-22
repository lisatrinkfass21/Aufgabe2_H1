/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe2;

import aufgabe1.ErastothenesPrimeSieve;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lisa
 */
public class AlgorithmusGeraderZahlen {

    private ArrayList<Integer> primeList;
    ErastothenesPrimeSieve es;
    private ArrayList<Integer> natList;

    public static void main(String[] args) {
        System.out.println("Geben Sie eine Obergrenze ein");
        Scanner scan = new Scanner(System.in, "Windows-1252");
        int obergrenze = 0;
        while (obergrenze < 1) {
            try {
                obergrenze = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Fehler - Sie haben keine Zahl eingegeben");
            }
            if (obergrenze < 1) {
                System.out.println("bitte geben Sie eine positive Zahl ein");
            }
        }
        AlgorithmusGeraderZahlen az = new AlgorithmusGeraderZahlen(obergrenze);

    }

    public AlgorithmusGeraderZahlen(int ober) {
        es = new ErastothenesPrimeSieve(ober);
        primeList.addAll(es.getListOfPrimes());
        for (int i = 4; i < ober; i++) {
            natList.add(i);
            i++;
        }
    }

    private void printAlgorithmus() {

    }

    private void calcAlgorithmus(int natZahl) {

    }

}
