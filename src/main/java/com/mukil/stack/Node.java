package com.mukil.stack;

public class Node {
  private int top;
  private int[] stack;
  public static final int FULL_STACK=-1;

  public Node() {

    stack = new int[100];
    top = -1;
  }

  public int push(int data) {
    ++top;
    if (top == 100) {
      --top;
      return FULL_STACK;
    }
    stack[top] = data;
    return 0;
  }

  public int pop() {

    --top;
    
    return stack[top + 1];

  }
  public int getTop(){
    return top;
  }



}
