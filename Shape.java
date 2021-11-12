public class Shape {
    void draw(){
        System.out.println("Drawing");
    }
    void erase(){
        System.out.println("Erasing");
    }
    public static void main(String[] args) {
      Shape obj = new Shape();
      obj.draw();obj.erase();
    }
}
