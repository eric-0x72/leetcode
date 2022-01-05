package design;

import java.util.HashMap;
import java.util.Map;

// node of doubly linked list 
class Node {
    int key, value;
    Node prev;
    Node next;
}

public class _146_LRU {

    private void addNode(Node node) {
        node.prev = head;
        node.next = head.next;

        // second.pre = node, find second through head.next
        // so must do head.next in the last step
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(Node node) {
        // 移除node节点
        // prev - cur - next
        // pre.next = next , next.pre = pre
        Node prev = node.prev;
        Node next = node.next;

        prev.next = next;
        next.prev = prev;

        node = null;
    }

    private void moveToHead(Node n) {
        removeNode(n);
        addNode(n);
    }

    private Node popTail() {
        Node res = tail.prev; // res is the tail to be removed
        removeNode(res);
        return res;
    }

    // key is integer, value is Node
    Map<Integer, Node> cache = new HashMap<>();

    int size; // current size
    int capacity;
    Node head, tail;

    public _146_LRU(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new Node();
        tail = new Node();

        head.next = tail;
        tail.prev = head;
    }

    /**
     * given key, return value of node, move to head
     */
    public int get(int key) {
        Node node = cache.get(key);
        if (node == null)
            return -1;

        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = cache.get(key);

        // if node not exist
        //
        if (node == null) {
            Node newnode = new Node();
            newnode.key = key;
            newnode.value = value;

            // put newnode in cache, then add in linkedlist
            cache.put(key, newnode);
            addNode(newnode);

            size++;

            // check if oversize
            if (size > capacity) {
                Node tail = popTail();
                cache.remove(tail.key); // remove using key
                size--;
            }
        }

        // if key already exist, update value
        else {
            node.value = value;
            moveToHead(node);
        }

    }

    public static void main(String[] args) {

    }
}
