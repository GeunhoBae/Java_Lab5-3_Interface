import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("스택 크기: ");
    int size = scanner.nextInt();
    StringStack ss = new StringStack(size);
    while(true) {
      System.out.print("문자열>>");
      String inputStr = scanner.next();
      if( inputStr.equals("그만"))
        break;
      boolean res = ss.push(inputStr);
      if(res == false) {
        System.out.println("Stack Full!!");
      }
    }
    System.out.print("스택 팝:");
    int len = ss.length();//pop을 하면 크기가 달라지기 때문
    for(int i=0; i<len; i++)
      System.out.print(ss.pop() + " ");
    System.out.println();
  }
}