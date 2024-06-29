package oop.mostra_provimi;

public class CompanyyMain {
    public static void main(String[] args) {
        Center c1 = new Center("Albania", "AA1", "Presheve", 50);
        Center c2 = new Center("Albania", "AA2", "Presheve", 100);
        Company a = new Company("AAa", "Lenovo", 2);
        a.addCenter(c1);
        a.addCenter(c2);

        Center cb1 = new Center("Albania", "BB1", "Presheve", 100);
        Center cb2 = new Center("Albania", "BB2", "Presheve", 200);
        Center cb3 = new Center("Albania", "BB3", "Presheve", 300);
        Company b = new Company("AAa", "Apple", 3);
        b.addCenter(cb1);
        b.addCenter(cb2);
        b.addCenter(cb3);
//        System.out.println(a.getTotalProduction());

        System.out.println(Company.getTotalProductions(a, b));
        System.out.println(Company.maxCenterProduction(a, b));
    }

}
