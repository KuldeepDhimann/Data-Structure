package Array.Assignment;
public class Intersection {
    public static void intersection(int arr[],int brr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<brr.length;j++){
                if(arr[i]==brr[j]){
                    System.out.print(arr[i]+" ");
                    brr[j]=Integer.MIN_VALUE;
                }
            }
        }
    }
    public static void main(String []args){
        int arr[]={9,8,7,6,5,4};
        int brr[]={5,4,9,0,1,2};
        intersection(arr,brr);
    }

}
