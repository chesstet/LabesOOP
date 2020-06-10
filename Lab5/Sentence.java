package Lab5;

public class Sentence {
    private static final String punctuationSymbols = ",.!?;";
    private SentenceElement[] sentenceElements;

    public Sentence(SentenceElement[] sentenceElements) {
        this.sentenceElements = sentenceElements;
    }

    public Sentence(String sentenceString) {
        String[] sentenceElementsStrings = sentenceString.split("(?=[" + punctuationSymbols + "])|\\s");
        sentenceElements = new SentenceElement[sentenceElementsStrings.length];
        String sentenceElementString;
        for (int i = 0; i < sentenceElementsStrings.length; i++) {
            sentenceElementString = sentenceElementsStrings[i];
            sentenceElements[i] = punctuationSymbols.contains(sentenceElementString)
                    ? new Punctuation(sentenceElementString)
                    : new Word(sentenceElementString);

        }
    }



    @Override
    public String toString() {
        StringBuilder sentenceString = new StringBuilder();
        for (int i = 0; i < sentenceElements.length; i++) {
            sentenceString.append(
                    (i != 0 && sentenceElements[i] instanceof Word ? " " : "") +
                            sentenceElements[i].toString()
            );
        }
        return sentenceString.toString();
    }

    public void deleteSubstring(Sentence sentence, char a, char b) {
        if((sentence.toString().indexOf(a) != -1) && (sentence.toString().indexOf(b) != -1)){
            System.out.print(sentence.toString().replace(sentence.toString().substring(sentence.toString().indexOf(a), sentence.toString().lastIndexOf(b)+1), ""));
        } else {
            System.out.print("Ups, something went wrong...");
        }
    }
}
