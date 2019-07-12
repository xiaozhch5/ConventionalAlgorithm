package queue;
/**
 *@className QueueArray
 *@description 基于数组的队列实现，由于队列的不断操作，会使ｆ和ｒ不断增加的情况，为解决这种情况，当ｆ等于指定容量时候，整体移动数组
 *@author zhchxiao
 *
 *@date 19-7-12
 **/
 
public class QueueArray {
    // 默认队列容量
    private static final int capacity = 1024;
    // 对象数组
    private Object[] q;
    // 队首元素位置
    private int f = 0;
    // 队尾元素位置
    private int r = 0;

    // 构造默认容量队列
    public QueueArray(){
        this.q = new Object[capacity];
    }

    // 构造指定容量队列
    public QueueArray(int realCapacity){
        this.q = new Object[realCapacity];
    }

    // 入队
    public void enqueue(Object obj){
        q[f++] = obj;
    }

    // 出队
    public Object dequeue(){
        return q[r++];
    }

    // 获取当前队列规模
    public int getSize(){
        return f - r;
    }
}
