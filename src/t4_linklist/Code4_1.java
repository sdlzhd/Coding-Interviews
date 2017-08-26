package t4_linklist;

/**
 * 从尾到头打印链表
 */
public class Code4_1 {

    /**
     * 翻转链表
     *
     * @param head 链表的头
     * @return 翻转后链表的头
     */
    public Node reverseLinkList(Node head) {

        // 新的头节点
        Node newHead = head;
        // 当前节点
        Node pNode = head;
        // 前一个节点,如果不保存上一节点信息，断开链以后，是找不到上一节点的
        Node preNode = null;

        while (pNode != null) {
            Node nextNode = pNode.next;

            if (nextNode == null) {
                newHead = pNode;
            }

            pNode.next = preNode;
            preNode = pNode;
            pNode = nextNode;

        }
        return newHead;
    }

    /**
     * 翻转链表，再从尾到头打印链表
     *
     * @param head 要反向打印的链表的头
     */
    public void printReverseLinkList(Node head) {
        head = reverseLinkList(head);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }


    /**
     * 通过递归实现从尾到头打印链表
     *
     * @param head 要反向打印的链表的头
     */
    public void printReverseLinkListByRecursion(Node head) {
        if (head != null) {
            if (head.next != null) {
                printReverseLinkListByRecursion(head.next);
            }
            System.out.print(head.data + " ");
        }
    }

}
