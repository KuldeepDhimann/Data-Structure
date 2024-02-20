package TwoDimensionalArray;
public class LargestRowOrColumn {
    public static void largestRowOrColSum(int [][]arr){
        int largestSum=Integer.MIN_VALUE;
        boolean isRow=true;
        int row=arr.length;
        int index=-1;
        if(row==0){
            System.out.println("row "+index+" "+largestSum);
        }
        int col=arr[0].length;
        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<col;j++){
                sum=sum+arr[i][j];
            }
            if(largestSum<sum){
                largestSum=sum;
                index=i;
            }
        }
        for(int j=0;j<col;j++){
            int sum=0;
            for(int i=0;i<row;i++){
                sum=sum+arr[i][j];
            }
            if(largestSum<sum){
                isRow=false;
                largestSum=sum;
                index=j;
            }

        }
        if(isRow)
            System.out.println("row "+index+" "+largestSum);
        else
            System.out.println("column "+index+" "+largestSum);
    }
    public static void main(String []args){
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        largestRowOrColSum(arr);
    }
}
