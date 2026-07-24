// Prototype Pattern
// Purpose: Create objects by cloning existing objects
// Use Cases: Deep copying, Creating expensive objects, Undo/Redo functionality

import java.io.Serializable;

public abstract class Shape implements Cloneable, Serializable {
    private String id;
    protected String type;

    public Shape() {}

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Abstract method
    public abstract void draw();

    // Clone method
    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
