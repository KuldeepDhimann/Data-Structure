package recursion3.Assignment;
public class BinarySearch {
    public static int binarySearch(int arr[],int startIndex,int endIndex,int item){
        if(startIndex>endIndex){
            return -1;
        }
        int mid =(startIndex+endIndex)/2;
        if(arr[mid]==item){
            return mid;
        }
        if(arr[mid]>item){
            return binarySearch(arr,startIndex,mid-1,item);
        }else {
            return  binarySearch(arr,mid+1,endIndex,item);
        }
    }
    public static int binarySearch(int []arr,int item){
        return binarySearch(arr,0,arr.length-1,item);
    }
    public static void main(String []args){
        int arr[]={1,2,3,4,5,6};
        System.out.println(binarySearch(arr,6));
    }
}
