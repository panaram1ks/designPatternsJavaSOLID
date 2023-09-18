package flyweight.exercise;

import java.util.Arrays;

class Sentence {

    public String plainText;
    public WordToken wordToken;

    public Sentence(String plainText) {
        // todo
        this.plainText = plainText;
    }

    public WordToken getWord(int index) {
        // todo
        return new WordToken(index);
    }

    @Override
    public String toString() {
        // todo
        if (this.wordToken.capitalize) {
            String[] strings = plainText.split(" ");
            int index = wordToken.index;
            strings[index] = strings[index].toUpperCase();
            StringBuilder sb = new StringBuilder();
            Arrays.stream(strings).forEach(str -> sb.append(str));
            return sb.toString();
        }
        return plainText;
    }

    class WordToken {
        public boolean capitalize;
        int index;

        public WordToken(int index) {
            this.index = index;
        }
    }

}
