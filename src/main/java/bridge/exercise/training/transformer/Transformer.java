package bridge.exercise.training.transformer;

import bridge.exercise.training.formatter.Formatter;

public abstract class Transformer {
    private Formatter formatter;

    public Transformer(Formatter formatter) {
        this.formatter = formatter;
    }

    public Formatter getFormatter() {
        return formatter;
    }

    public abstract String transformDocument();
}
