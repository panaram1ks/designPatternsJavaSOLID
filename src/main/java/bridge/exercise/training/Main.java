package bridge.exercise.training;

import bridge.exercise.training.formatter.ExcelFormatter;
import bridge.exercise.training.formatter.WordFormatter;
import bridge.exercise.training.transformer.TransformerDoc;
import bridge.exercise.training.transformer.TransformerXLS;

public class Main {
    public static void main(String[] args) {
        System.out.println(new TransformerDoc(new WordFormatter()).transformDocument());
        System.out.println(new TransformerXLS(new ExcelFormatter()).transformDocument());
    }
}
