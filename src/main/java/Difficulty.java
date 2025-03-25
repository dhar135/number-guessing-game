// Enum for difficulty levels
public enum Difficulty {
    EASY(10, "Easy"),
    MEDIUM(5, "Medium"),
    HARD(3, "Hard");

    private final int chances;
    private final String name;

    Difficulty(int chances, String name) {
        this.chances = chances;
        this.name = name;
    }

    public int getChances() {
        return chances;
    }

    public String getName() {
        return name;
    }
}
