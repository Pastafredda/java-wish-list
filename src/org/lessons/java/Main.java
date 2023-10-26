package org.lessons.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //chiedere i dati del regalo ed inserirli in un array list
         Scanner scanner = new Scanner(System.in);

        //creazione array list
        List<Regalo> regali = new ArrayList<>();

        //creazione variabile per fermarsi
        boolean exit= false;

        while (!exit){
            System.out.println("Vuoi inserire un nuovo regalo? si/no");
            exit= scanner.nextLine().equals("no");
            if (!exit){
                System.out.println("Inserisci la descrizione del regalo");
                String descrizione= scanner.nextLine();
                System.out.println("Inserisci il destinatario");
                String destinatario=scanner.nextLine();
                regali.add(new Regalo(descrizione, destinatario));
                System.out.println(regali.size());
            }
        }
        System.out.println(regali.size());
        System.out.println(regali.toString());
        scanner.close();
    }

}
