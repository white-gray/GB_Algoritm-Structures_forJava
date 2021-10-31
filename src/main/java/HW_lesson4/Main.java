package HW_lesson4;

public class Main {

    public static void main(String[] args) {
        MyLinkedStack mls = new MyLinkedStack();
        System.out.println("Now we have: mls.display() = " + mls.display());
        System.out.println("\t\t\tmls.isEmpty() = " + mls.isEmpty());

        mls.push(1);
        mls.push("a");
        mls.push("b");
        mls.push("c");
        mls.push(2);
        mls.push(3);
        mls.push(4);
        mls.push(5);

        int sizeStack=mls.size();
        for (int q = 0; q < sizeStack; q++) {
            System.out.println("\nWe will pop and now we have");
            System.out.println("\tmls.верхний элемент() = " + mls.peek());
            System.out.println("\tmls.display() = " + mls.display());
            System.out.println("\tmls.size() = " + mls.size());
            mls.pop();
        }


    }

}
