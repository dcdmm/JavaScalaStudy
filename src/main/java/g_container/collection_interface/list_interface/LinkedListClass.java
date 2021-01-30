package g_container.collection_interface.list_interface;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * LindedList源码分析(双向链表实现;新增(add)和删除(remove)操作效率较高)
 */
public class LinkedListClass<E> {
    // 链表节点(双向链表)
    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    // Pointer to first node
    transient Node<E> first;

    // Pointer to last node
    transient Node<E> last;

    transient int size = 0;
    protected transient int modCount = 0;

    public E getFirst() {
        final Node<E> f = first;
        if (f == null)
            throw new NoSuchElementException();
        return f.item;
    }

    public E getLast() {
        final Node<E> l = last;
        if (l == null)
            throw new NoSuchElementException();
        return l.item;
    }

    // Appends the specified element to the end of this list
    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    // Links e as last element
    void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }


    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(); // 底层通过双向链表实现
    }
}
