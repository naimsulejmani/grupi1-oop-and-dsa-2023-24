package oop.mostra_provimi;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private String address;
    private List<Center> centers;
    private Center[] centerArray;
    private int totalCenters;

    public Company(String address, String name, int totalCenters) {
        this.address = address;
        this.name = name;
        this.totalCenters = totalCenters;
        centerArray = new Center[totalCenters];
        centers = new ArrayList<>();

    }

    public void addCenter(Center center) {
        if (centers.size()<totalCenters) {
            centers.add(center);
        }else {
            throw new ArrayIndexOutOfBoundsException();
        }

    }

    public int getTotalProduction(){
        int sum = 0;
        for (Center center : centers) {
            sum+=center.getTotalProduction();
        }
        return sum;
    }



    public static int getTotalProductions(Company... companies) {
        int sum = 0;
        for(Company company : companies) {
            sum+=company.getTotalProduction();
        }
        return sum;
    }

    public static Center maxCenterProduction(Company... companies) {
        Center maxCenter = companies[0].centers.get(0);
        for (Company company: companies) {
            if(company.centers.size()>0) {
                for(Center center : company.centers) {
                    if(center.getTotalProduction()>maxCenter.getTotalProduction()) {
                        maxCenter=center;
                    }
                }
            }
        }
        return maxCenter;
    }














}
