package HW_lesson3;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class Dec {
    private int maxSize;
    private Object[] dec;
    private int topLeft;
    private int topRight;

    public Dec(int size) {
        this.maxSize = size;
        this.dec = new Object[this.maxSize];
        this.topLeft = -1;
        this.topRight = maxSize;
    }

    public void insertLeft(Object i) {
        checkFull();
        slideToRight(this.topLeft++, 0);
        this.dec[0] = i;
    }

    private void slideToRight(int start, int stop) {
        for (int i = start; i >= stop; i--) {
            this.dec[i + 1] = this.dec[i];
            this.dec[i] = null;
        }
    }

    public void insertRight(Object i) {
        checkFull();
        slideToLeft(--this.topRight, this.maxSize);
        this.dec[this.maxSize-1] = i;
    }

    private void checkFull() {
        if (isFull()) {
            throw new IllegalArgumentException("Dec is full!!!");
        }
        System.out.println();
    }


    private void slideToLeft(int start, int stop) {
        for (int i = start; i < stop; i++) {
            this.dec[i - 1] = this.dec[i];
            this.dec[i] = null;
        }
    }

    public Object removeLeft() {
        Object temp = this.dec[0];
        slideToLeft(1, this.topLeft+1);
        this.topLeft--;
        return temp;
    }

    public Object removeRight() {
        Object temp = this.dec[this.maxSize - 1];
        slideToRight(this.maxSize - 2, this.topRight);
        this.topRight--;
        return temp;
    }

    public Object peekLeft() {
        return this.dec[this.topLeft];
    }

    public Object peekRight() {
        return this.dec[this.topRight];
    }

    public boolean isEmpty() {
        return (this.topLeft == this.topRight - 1);
    }

    public boolean isFull() {
        return (this.topLeft == this.topRight - 1);
    }

    public int length() {
        return this.maxSize;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Dec{");
        sb.append("dec=").append(dec == null ? "null" : Arrays.asList(dec).toString());
        sb.append('}');
        return sb.toString();
    }
}
