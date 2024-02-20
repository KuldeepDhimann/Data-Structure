package practice;
public class GivenSumInRotatedSortedArray {
    public static boolean givenSum(int[] arr,int k) {
        int n = arr.length;
        int povitIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                povitIndex = i;
                break;
            }
        }
        int l=(povitIndex+1)%n;
        int r=povitIndex;
        while(l!=r){
            int sum=arr[l]+arr[r];
            if(sum==k){
                return true;
            }else if(sum<k){
                l=(l+1)%n;
            }else{
                r=(n+r-1)%n;
            }
        }
    return false;
    }
    public static void main(String[]args){
        int arr[] = {11, 15, 6, 8, 9, 10};
        System.out.println(givenSum(arr,166));

    }
}
