package flyweight.thirdexample;

import java.util.ArrayList;
import java.util.List;

class Sentence{
    private String sentence;
    private List<WordToken> wtl = new ArrayList<>();

    public Sentence(String plainText){
        this.sentence = plainText;
    }

    public WordToken getWord(int index) {
        String[] strings = sentence.split(" ");
        WordToken wordToken = new WordToken(strings[index]);
        return wordToken;
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        String[] strings = sentence.split(" ");
//        for (String word : strings) {
//
//        }
//    }

    class WordToken {
        public boolean capitalize;
        public String aimWord;

        public WordToken(String aimWord) {
            this.aimWord = aimWord;
        }

        public String capitalize(){
            return aimWord.toUpperCase();
        }
    }
}

class Demo {
    public static void main(String[] args) {
//        Sentence sentence = new Sentence("Hello world check your sentence");
//        sentence.getWord(3).capitalize = true;
//        System.out.println(sentence);
        String myStr = "Hello";
        System.out.println(myStr.replace('l', 'p'));
    }
}
