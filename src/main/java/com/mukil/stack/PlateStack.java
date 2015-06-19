package com.mukil.stack;

import java.util.ArrayList;

public class PlateStack {
  private ArrayList<Node> stackList = new ArrayList<Node>();
  int currentNode = 0;


  public PlateStack() {
    Node nd = new Node();
    stackList.add(nd);
  }

  public void push(int data) {
    if (currentNode<0){
      currentNode++;
    }
    if (stackList.get(currentNode).push(data) == Node.FULL_STACK) {
      if (currentNode + 1 == stackList.size()) {
        Node nd = new Node();
        stackList.add(nd);
      }
      currentNode++;
      stackList.get(currentNode).push(data);
    }
  }

  public int pop() throws Exception {
    if (currentNode<0){
      throw new Exception("Stack is empty");
    }
    int value = stackList.get(currentNode).pop();
    if (stackList.get(currentNode).getTop() == -1) {
      currentNode--;
    }
    return value;
  }




}
