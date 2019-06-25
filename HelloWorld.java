public class HelloWorld {

    public static void main(String[] args) {

        // no input chooses default name, otherwise use first argument
        String name = args.length < 1 ? "Nameless" : args[0];

        // print desired output to standard out
        System.out.printf("Hello, %s!", name);
    }
}
