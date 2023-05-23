package overriding;

class  Parent {
    public void show() {
        System.out.println("This is Parent's show");
    }
}

class Child extends Parent {
    public void show() {
        System.out.println("This is Child show");
    }
}
public class Test6 {
    public static void main( String[] args ) {
//        Parent obj1=  new Parent();
        Parent obj1=  new Child();
        obj1.show();
    }
}
