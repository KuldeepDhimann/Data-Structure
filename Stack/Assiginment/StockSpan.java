package Stack.Assiginment;

import java.util.Stack;

public class StockSpan {
    public static int[] stockSpan(int []price){
        Stack<Integer>stack=new Stack<>();
        int len= price.length;
        int output[]=new int[len];
        output[0]=1;
        stack.push(0);
        for(int i=1;i<len;i++){
            while (!stack.isEmpty()&&price[stack.peek()]<price[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                output[i]=i+1;
            }else{
                output[i]=i- stack.peek();
            }
            stack.push(i);
        }
        return output;
    }
    public static void main(String[]arg){
        int in[]={60,70,80,100,90,75,80,120};
        int out[]=stockSpan(in);
        for(int x:out){
            System.out.print(x+" ");
        }
    }
}
