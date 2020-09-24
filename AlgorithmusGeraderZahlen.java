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

    private ArrayList<Integer> primeList = new ArrayList<Integer>();
    private ErastothenesPrimeSieve eps;
    private ArrayList<Integer> natList = new ArrayList<Integer>();

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

        az.printAlgorithmus();
    }

    public AlgorithmusGeraderZahlen(int ober) {
        eps = new ErastothenesPrimeSieve(ober);
        primeList.addAll(eps.getListOfPrimes());
        for (int i = 4; i <= ober; i++) {
            natList.add(i);
            i++;
        }
    }

    private void printAlgorithmus() {
        for (int i = 0; i < natList.size(); i++) {
            System.out.println(calcAlgorithmus(natList.get(i)));
        }
    }

    private String calcAlgorithmus(int natZahl) {
        int r = 0;
        for (int i = primeList.size(); i > 0; i--) {
            if (primeList.get(i - 1) < natZahl) {
                r = primeList.get(i - 1);
                if (primeList.contains(natZahl - r)) {
                    return (natZahl + " summe: " + natZahl + " = " + r + " + " + (natZahl - r));
                }
            }
        }
        return ("");
    }

}
