class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;

    public MyLinkedList() {
        head = null;
    }

    public int get(int index) {
        if (head == null) return -1;
        Node curr = head;
        for (int i = 0; i < index && curr != null; i++) {
            curr = curr.next;
        }
        return curr != null ? curr.val : -1;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node newNode = new Node(val);
        Node prev = head;
        for (int i = 0; i < index - 1 && prev != null; i++) {
            prev = prev.next;
        }
        if (prev == null) return;
        newNode.next = prev.next;
        prev.next = newNode;
    }

    public void deleteAtIndex(int index) {
        if (head == null) return;
        if (index == 0) {
            head = head.next;
            return;
        }
        Node prev = head;
        for (int i = 0; i < index - 1 && prev != null; i++) {
            prev = prev.next;
        }
        if (prev == null || prev.next == null) return;
        prev.next = prev.next.next;
    }
}
