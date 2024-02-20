package Array.Assignment;
public class PairSum {
    public static int pairSum(int arr[],int num){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=arr[i]+arr[j];
                if(temp==num)
                    count++;
            }
        }
        return count;
    }
    public static void main(String []args){
        int []arr={1,2,3,4,5,6,7,8,9};
        System.out.println(pairSum(arr,8));
    }
}
