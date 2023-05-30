package bridge.exercise.training.transformer;

import bridge.exercise.training.formatter.Formatter;

public class TransformerXLS extends Transformer {

    public TransformerXLS(Formatter formatter) {
        super(formatter);
    }

    @Override
    public String transformDocument() {
        return getFormatter().transformFile();
    }
}
