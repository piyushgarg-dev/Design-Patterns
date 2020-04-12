package dev.piyushgarg.state;

public class Selection implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Selection ICON");
    }

    @Override
    public void mouseUp() {
        System.out.println("Selection Icon Release");
    }
}
