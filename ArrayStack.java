public class ArrayStack {
    int[] array;
    int top;
    int size;

    public ArrayStack(int size) {
        this.array = new int[size];
        this.top = -1;
        this.size = size;
    }

    public void push(int item) {
        if (top == size - 1) {
            System.out.println("Error: Stack is full.");
            return;
        }
        int ele=array[++top];
        array[++top] = item;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        int ele=array[top--];
        return ele;
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return array[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return (top + 1);
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Size of stack is " + stack.size());
        System.out.println("Top element of stack is " + stack.peek());
        stack.pop();
        System.out.println("Top element of stack after pop is  " + stack.peek());
        System.out.println("Is the stack empty? : "+stack.isEmpty());
    }
}
