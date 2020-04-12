package dev.piyushgarg;

import dev.piyushgarg.iterator.BrowseHistory;
import dev.piyushgarg.memento.*;
import dev.piyushgarg.state.Canvas;
import dev.piyushgarg.state.Selection;
import dev.piyushgarg.state.Tool;
import dev.piyushgarg.iterator.Iterator;

public class Main {

    public static void main(String[] args) {
//      1. Memento - Feature: UNDO
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("A");
        history.push(editor.createState());

        editor.setContent("B");
        history.push(editor.createState());

        editor.setContent("C");
        history.push(editor.createState());

        editor.setContent("D");
        history.push(editor.createState());

        editor.restore(history.pop()); // D
        editor.restore(history.pop()); // C
        editor.restore(history.pop()); // B
        System.out.println(editor.getContent()); // B

//      2. State
        Canvas canvas = new Canvas();
        Tool selectionTool = new Selection();

        canvas.setCurrentTool(selectionTool);
        canvas.mouseUp();

//      3. Iterator
        BrowseHistory browseHistory = new BrowseHistory();
        browseHistory.push("Google");
        browseHistory.push("Yahoo");
        browseHistory.push("Facebook");
        browseHistory.push("G mail");

        Iterator browserIterator = browseHistory.createIterator();
        while (browserIterator.hasNext()){
            var current = browserIterator.current();
            System.out.println(current);
            browserIterator.next();
        }

    }
}
