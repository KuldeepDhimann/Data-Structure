package Array.Assignment;
public class FindUnique {
    public static int findUnique(int arr[]){
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=0;j<arr.length;j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        break;
                    }
                }
            }
            if(j== arr.length){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int arr[]={1,2,3,2,3,1,5};
        System.out.println(findUnique(arr));
    }
}
