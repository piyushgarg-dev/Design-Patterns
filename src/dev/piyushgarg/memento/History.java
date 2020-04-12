package dev.piyushgarg.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState state) {
        this.states.add(state);
    }

    public EditorState pop() {
        var lastIndex = this.states.size() - 1;
        var lastState = this.states.get(lastIndex);
        this.states.remove(lastState);
        return lastState;
    }
}
