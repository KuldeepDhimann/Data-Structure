package recursion2;
public class QuickSort {
    public static void quickSort(int []arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int povit=partition(arr,si,ei);
        quickSort(arr,si,povit-1);
        quickSort(arr,povit+1,ei);
    }
    public static int partition(int []arr,int si,int ei){
        int povit=arr[si];
        int count=0;
        for(int i=si+1;i<=ei;i++){
            if(arr[i]<=povit){
                count++;
            }
        }
        int povitIndex=si+count;
        arr[si]=arr[povitIndex];
        arr[povitIndex]=povit;
        int i=si;
        int j=ei;
        while(i<povitIndex&&j>povitIndex){
            if(arr[i]<povit){
                i++;
            }
            else if(arr[j]>povit){
                j--;
            }
            else {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return povitIndex;
    }
    public static void main(String []args){
        int []arr={4,10,2,1,0,3,5};
        quickSort(arr,0,6);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
