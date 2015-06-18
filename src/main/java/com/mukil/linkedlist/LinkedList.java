package com.mukil.linkedlist;

import java.util.ArrayList;

public class LinkedList {

  public Node head;
  private Node pointer;

  public LinkedList() {
    head = null;
  }

  public void addNode(int data) {
    if (head == null) {
      head = new Node(data);
      pointer = head;
    } else {
      while (pointer.next != null) {
        pointer = pointer.next;
      }
      pointer.next = new Node(data);

    }

  }


  public void addNodes(int[] data) {
    for (int i : data) {
      addNode(i);
    }
  }


  public void deleteDuplicatesWithBuffer() {
    if (head.next == null) {
      return;
    }
    ArrayList<Integer> buffer = new ArrayList<Integer>();
    buffer.add(head.getData());
    Node node = head;
    while (node.next != null) {
      if (buffer.contains(node.next.getData())) {
        node.next = node.next.next;
      } else {
        buffer.add(node.next.getData());
      }
      node = node.next;
    }
  }

  public void deleteDuplicatesWithOutBuffer() {
    if (head.next == null) {
      return;
    }
    Node node;
    Node current = head;
    while (current.next != null) {
      node = current;
      int data = current.getData();
      while (node.next != null) {
        if (node.next.getData() == data) {
          node.next = node.next.next;
        }
        node = node.next;
      }
      current = current.next;
    }

  }


  public String printList() {
    Node node = head;
    String list = "";
    while (node.next != null) {
      list = list + node.getData() + "->";
      node = node.next;
    }
    list = list + node.getData() + "->" + "null";
    return list;
  }


}
