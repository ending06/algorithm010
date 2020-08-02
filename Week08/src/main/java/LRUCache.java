//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-08-02<p>
//-------------------------------------------------------

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private Map<Integer, LinkedNode> cache = new HashMap<Integer, LinkedNode>();
    private int size;
    private int capacity;
    private LinkedNode head, tail;

    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new LinkedNode();
        tail = new LinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        LinkedNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        LinkedNode node = cache.get(key);
        if (node == null) {
            LinkedNode newNode = new LinkedNode();
            newNode.key = key;
            newNode.value = value;
            cache.put(key, newNode);
            addNode(newNode);
            ++size;
            if (size > capacity) {
                LinkedNode tail = popTail();
                cache.remove(tail.key);
                --size;
            }
        } else {
            node.value = value;
            moveToHead(node);
        }
    }

    //==============================private linkedNode field=================================
    class LinkedNode {
        int key;
        int value;
        LinkedNode prev;
        LinkedNode next;
    }

    //新节点总放在head后边
    private void addNode(LinkedNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    //删除一个存在的节点
    private void removeNode(LinkedNode node) {
        LinkedNode prev = node.prev;
        LinkedNode next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    //移动到头节点
    private void moveToHead(LinkedNode node) {
        removeNode(node);
        addNode(node);
    }

    private LinkedNode popTail() {
        LinkedNode res = tail.prev;
        removeNode(res);
        return res;
    }
}