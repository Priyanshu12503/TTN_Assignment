package Q3;

import java.util.Stack;


public class SpecialStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();


  public void push(int a){

          stack.push(a);

      if(minStack.isEmpty() || a<=minStack.peek())  {
          minStack.push(a);
      }
  }

  public int pop(){
      if(stack.isEmpty()){
          throw new RuntimeException("Stack is already empty ");
      }
      int top = stack.pop();
      if(top==minStack.peek()){
          minStack.pop();
      }

      return top;
  }


  public boolean isEmpty(){
     return stack.isEmpty();
  }

  public boolean isFull(){
      if(stack.size()>=stack.capacity()){
          return true;
      }
      else return false;
  }

  public int getMin(){
      if(minStack.isEmpty()){
          throw  new RuntimeException("MinStack is empty");
      }
      else
          return minStack.peek();
  }

  public int peek()
  {
      if(stack.isEmpty()){
        throw  new RuntimeException("MinStack is empty");
      } else
          return stack.peek();
  }

}
