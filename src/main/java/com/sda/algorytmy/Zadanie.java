package com.sda.algorytmy;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        {

            Scanner sk = new Scanner(System.in);
            while (true) {

                String linia = sk.nextLine();

                if (linia.equals("-")) {
                    break;

                }
                stringList.add(linia);

            }
            System.out.println("Lista imion: ");
            for (String el : stringList) {
                System.out.println("Imię:" + el);
            }

        }
    }
}
