package OOP_HW4.data;

public enum Memory {
    //Для хранения констант
    SIXTEEN ("16"),
    FOUR ("4");

    private final String title;

    Memory(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + " Гб.";
    }
}
