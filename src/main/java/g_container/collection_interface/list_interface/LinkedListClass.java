package g_container.collection_interface.list_interface;

import java.util.LinkedList;

/**
 * LindedList源码分析
 *
 * transient int size = 0;
 * transient Node< E > first;===>Pointer to first node.
 * transient Node< E > last;===>Pointer to last node.
 *
 * // 链表节点(双向链表)
 *     private static class Node< E > {
 *         E item;
 *         Node< E > next;
 *         Node< E > prev;
 *
 *         Node(Node< E > prev, E element, Node< E > next) {
 *             this.item = element;
 *             this.next = next;
 *             this.prev = prev;
 *         }
 *     }
 *
 *
 *    // Inserts the specified element at the beginning of this list.
 *    public E getFirst() {
 *         final Node< E > f = first;
 *         if (f == null)
 *             throw new NoSuchElementException();
 *         return f.item;
 *     }
 *
 *     // Appends the specified element to the end of this list.
 *     public E getLast() {
 *         final Node< E > l = last;
 *         if (l == null)
 *             throw new NoSuchElementException();
 *         return l.item;
 *     }
 *
 *
 * // add(E e)方法
 *    public boolean add(E e) {
 *         linkLast(e);
 *         return true;
 *     }
 *
 *     void linkLast(E e) {
 *         final Node< E > l = last;
 *         final Node< E > newNode = new Node<>(l, e, null);
 *         last = newNode;
 *         if (l == null)
 *             first = newNode;
 *         else
 *             l.next = newNode;
 *         size++;
 *         modCount++;
 *     }
 *
 * // add(int index, E element)
 *     public void add(int index, E element) {
 *         checkPositionIndex(index);
 *
 *         if (index == size)
 *             linkLast(element);
 *         else
 *             linkBefore(element, node(index));
 *     }
 *
 *     Node< E > node(int index) {
 *         // assert isElementIndex(index);
 *
 *         if (index < (size >> 1)) {
 *             Node< E > x = first;
 *             for (int i = 0; i < index; i++)
 *                 x = x.next;
 *             return x;
 *         } else {
 *             Node< E > x = last;
 *             for (int i = size - 1; i > index; i--)
 *                 x = x.prev;
 *             return x;
 *         }
 *     }
 *
 *     void linkBefore(E e, Node< E > succ) {
 *         // assert succ != null;
 *         final Node< E > pred = succ.prev;
 *         final Node< E > newNode = new Node<>(pred, e, succ);
 *         succ.prev = newNode;
 *         if (pred == null)
 *             first = newNode;
 *         else
 *             pred.next = newNode;
 *         size++;
 *         modCount++;
 *     }
 */
public class LinkedListClass {
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        LinkedList ll = new LinkedList();
    }
}
