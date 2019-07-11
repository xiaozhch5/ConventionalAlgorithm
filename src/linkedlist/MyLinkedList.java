package linkedlist;
/**
 *@className MyLinkedList
 *@description TODO
 *@author zhchxiao
 *
 *@date 19-7-11
 **/
 
public class MyLinkedList {
    // 指定头节点
    private Node head = null;

    public Node getHead(){
        return head;
    }

    /**
     * 获得链表长度
     * @return l 链表长度
     */
    public int getLength(){
        int length = 1;
        Node tmp = head;
        while(tmp.getNext() != null){
            length = length + 1;
            tmp = tmp.getNext();
        }
        return length;
    }

    /**
     * 向链表插入数据
     * @param d 插入数据
     */
    public void addNode(int d){
        Node newNode = new Node(d);
        if(head == null){
            head = newNode;
        }else{
            Node tmp = head;
            while(tmp.getNext()!=null){
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);

        }



    }

    /**
     * 删除链表第i个节点数据(从1开始计数)
     * @param i
     * @return b
     */
    public boolean deleteNode(int i) {
        if(i < 1 || i > getLength()){
            return false;
        }
        if(i == 1){
            head.setNext(head.getNext());
            return true;
        }
        Node tmp = head;
        int index = 2;
        while(tmp.getNext() != null){
            if(index == i){
                tmp.setNext(tmp.getNext().getNext());
                break;
            }

            tmp = tmp.getNext();
        }
        return true;
    }

}
