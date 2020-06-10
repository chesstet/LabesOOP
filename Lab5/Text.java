package Lab5;

public class Text {
    private Sentence[] sentences;

    public Text(Sentence[] sentences) {
        this.sentences = sentences;
    }

    public Text(String textString) {
        String[] sentencesStrings = textString.split("(?<=[?!.]) ");
//        ([\n\r]*.*?[а-я]+?[.?!]+)
//        String[] sentencesStrings = textString.split("([\\n\\r]*.*?[а-я]+?[.?!]+)\n");
        sentences = new Sentence[sentencesStrings.length];
        for (int i = 0; i < sentencesStrings.length; i++) {
            sentences[i] = new Sentence(sentencesStrings[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder textString = new StringBuilder();
        for (int i = 0; i < sentences.length; i++) {
            textString.append(sentences[i].toString() + (i != sentences.length - 1 ? " " : ""));
        }
        return textString.toString();
    }

    public void deleteSubstringText(Text text, char a, char b) {
        for (int i = 0; i < sentences.length;i++)  {
            sentences[i].deleteSubstring(sentences[i], a, b);
        }
    }
}
