package Lab5;

public class Client {
    private Text text;
    private char a;
    private char b;

    public Client(Text text, char a, char b) {
        this.text = text;
        this.a = a;
        this.b = b;

    }

    public void startLiveInTheSystem() {
        System.out.print("Modified text: " );
        text.deleteSubstringText(text, a, b);
    }

}
