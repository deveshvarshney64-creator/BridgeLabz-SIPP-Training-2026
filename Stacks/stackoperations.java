import java.util.*;
class stackoperations {
int max = 100;
int[] stack = new int[max];
int top = -1;
// Push Operation
void push(int x) {
    if (top == max - 1) {
        System.out.println("Stack Overflow");
    } else {
        stack[++top] = x;
        System.out.println(x + " pushed into stack");
    }
}

// Pop Operation
void pop() {
    if (top == -1) {
        System.out.println("Stack Underflow");
    } else {
        System.out.println(stack[top] + " popped from stack");
        top--;
    }
}

// Peek Operation
void peek() {
    if (top == -1) {
        System.out.println("Stack is empty");
    } else {
        System.out.println("Top element is: " + stack[top]);
    }
}

// Check if Empty
void isEmpty() {
    if (top == -1) {
        System.out.println("Stack is empty");
    } else {
        System.out.println("Stack is not empty");
    }
}

// Display Stack
void display() {
    if (top == -1) {
        System.out.println("Stack is empty");
    } else {
        System.out.println("Stack elements are:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}

public static void main(String[] args) {
    stackoperations s = new stackoperations();
    Scanner sc = new Scanner(System.in);

    while (true) {
        System.out.println("\n1. Push\n2. Pop\n3. Peek\n4. isEmpty\n5. Display\n6. Exit");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.print("Enter element: ");
                int x = sc.nextInt();
                s.push(x);
                break;
            case 2:
                s.pop();
                break;
            case 3:
                s.peek();
                break;
            case 4:
                s.isEmpty();
                break;
            case 5:
                s.display();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Invalid choice");
        }
    }
}
}
