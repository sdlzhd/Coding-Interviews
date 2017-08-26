package t4_linklist;

import org.junit.Test;

import static org.junit.Assert.*;

public class Code4_3Test {


    Code4_3 code4_3;
    Node node1;
    Node node2;
    Node node3;
    Node node4;
    Node node5;
    Node head;


    public Code4_3Test() {
        code4_3 = new Code4_3();
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
     * 测试查找链表中倒数第 k 个节点
     * 
     * 第 k 个节点在链表中间
     */
    @Test
    public void kthNodeInMiddle() throws Exception {
        printLinkList(head);
        Node kthNode = code4_3.findKthToTail(head, 3);
        if (kthNode != null)
            System.out.println(kthNode.data);
    }

    /**
     * 测试查找链表中倒数第 k 个节点
     * 
     * 第 k 个节点在链表最后
     */
    @Test
    public void kthNodeInHead() throws Exception {
        printLinkList(head);
        Node kthNode = code4_3.findKthToTail(head, 1);
        if (kthNode != null)
            System.out.println(kthNode.data);
    }

    /**
     * 测试查找链表中倒数第 k 个节点
     * 
     * 第 k 个节点是头节点
     */
    @Test
    public void kthNodeInLast() throws Exception {
        printLinkList(head);
        Node kthNode = code4_3.findKthToTail(head, 5);
        if (kthNode != null)
            System.out.println(kthNode.data);
    }

    /**
     * 测试查找链表中倒数第 k 个节点
     * 
     * 输入空指针
     */
    @Test
    public void nullHead() throws Exception {
        printLinkList(head);
        Node kthNode = code4_3.findKthToTail(null, 3);
        if (kthNode != null)
            System.out.println(kthNode.data);
    }

    /**
     * 测试查找链表中倒数第 k 个节点
     *
     * 节点数小于总数 k
     */
    @Test
    public void numOfNode() throws Exception {
        printLinkList(head);
        Node kthNode = code4_3.findKthToTail(head, 8);
        if (kthNode != null)
            System.out.println(kthNode.data);
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