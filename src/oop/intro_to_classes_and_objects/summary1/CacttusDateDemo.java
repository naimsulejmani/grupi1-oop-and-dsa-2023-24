package oop.intro_to_classes_and_objects.summary1;

public class CacttusDateDemo {
    public static void main(String[] args) {
        CacttusDate d1 = new CacttusDate();
        d1.printDate();
        CacttusDate d2 = new CacttusDate(2024,2,29);
        d2.printDate();
        d2.setDay(30);
    }
}
