package recursion2;
public class MergeSort {
    public static void mergeSort(int []arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=(si+ei)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,ei);
    }
    public static void merge(int []arr,int si,int ei){
        int size=ei-si+1;
        int mid=(si+ei)/2;
        int []brr=new int[size];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid &&j<=ei){
            if(arr[i]<arr[j]){
                brr[k]=arr[i];
                k++;
                i++;
            }else{
                brr[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            brr[k]=arr[i];
            i++;
            k++;
        }
        while (j<=ei){
            brr[k]=arr[j];
            k++;
            j++;
        }
        int m=0;
        for(int b=si;b<=ei;b++){
            arr[b]=brr[m];
            m++;
        }

    }
public static void main(String []args){
        int []arr={4,10,2,1,0,3,5};
        mergeSort(arr,0,6);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
}
}
