package Lab5;

public class Main {
    public static void main (String[] args) {

        Text text = new Text("Hello, world. Hello, Oleksii!");
        char a = 'l';
        char b = 'o';
        System.out.println(text);
        Client client = new Client(text, a, b);
        client.startLiveInTheSystem();

        System.out.println();
        System.out.println("Done...!");

    }
}