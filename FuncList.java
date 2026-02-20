/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package element;
public final class FuncList {

    private final Element head;

    // Constructor for empty list
    public FuncList() {
        this.head = null;
    }

    // Private constructor
    private FuncList(Element head) {
        this.head = head;
    }

    // cons: adds element to front
    public FuncList cons(int value) {
        return new FuncList(new Element(value, this.head));
    }

    // head: returns first element
    public int head() {
        if (head == null) {
            throw new IllegalStateException("Empty list");
        }
        return head.getItem();
    }

    // tail: returns list without first element
    public FuncList tail() {
        if (head == null) {
            throw new IllegalStateException("Empty list");
        }
        return new FuncList(head.getNext());
    }

    // check if empty
    public boolean isEmpty() {
        return head == null;
    }
}