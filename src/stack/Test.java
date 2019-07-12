package stack;
/**
 *@className Test
 *@description TODO
 *@author zhchxiao
 *
 *@date 19-7-12
 **/
 
public class Test {
    public static void main(String[] args) throws Exception{
        // 设置栈容量
        StackArray stackArray = new StackArray(20);
        // 入栈
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(4);
        System.out.println(stackArray.getSize());
        // 出栈
        stackArray.pop();
        stackArray.pop();
        stackArray.pop();
        stackArray.pop();
        System.out.println(stackArray.getSize());

    }
}
