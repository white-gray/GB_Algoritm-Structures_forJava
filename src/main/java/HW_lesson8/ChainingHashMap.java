package HW_lesson8;

import java.util.LinkedList;

public class ChainingHashMap<K, V> {
    private final int capacity;
    private int size;
    private final LinkedList<Node>[] st;

    public ChainingHashMap(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        }
        this.capacity = capacity;
        st = new LinkedList[capacity];
        for (int i = 0; i < st.length; i++) {
            st[i] = new LinkedList<>();
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int hash(K key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    public boolean contains(K key) {
        return get(key) != null;
    }

    public K findKey (K key) {
        checkKeyNotNull(key);
        int i = hash(key);
        for (Node node : st[i]) {
            if (key.equals(node.key)) {
                return node.key;
            }
        }
        return null;
    }

    public void checkKeyNotNull(K key) {
        if (key == null) {
            throw new IllegalArgumentException();
        }
    }

    public void put(K key, V value) {
        checkKeyNotNull(key);
        int i = hash(key);
        for (Node node : st[i]) {
            if (key.equals(node.key)) {
                node.value = value;
                return;
            }
        }
        st[i].addLast(new Node(key, value));
        size++;
    }

    public V get(K key) {
        checkKeyNotNull(key);
        int i = hash(key);
        for (Node node : st[i]) {
            if (key.equals(node.key)) {
                return node.value;
            }
        }
        return null;
    }

    public void delete_pointAtLinkedList(K key) {
        checkKeyNotNull(key);
        int i = hash(key);
        for (Node node : st[i]) {
            if (key.equals(node.key)) {
                node.key = null;
                node.value = null;
                return;
            }
        }
    }
    public int getHash(K key) {
        return hash(key);
    }

    public void delete_LinkedList(int line) {
        st[line].remove();
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < capacity; i++) {
            sb.append("\t\t"+i + ":\t");
            for (Node node : st[i]) {
                sb.append(node.key + " = " + node.value + ", ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private class Node {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}

