package dev.piyushgarg.memento;

public class Editor {
    public String content;

    public EditorState createState(){
        return new EditorState(this.content);
    }

    public void restore(EditorState state) {
        this.content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
