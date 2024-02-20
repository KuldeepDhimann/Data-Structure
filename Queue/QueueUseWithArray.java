package Queue;

public class QueueUseWithArray {
    public static void main(String[]args){
        QueueUsingArray queue=new QueueUsingArray();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println(queue.size());

        System.out.println();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println();
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
