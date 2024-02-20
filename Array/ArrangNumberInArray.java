package Array;
public class ArrangNumberInArray {
    public static int[] arrangeNumberInArray(int n)
    {
        int arr[]=new int[n];
        int even=0;
        int odd=n-1;
        for(int i=0;i<n;i++){
            if(i%2==0) {
                arr[even] = i + 1;
                even++;
            }
            else {
                arr[odd] = i + 1;
                odd--;
            }
        }
        return arr;
    }
    public static void main(String []args){
        int arr[]=arrangeNumberInArray(9);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
