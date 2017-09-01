package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Kierowca> moiKierowcy = Fabryka.zróbKierowce();

        System.out.println("Moi kierowcy: ");
        for (Kierowca kierowcy : moiKierowcy) {
            System.out.println(kierowcy.getName());
        }

        System.out.println("-----------");

        List<Ciężarówka> mojeCiężąrówki = Fabryka.zróbCiężarówkę();
        System.out.println("Moje ciężarówki: ");
        for (Ciężarówka ciężarówki : mojeCiężąrówki) {
            System.out.println(ciężarówki.getMarka());
        }

        System.out.println("-----------");

        List<Osobówka> mojeOsobówki = Fabryka.zróbOsobowy();
        System.out.println("Moje osobówki: ");
        for (Osobówka osobówki : mojeOsobówki) {
            System.out.println(osobówki.getMarka());
        }

        System.out.println("-----------");

        List<Autobus> mojeAutobusy = Fabryka.zróbAutobus();
        System.out.println("Moje autobusy: ");
        for (Autobus autobusy : mojeAutobusy) {
            System.out.println(autobusy.getMarka());
        }

        System.out.println("-------------");
        mojeOsobówki.get(0);
    }

}
