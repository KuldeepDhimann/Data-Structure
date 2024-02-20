package recursion3.Assignment;

public class PrintSubsetOfArray {
    public static void printSubsetOfArray(int []input,int startIndex,int []ouput){
        if(input.length==startIndex){
            for(int x:ouput){
                System.out.print(x+" ");
            }
            System.out.println();
            return;
        }
        int newOutput[]=new int[ouput.length+1];
        int i=0;
        for(;i< ouput.length;i++){
            newOutput[i]=ouput[i];
        }
        newOutput[i]=input[startIndex];
        printSubsetOfArray(input,startIndex+1,ouput);
        printSubsetOfArray(input,startIndex+1,newOutput);
    }
    public static void printSubsetOfArray(int []input){
        int ouput[]=new int[0];
        printSubsetOfArray(input,0,ouput);
    }
    public static void main(String []args){
        int []arr={1,2,3};
        printSubsetOfArray(arr);
    }
}
