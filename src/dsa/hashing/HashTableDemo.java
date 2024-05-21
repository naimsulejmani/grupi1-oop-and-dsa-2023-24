package dsa.hashing;

import java.time.LocalDate;
import java.util.HashMap;

public class HashTableDemo {
    public static void main(String[] args) {
        HashTable<String> hashNames = new HashTable<>(11);
        hashNames.put("Naim");
        hashNames.put("Filan");

        HashMap<String, LocalDate> map = new HashMap<>();
        map.put("Naimi", LocalDate.of(1990, 1, 1));
        map.put("Lenda", LocalDate.now());

        System.out.println(map.get("Naimi"));

    }
}
