package linkedlist;
/**
 *@className Node
 *@description 节点
 *@author zhchxiao
 *
 *@date 19-7-11
 **/
 
public class Node {
    private Node next = null;
    private int data;

    public Node(int data){
        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
