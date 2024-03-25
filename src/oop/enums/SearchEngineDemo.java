package oop.enums;

public class SearchEngineDemo {
    public static void main(String[] args) {
        SearchEngine agonisFavourite = SearchEngine.GOOGLE;
        SearchEngine rinesasFavourive = SearchEngine.BING;

        System.out.println(agonisFavourite);
        System.out.println(agonisFavourite.getUrl());
        agonisFavourite.setUrl("https://www.google.it");
        System.out.println(agonisFavourite.getUrl());

        SearchEngine engine = SearchEngine.valueOf("GOOGLE");

        //1. Secili objekt i enum/class e ka metoden toString
        System.out.println(engine.toString());
        //2. Secili objekt i enum/class e ka metoden equals
        System.out.println(engine.equals(SearchEngine.GOOGLE));
        System.out.println(engine.equals(SearchEngine.BING));

        //3. Secili objekt i enum e ka metoden compareTo
        System.out.println(engine.compareTo(SearchEngine.YAHOO));
        System.out.println(SearchEngine.YAHOO.compareTo(engine));

        //4. static enum-type valueOf
        engine = SearchEngine.valueOf("YAHOO");

        //5. static enum-type[] values()
        SearchEngine[] array = SearchEngine.values();

        for (SearchEngine eng : array) {
            System.out.printf("%s -> %s %n", eng.toString(), eng.getUrl());
        }


    }
}














