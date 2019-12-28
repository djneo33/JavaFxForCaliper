package com.company;

public class Main {

    public static void main(String[] args) {
        double currentPop = 312032486;
       double birth = 4505142.857;
       double death = 2425846.154;
       double immigrant = 700800;
       currentPop = currentPop + birth + immigrant - death;
       System.out.println("Population after 1 year: "+currentPop);
        currentPop = currentPop + birth + immigrant - death;
        System.out.println("Population after 2 years: "+currentPop);
        currentPop = currentPop + birth + immigrant - death;
        System.out.println("Population after 3 years: "+currentPop);
        currentPop = currentPop + birth + immigrant - death;
        System.out.println("Population after 4 years: "+currentPop);
        currentPop = currentPop + birth + immigrant - death;
        System.out.println("Population after 5 years: "+currentPop);
    }
}
