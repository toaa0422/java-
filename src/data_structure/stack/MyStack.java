package data_structure.stack;

import com.sun.org.apache.regexp.internal.REUtil;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.nio.channels.Pipe;

public class MyStack {
    private int maxStack;
    private int[] stack;
    private int top = -1;

    public MyStack(int maxStack) {
        this.maxStack = maxStack;
        stack = new int[maxStack];
    }

    public boolean isFull() {
        return this.top == this.maxStack - 1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public void push(int val) {
        if (isFull()) {
            throw new RuntimeException("the stack is full!");
        }
        top++;
        stack[top] = val;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("null stack! no data!");
        }
        int value = stack[top];
        top--;
        return value;
    }

    public void list() {
        if (isEmpty()) {
            throw new RuntimeException("null stack");
        }
        for (int i = 0; i < stack.length; i++) {
            System.out.printf("stack[%d]=%d\n", i, stack[i]);
        }
    }

    public int length() {
        return this.top + 1;
    }

    public boolean isOper(char v) {
        return v=='+'||v=='-'||v=='*'||v=='/';
    }

    public int priority(int oper) {
        if (oper == '*' || oper == '/') {
            return 1;
        } else if (oper == '+' || oper == '-') {
            return 0;
        } else {
            return -1;
        }
    }

    public int peek() {
        return this.stack[top];
    }

    public int stackLength() {
        return this.stack.length;
    }

    public int calculate(int num1, int num2, int oper) {
        int result = 0;
        switch (oper) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                break;
        }
        return result;
    }

}
