package oop.mostra_provimi;

public class Shkolla {
    private String name;
    private String address;
    private long identityNo;
    private int classNo;
    private int studentNo;

    public Shkolla(String name, String address, long identityNo, int classNo, int studentNo) {
        this.name = name;
        this.address = address;
        this.identityNo = identityNo;
        setClassNo(classNo);
//        this.classNo = classNo;
//        this.studentNo = studentNo;
        setStudentNo(studentNo);
    }

    public Shkolla() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(long identityNo) {
        this.identityNo = identityNo;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        if (classNo < 0 || classNo > 20) {
            System.out.println("Nuk lejohen klase te vler....");
            return;
        }
        this.classNo = classNo;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        if (studentNo > 0 && studentNo <= 100)
            this.studentNo = studentNo;
        else System.out.println("Nuk lejohen vlera te tilla");
    }

    public static void main(String[] args) {
        Shkolla sh1 = new Shkolla("Emin Duraku","Prishtine 1",123132,80,10);
        Shkolla sh2 = new Shkolla("Emin Duraku","Prishtine 1",123132,80,10);

        sh1.setStudentNo(20);
        sh2.setClassNo(10);
        System.out.println(sh1.getName());
        System.out.println(sh1.getAddress());
        System.out.println(sh1.getIdentityNo());


        int y = 9;
        int x = 11;
        y +=--x + 1;
        System.out.println(y--);
        System.out.println(y--);
        System.out.println(--y);
    }
}
