package test;

public class Test {

  public static void main(String[] args) {
    foo();
  }
  
  public static void foo() {
    System.out.println(System.getenv("PATH"));
  }

}
