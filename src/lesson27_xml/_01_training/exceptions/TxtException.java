package lesson27_xml._01_training.exceptions;

import java.util.StringJoiner;

public class TxtException extends Exception {
    private String errorLine;

    public TxtException(String errorLine, Throwable cause) {
        super(cause);
        this.errorLine = errorLine;
    }

    @Override
    public String toString() {
        return "Error line: " + errorLine;
    }
}
