package SearchingAndSorting.Assignment;
public class CheckArrayRotation {
    public static int checkRotation(int arr[]){
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>arr[i+1]){
                return i+1;
            }
        }
        return 0;
    }
    public static void main(String []args){
        int []arr={1,2,3,4,5,6,4,2,1};
        System.out.println(checkRotation(arr));
    }
}
