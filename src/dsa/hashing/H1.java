package dsa.hashing;

public class H1 {
    private int id;

    public H1(int id) {
        this.id = id;
    }

    public H1() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "H1{" +
                "id=" + id +
                '}';
    }
}
