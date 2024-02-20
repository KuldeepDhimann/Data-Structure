package SearchingAndSorting;
public class BinarySearch {
    public static int binarySearch(int arr[],int n){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid= (start+end)/2;
            if(arr[mid]>n){
                end=mid-1;
            }
            else if(arr[mid]<n){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String []args){
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr,8));
    }
}
