package lesson26_serializable._03_stardand_compose;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class StandardBox {
    List<String> toys;

    public StandardBox(List<String> toys) {
        this.toys = toys;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", StandardBox.class.getSimpleName() + "[", "]")
                .add("toys=" + toys)
                .toString();
    }
}
