package oop.arraylists.example_slide;

import java.util.ArrayList;

public class CsvDemo {
    public static void main(String[] args) {
        String csvText = """
                Naim Sulejmani,1986,12,1
                Filan Fisteku,2000,1,1
                Partin Nallbani,2002,7,17
                Agon Krasniqi,,,
                Test
                """;

        String[] rows = csvText.split("\n");
        ArrayList<Person> persons = new ArrayList<>();

        for (String row : rows) {
            String[] cells = row.split(",");
            if (cells.length != 4) {
                System.out.println("Formati jovalid i te dhenave: " + row);
            } else {
                String name = cells[0];
                int year = Integer.parseInt(cells[1]);
                int month = Integer.parseInt(cells[2]);
                int day = Integer.parseInt(cells[3]);

                Person person = new Person(name, year, month, day);
                persons.add(person);
            }
        }
//        System.out.println(rows.length);
        //shko per cdo person printo ne konsole/ne te arhdmen ne file
        for (Person person : persons) {
            System.out.println(person);
        }

    }
}
