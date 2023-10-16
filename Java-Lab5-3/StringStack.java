public class StringStack implements Stack {
  private String[] elements;
  private int tos;// top of stack
  public StringStack(int capacity) {
    elements = new String[capacity];
    tos = -1;
  }
  public int length() {
    return tos + 1;
  }
  public int capacity() {
    return elements.length;
  }
  public String pop() {
    if(tos == -1) // stack empty
      return null;
    return elements[tos--];
  }
  public boolean push(String str) {
    if( tos == elements.length-1) //stack full
      return false;
    elements[++tos] = str;
    return true;
  }
}