package t4_linklist;

import org.junit.Test;

import static org.junit.Assert.*;

public class Code4_1Test {

    Code4_1 code4_1;
    Node node1;
    Node node2;
    Node node3;
    Node node4;
    Node node5;
    Node head;


    public Code4_1Test() {
        code4_1 = new Code4_1();
        node1 = new Node(1);
        node2 = new Node(2);
        node3 = new Node(3);
        node4 = new Node(4);
        node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        head = node1;
    }

    /**
     * 测试翻转链表
     */
    @Test
    public void reverseLinkList() throws Exception {
        printLinkList(head);
        head = code4_1.reverseLinkList(head);
        printLinkList(head);

    }

    /**
     * 测试翻转并从尾到头打印链表
     */
    @Test
    public void printReverseLinkList() throws Exception {
        code4_1.printReverseLinkList(head);
    }

    /**
     * 测试通过递归实现从尾到头打印链表
     */
    @Test
    public void printReverseLinkListByRecursion() throws Exception {
        code4_1.printReverseLinkListByRecursion(head);
    }

    /**
     * 顺序打印链表
     *
     * @param head 要打印的链表的头
     */
    private void printLinkList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }


}