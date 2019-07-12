package stack;
/**
 *@className StackArray
 *@description 基于数组的栈的实现，容量固定为1024
 *@author zhchxiao
 *
 *@date 19-7-12
 **/
 
public class StackArray {
    private static final int capacity = 1024;
    // 存储栈元素
    private Object[] s;
    //　top用于记录栈顶
    private int top = -1;

    //　默认栈容量
    public StackArray(){
        this.s = new Object[capacity];
    }
    // 指定栈容量
    public StackArray(int realCapacity){
        this.s = new Object[realCapacity];
    }

    // 获取当前栈的规模
    public int getSize(){
        return top+1;
    }

    // 入栈
    public void push(Object obj) throws Exception{
        s[++top] = obj;
    }

    // 出栈
    public Object pop() throws Exception{
        Object elem;
        elem = s[top];
        s[top--] = null;
        return elem;
    }
}
