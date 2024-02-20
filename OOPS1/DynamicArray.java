package OOPS1;
public class DynamicArray{
    private  int data[];
    private int nextElementIndex;
    public DynamicArray(){
        data=new int[5];
        nextElementIndex=0;
    }
    public int size(){
        return nextElementIndex;
    }
    public boolean isEmpty(){
        return (nextElementIndex==0);
    }
    public int get(int index){
        if(index>=nextElementIndex){
            return -1;
        }
        return data[index];
    }
    public void set(int index,int item){
        if(index>=nextElementIndex){
            return;
        }
        data[index]=item;
    }
    public void add(int item){
        if(nextElementIndex==data.length)
            doubleCapacity();
        data[nextElementIndex]=item;
        nextElementIndex++;
    }
    public void doubleCapacity(){
        int []temp=data;
        data=new int[2*temp.length];
        for(int i=0;i<temp.length;i++){
            data[i]=temp[i];
        }
    }
    public void removeLast(){
        if(nextElementIndex==0){
            return;
        }
        data[nextElementIndex-1]=0;
        nextElementIndex--;
    }
}
class Test{
    public static void main(String[]args){
        DynamicArray d=new DynamicArray();
        for(int i=0;i<100;i++){
            d.add(i+100);
        }
        System.out.println(d.size());
        System.out.println(d.get(2));
        d.set(3,170);
        System.out.println(d.get(3));
    }

}
