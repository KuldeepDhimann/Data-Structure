package Array.Assignment;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class TripletSum {
    public static int tripletSum(int arr[],int x){
        int count=0;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==x)
                        count++;
                    }
                }
            }
        return count;
        }
        public static void main(String []args){
        int arr[]={9,8,7,6,5,4,3,2,1};
            System.out.println(tripletSum(arr,8));
    }
}
