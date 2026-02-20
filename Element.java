/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package element;
public final class Element {

    private final int item;
    private final Element next;

    public Element(int item, Element next) {
        this.item = item;
        this.next = next;
    }

    public int getItem() {
        return item;
    }

    public Element getNext() {
        return next;
    }
}

   
