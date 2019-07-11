package linkedlist;
/**
 *@className Test
 *@description TODO
 *@author zhchxiao
 *
 *@date 19-7-11
 **/
 
public class Test {
    public static void main(String[] args){
        MyLinkedList myLinkedList = new MyLinkedList();

        // 增加链表内容
        myLinkedList.addNode(11);
        myLinkedList.addNode(22);
        myLinkedList.addNode(33);

        // 打印链表长度
        System.out.println(myLinkedList.getLength());

        // 删除链表指定位置内容
        myLinkedList.deleteNode(2);
        System.out.println(myLinkedList.getLength());

        // 输出链表内容
        Node node = myLinkedList.getHead();
        while(node!=null){
            System.out.println(node.getData());
            node = node.getNext();
        }
    }
}
