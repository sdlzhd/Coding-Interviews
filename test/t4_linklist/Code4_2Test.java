package t4_linklist;

import org.junit.Test;

import static org.junit.Assert.*;

public class Code4_2Test {

    Code4_2 code4_2;
    Node node1;
    Node node2;
    Node node3;
    Node node4;
    Node node5;
    Node head;


    public Code4_2Test() {
        code4_2 = new Code4_2();
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
     * 测试 O(1)时间内删除 node
     * 删除中间节点
     */
    @Test
    public void deleteMiddleNode() throws Exception {
        printLinkList(head);
        code4_2.deleteNodeInO1(head, node3);
        printLinkList(head);
    }

    /**
     * 测试 O(1)时间内删除 node
     * 删除头结点
     */
    @Test
    public void deleteHeadNode() throws Exception {
        printLinkList(head);
        code4_2.deleteNodeInO1(head, node1);
        printLinkList(head);
    }

    /**
     * 测试 O(1)时间内删除 node
     * 删除尾节点
     */
    @Test
    public void deleteLastNode() throws Exception {
        printLinkList(head);
        code4_2.deleteNodeInO1(head, node5);
        printLinkList(head);
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