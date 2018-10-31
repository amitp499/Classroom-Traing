package com.Collection;
import java.util.*;
public class CollectionDemo {

    public static void main(String[] args) {

        List data = new ArrayList();
        data.add(100);
        data.add(123);
        data.add("Amit");
        data.add(128);
        data.add("Amit");
        data.add(123);

        Iterator it= data.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("------------------------------");
        Set data2 = new HashSet();
        data2.addAll(data);

        Iterator in = data2.iterator();



        while(in.hasNext()){
            System.out.println(in.next());
        }

        System.out.println("------------------------------");

        List d = Arrays.asList("3","Amit","Test");

        Iterator as = d.iterator();

        while(as.hasNext()){
            System.out.println(as.next());
        }


        Integer n =11;
        Integer a = 55;

        System.out.println(n.compareTo(a));

        Integer n1 =110;
        Integer a1 = 55;

        System.out.println(n1.compareTo(a1));


        Integer n2 =55;
        Integer a2 = 55;

        System.out.println(n2.compareTo(a2));

    }
}
