package com.company;

import java.util.ArrayList;
import java.util.List;

public class Fabryka {

    public static List<Kierowca> zróbKierowce() {

        List<Kierowca> kierowca = new ArrayList<>();

        kierowca.add(new Kierowca("Adam Nowak", "Ciężarówka"));
        kierowca.add(new Kierowca("Jan Kowalski", "Osobówka"));
        kierowca.add(new Kierowca("Tomasz Pietrucha", "Autobus"));

        return kierowca;
    }

    public static List<Ciężarówka> zróbCiężarówkę() {

        List<Ciężarówka> ciężarówka = new ArrayList<>();

        ciężarówka.add(new Ciężarówka("Man", 12, 107000));
        ciężarówka.add(new Ciężarówka("Volvo", 9, 155000));
        ciężarówka.add(new Ciężarówka("Scania", 14, 75000));

        return ciężarówka;
    }

    public static List<Autobus> zróbAutobus() {

        List<Autobus> autobus = new ArrayList<>();

        autobus.add(new Autobus("Ford", 15, 35000));
        autobus.add(new Autobus("Fiat", 13, 12000));
        autobus.add(new Autobus("Seat", 11, 65000));

        return autobus;
    }

    public static List<Osobówka> zróbOsobowy() {

        List<Osobówka> osobówka = new ArrayList<>();

        osobówka.add(new Osobówka("Peugeot", 1, 19000));
        osobówka.add(new Osobówka("Skoda", 1, 66000));
        osobówka.add(new Osobówka("Seat", 2, 100000));

        return osobówka;
    }

}
