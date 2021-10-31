package HW_lesson4;

public class MyLinkedStack <T>{
    private MyLinketList<T> list;

    public MyLinkedStack() {
        this.list = new MyLinketList<>();
    }

    public void push(T item){
        list.insertFirst(item);
    }

    public T pop(){
        return list.deleteFirst();
    }

    public T peek(){
        return list.getFirst();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int size(){
        return list.size();
    }

    public String display(){
        return list.toString();
    }
}
