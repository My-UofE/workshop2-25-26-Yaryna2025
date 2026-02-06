public class HelloWorldApp {
    public static void main(String[] args) {
        if (args.length >= 2) {
            System.out.println("Hello World! My name is " + args[0] + ". I am " + args[1] + " years old.");
        } else if (args.length == 1) {
            System.out.println("Hello World! My name is " + args[0] + ".");
        } else {
            System.out.println("Hello World!");
        }
    }
}