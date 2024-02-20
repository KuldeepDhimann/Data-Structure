package recursion3.Assignment;

public class PrintSubsetSumtoK {
    public static void printSubsetSumOfK(int []input,int startIndex,int []output,int k){
        if(startIndex==input.length){
            if(k==0){
                for(int x:output){
                    System.out.print(x);
                }
                System.out.println();
                return;
            }else{
                return;
            }
        }
            int newOutput[]=new int[output.length+1];
            int i=0;
            for(;i< output.length;i++){
                newOutput[i]=output[i];
            }
            newOutput[i]=input[startIndex];
            printSubsetSumOfK(input,startIndex+1,output,k);
            printSubsetSumOfK(input,startIndex+1,newOutput,k-input[startIndex]);
        }
        public static void printSubsetSumOfK(int []input,int k){
            int output[]=new int[0];
             printSubsetSumOfK(input,0,output,k);
        }
        public static void main(String []args){
            int []input={3,2,5,1,4,6};
            printSubsetSumOfK(input,8);
        }
}

