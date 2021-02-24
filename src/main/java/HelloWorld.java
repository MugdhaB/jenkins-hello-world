public class HelloWorld {

    public String say() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        System.out.println(hw.say());
    }
}
