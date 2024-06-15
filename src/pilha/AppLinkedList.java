package pilha;

import javax.sound.midi.SysexMessage;

import dataStructure.LinkedList;

public class AppLinkedList {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList("Elemento 1");

        list.append("Elemento 2");
        list.append("Elemento 3");
        list.prepend("Elemento 0");

        list.insert(2, "Elemento 2.5");

        // System.out.println(list.get(2));

        // System.out.println(list.removeLast());
        // System.out.println(list.removeFirst());
        list.set(1, "Elemento 0.5");
        // list.getHead();
        // list.getTail();
        // list.getLenght();
        list.remove(2);
        list.print();

        list.set(1, "Elemento 0.5");
    }
}
