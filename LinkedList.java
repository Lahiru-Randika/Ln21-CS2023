public class LinkedList {
    Node top;
    int size;

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList() {
        this.top = null;
        this.size = 0;
    }

    public void push(int element) {
        Node node = new Node(element);
        node.next = top;
        top = node;
        size++;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1;
        }
        int element = top.value;
        top = top.next;
        size--;
        return element;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return top.value;
    }

    public String isEmpty() {
        if (top == null){
            return ("True");
        }else{
            return ("False");
        }
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        LinkedList newstack = new LinkedList();
        newstack.push(1);
        newstack.push(2);
        newstack.push(3);
        newstack.push(4);
        newstack.push(5);
        System.out.println("Size of stack is " + newstack.size());
        System.out.println("Top element of stack is " + newstack.peek());
        newstack.pop();
        System.out.println("Top element of stack after pop is " + newstack.peek());
        System.out.println("Is the stack empty? : "+newstack.isEmpty());
    }
}
