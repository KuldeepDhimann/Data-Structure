import java.util.Scanner;
public class RowWiseSum {
    public static int[][] inputArray(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the rows no.s ");
        int m=in.nextInt();
        System.out.println("enter the columns no.s");
        int n=in.nextInt();
        int [][]arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            }
        }
        return arr;
    }
    public static void printArray(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void rowWiseSum(int [][]arr){
        int brr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum=sum+arr[i][j];
            }
            brr[i]=sum;
        }
        for(int i=0;i< brr.length;i++){
            System.out.println(brr[i]+" ");
        }
    }
    public static void main(){
        //   Scanner in = new Scanner(System.in);
        //  System.out.println("how many case you want to run");
        //  int n=in.nextInt();
        //  int count=0;
        //  while(count<n){
        //  int [][][]brr=new int[n][][];
        //  for(int i=0;i<n;i++){
        //       for(int j=0;j<n;){
        //      brr[i][]=inputArray()
        //}
        //}
        int [][]arr=inputArray();
        printArray(arr);
        rowWiseSum(arr);
    }

}
