package t4_linklist;

/**
 * 链表中倒数第 k 个节点
 * <p>
 * 输入一个链表，输出该链表中倒数第 k 个节点。
 * 例如一个链表有六个节点，从头节点开始，它们的
 * 值依次是1、2、3、4、5、6，这个链表的倒数第三
 * 个节点是值为4的节点。
 */
public class Code4_3 {
    public Node findKthToTail(Node head, int k) {
        // 非空指针，正整数k
        if (head == null || k <= 0)
            return null;

        Node aNode = head;
        Node bNode = null;

        for (int i = 0; i < k - 1; i++) {
            if (aNode.next != null)
                aNode = aNode.next;
            else
                return null;
        }

        bNode = head;
        while (aNode.next != null) {
            aNode = aNode.next;
            bNode = bNode.next;
        }
        return bNode;
    }
}
