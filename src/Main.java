import java.util.*;

public class Main {


    public static void main(String args[]) {

        List<Person> listaPersone = new ArrayList<>();
        Map<String, Person> mapPersone = new HashMap<>();

        Person p1 = new Person("Marco", 25);
        Person p2 = new Person("Mario", 30);
        Person p3 = new Person("Anna", 21);
        Person p4 = new Person("Sara", 29);
        Person p5 = new Person("Sara", 26);

        // aggiungere un elemento
        listaPersone.add(p1);
        listaPersone.add(p2);
        listaPersone.add(p3);
        listaPersone.add(p4);
        listaPersone.add(p5);

        // recuperare un elemento
        System.out.println(listaPersone.get(0));
        // ordina la lista
        Collections.sort(listaPersone);
        System.out.println(listaPersone);

        // aggiungere elementi ad una mappa
        mapPersone.put(p1.getNome(), p1);
        mapPersone.put(p2.getNome(), p2);
        mapPersone.put(p3.getNome(), p3);
        mapPersone.put(p4.getNome(), p4);
        mapPersone.put(p5.getNome(), p5);

        // recuperare un elemento dalla mappa
        mapPersone.get("Sara");

        //verificare che una chiave esista
        mapPersone.containsKey("Sara");

        // ottenere tutte le chiavi
        mapPersone.keySet();

        // ottenere tutti i valori
        mapPersone.values();

        // ottenere set chiave-valore
        mapPersone.entrySet();

    }

}
