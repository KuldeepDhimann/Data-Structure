package LinkedList1;

import java.util.ArrayList;
public class RemoveConscutiveDuplicates {
    public static ArrayList<Integer> removeConsecutiveDuplicates(int []arr){
        ArrayList<Integer>result=new ArrayList<>();
        result.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                result.add(arr[i]);
            }
        }
        return result;
    }
    public static void main(String []args){
        int arr[]={1,1,1,2,2,2,2,3,3,3,3,4,4,6,1,2,3};
        ArrayList<Integer>output=removeConsecutiveDuplicates(arr);
        for(int x:output){
            System.out.print(x+" ");
        }
    }
}
