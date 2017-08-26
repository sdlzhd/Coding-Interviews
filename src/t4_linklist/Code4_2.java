package t4_linklist;

/**
 * 删除链表节点
 *
 * 在 O(1) 时间内删除链表节点。给点单向链表的头指针和一个节点指针，
 * 定义一个函数在 O(1) 时间内删除该节点
 */
public class Code4_2 {
    /**
     * @param head 链表的头
     * @param node 要删除的节点
     */
    public void deleteNodeInO1(Node head, Node node) {
        // 传入的是空指针
        if (node == null)
            return;
        // node 不是尾节点
        if (node.next != null) {
            Node nextNode = node.next;
            node.data = nextNode.data;
            node.next = nextNode.next;
        }
        // 否则 node 是尾节点,只能通过遍历找到其上一节点
        else {
            Node pNode = head;
            while (pNode.next != node) {
                pNode = pNode.next;
            }
            pNode.next = null;
        }
    }
}
