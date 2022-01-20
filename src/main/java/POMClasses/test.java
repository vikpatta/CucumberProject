package POMClasses;

public class test {
    static void some(){
        System.out.println("super");
    }
}
class test2 extends test{
    static void some(){
        System.out.println("child");
    }
    public static void main(String args[]){

        test obj= new test2();
        obj.some();

    }

}