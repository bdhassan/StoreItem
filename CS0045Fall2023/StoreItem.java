package CS0045Fall2023;

public class StoreItem {
    private String name;
    private int ID;

    // Constructors
    public StoreItem(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public StoreItem() {
        this("", 0);
    }

    // Get methods
    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    // Set methods
    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    // toString method
    @Override
    public String toString() {
        return "StoreItem {name='" + name + "', ID=" + ID + "}";
    }
}

