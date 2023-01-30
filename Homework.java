package ru.geekbrains.lesson3;

public class Homework {
    public static void main(String[] args) {
        
    }
    public void revert() {
        Node node = head;
        while (node != null) {
            Node temp = node.next;
            node.next = node.prev;
            node.prev = temp;
            node = temp;
        }
        Node temp = head;
        head = tail;
        tail = temp;
    }
}
