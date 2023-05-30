package bridge.exercise.training.transformer;

import bridge.exercise.training.formatter.Formatter;

public class TransformerDoc extends Transformer {

    public TransformerDoc(Formatter formatter) {
        super(formatter);
    }

    @Override
    public String transformDocument() {
        return getFormatter().transformFile();
    }
}
