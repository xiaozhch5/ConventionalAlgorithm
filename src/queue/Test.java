package queue;
/**
 *@className Test
 *@description 基于数组的队列实现
 *@author zhchxiao
 *
 *@date 19-7-12
 **/
 
public class Test {
    public static void main(String[] args){
        QueueArray queueArray = new QueueArray(100);
        queueArray.enqueue(1);
        queueArray.enqueue(2);
        queueArray.enqueue(2);
        queueArray.enqueue(2);
        queueArray.enqueue(2);
        queueArray.enqueue(2);
        System.out.println(queueArray.getSize());
        queueArray.dequeue();
        System.out.println(queueArray.getSize());
    }
}
