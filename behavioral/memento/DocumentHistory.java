// Caretaker

import java.util.ArrayList;
import java.util.List;

public class DocumentHistory {
    private List<Memento> history = new ArrayList<>();

    public void saveState(Document document) {
        history.add(document.save());
    }

    public void restoreState(Document document, int index) {
        if (index >= 0 && index < history.size()) {
            Memento memento = history.get(index);
            document.restore(memento);
        } else {
            System.out.println("Invalid history index");
        }
    }

    public void printHistory() {
        System.out.println("\nDocument history:");
        for (int i = 0; i < history.size(); i++) {
            System.out.println(i + ": " + history.get(i).getState());
        }
    }
}
