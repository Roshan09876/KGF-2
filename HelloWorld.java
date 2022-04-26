import java.util.Arrays;

public class HelloWorld {
    int a ; //instatnce variable
    static int b=5 ; //class/static variable
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(arr));
        HelloWorld helloworld = new HelloWorld();
        System.out.println(helloworld.a);
        System.out.println(b);
        helloworld.printName();
    }
    public void printName(){
        String name = "Roshan Kumar"; //local variable
        System.out.println(name);
    }

}
