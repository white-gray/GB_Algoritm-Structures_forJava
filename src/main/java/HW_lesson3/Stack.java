package HW_lesson3;

import java.util.Arrays;

class Stack{
    private int maxSize;
    private Object[] stack;
    private int top;

    public Stack(int size){
        this.maxSize = size;
        this.stack = new Object[this.maxSize];
        this.top = -1;
    }

    public void push(Object i){
        this.stack[++this.top] = i;
    }

    public Object  pop(){
        return this.stack[this.top--];
    }

    public Object peek(){
        return this.stack[this.top];
    }

    public boolean isEmpty(){
        return (this.top == -1);
    }

    public boolean isFull(){
        return (this.top == this.maxSize-1);
    }

    public int length() {
        return this.maxSize;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Stack{");
        sb.append("stack=").append(stack == null ? "null" : Arrays.asList(stack).toString());
        sb.append('}');
        return sb.toString();
    }
}

