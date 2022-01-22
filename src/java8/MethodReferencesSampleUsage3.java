package java8;

// 3) Reference to a Constructor
public class MethodReferencesSampleUsage3 {

    @FunctionalInterface
    interface Messageable {
        Message getMessage(String msg);
    }

    static class Message {
        Message(String msg) {
            System.out.print(msg);
        }
    }

    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMessage("Hello");
    }

}
