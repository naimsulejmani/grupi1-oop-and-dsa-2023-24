package oop.inheritance.ushtrime;

public class Roboti {
    private String name;
    private String processor;
    public int age;

    public Roboti(String name, String processor) {
        this.name = name;
        this.processor = processor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String whoIAm() {
        return "I am just a robot!";
    }

    @Override
    public String toString() {
        return "Roboti{" +
                "name='" + name + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
