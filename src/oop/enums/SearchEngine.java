package oop.enums;

public enum SearchEngine {
    GOOGLE("https://www.google.com"),
    BING("https://www.bing.com"),
    YAHOO("https://www.yahoo.com");

    private String url;

    private SearchEngine(String url) {
        this.url = url;
    }

    private SearchEngine(){}

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
















