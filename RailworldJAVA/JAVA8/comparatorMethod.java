package JAVA8;

import java.util.ArrayList;

import java.util.Collections;

public class comparatorMethod {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();

        al.add(2);
        al.add(1);
        al.add(5);
        al.add(3);
        al.add(4);

        Collections.sort(al,(a,b)-> b-a);   //It will sort in descending order
        System.out.println(al);
    }
}
