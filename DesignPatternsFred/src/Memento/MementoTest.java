/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Martin
 */
public class MementoTest {

    // Client is the caretaker
    public static void Test() {
        List<Originator.Memento> savedStates = new ArrayList<Originator.Memento>();

        Originator originator = new Originator();
        originator.set("State1");
        originator.set("State2");
        savedStates.add(originator.saveToMemento());
        originator.set("State3");
        // We can request multiple mementos, and choose which one to roll back to.
        savedStates.add(originator.saveToMemento());
        originator.set("State4");

        originator.restoreFromMemento(savedStates.get(1));
    }
}
