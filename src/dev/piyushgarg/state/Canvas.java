package dev.piyushgarg.state;

public class Canvas implements Tool {

    private Tool currentTool;

    public void setCurrentTool(Tool tool) {
        this.currentTool = tool;
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public void mouseDown() {
        currentTool.mouseDown();
    }
}
