public class Java_constructors {
    int x;

    // Create a class constructor for the Main class
    public void Main() {
      x = 5;
    }
  
    public static void main(String[] args) {
      Main myObj = new Main();
      System.out.println(myObj.x);
    }
}
