package com.mukil.linkedlist;

import org.junit.Test;

public class LinkedListTest {

  @Test
  public void testDelete() {
    LinkedList lList = new LinkedList();
    lList.addNodes(new int[] {1, 2, 3, 4, 5, 6, 7, 1, 0});
    System.out.println(lList.printList());
    lList.deleteDuplicatesWithBuffer();
    System.out.println(lList.printList());

  }

  @Test
  public void testDeleteWithoutBuffer() {
    LinkedList lList = new LinkedList();
    lList.addNodes(new int[] {1, 2, 3, 4, 5, 6, 7, 1, 0});
    System.out.println(lList.printList());
    lList.deleteDuplicatesWithOutBuffer();
    System.out.println(lList.printList());

  }

}
