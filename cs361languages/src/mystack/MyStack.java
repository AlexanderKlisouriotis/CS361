/**
 *
 */
package mystack;

/**
 * @author Alexander Klisouriotis
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

    private class MyNode<T1> {
        T1 val;
        MyNode<T1> next;

        MyNode(T1 v, MyNode<T1> n) {
            val = v;
            next = n;
        }
    }

    private MyNode<T> theStack = null;

    /**
     *
     */
    public MyStack() {
    }

    public T pop() {
        // TODO To complete
        if (theStack == null) {
            return null;
        }
        MyNode<T> popped = theStack;
        theStack = theStack.next;
        return popped.val;
    }

    public void push(T v) {
        // TODO To complete
        MyNode<T> front = new MyNode<T>(v, null);
        front.next = theStack;
        theStack = front;
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO To complete
        // Create a stack of Integer
        // Push 1 and 2
        // Pop
        // Push 5
        MyStack<Integer> intStack = new MyStack<Integer>();
        intStack.push(1);
        intStack.push(2);
        intStack.pop();
        intStack.push(5);
        // TODO To complete
        // Create a stack of Person
        // Push a person p1 with your name
        // Push a person p2 with my name
        MyStack<Person> personStack = new MyStack<Person>();
        Person p1 = new Person("Alex", "Klisouriotis");
        Person p2 = new Person("Christelle", "Schraff");
        personStack.push(p1);
        personStack.push(p2);
    }

}
