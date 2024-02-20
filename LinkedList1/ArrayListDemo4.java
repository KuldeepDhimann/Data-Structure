package LinkedList1;

import java.sql.SQLOutput;
import java.util.ArrayList;
public class ArrayListDemo4 {
    public static void main(String []args){
        ArrayList <Integer>arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        System.out.println(arr.size());

        for(int x:arr){
            System.out.print(x+" ");
        }

        System.out.println();
        System.out.println(arr.get(2));
        arr.add(0,100);
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        arr.remove(1);
        for(int x:arr){
            System.out.print(x+" ");
        }
        arr.set(0,200);
        Integer i=50;
        arr.remove(i);
        System.out.println();
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
