import java.util.Scanner;
public class LargestRowOrColumn {
    public static int[][] inputArray(){
        Scanner in = new Scanner(System.in);
        int rows=in.nextInt();
        int cols=in.nextInt();
        int [][]arr=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
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
    public static void largestRowOrColumn(int [][]arr){
        int row=Integer.MIN_VALUE;
        int col=Integer.MIN_VALUE;
        int rowindex=0;
        int columnidnex=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum=sum+arr[i][j];
            }
            if(sum>row){
                row=sum;
                rowindex=i;
            }
        }

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum=sum+arr[j][i];
            }
            if(sum>col){
                col=sum;
                columnidnex=i;
            }
        }
        if(row>col){
            System.out.println("row "+rowindex+" "+row);
        }
        else
            System.out.println("column "+columnidnex+" "+col);
    }
    public static void main(String []args){
        int [][]arr=inputArray();
        printArray(arr);
        largestRowOrColumn(arr);

    }
}
