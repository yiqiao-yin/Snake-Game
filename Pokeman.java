public class Pokeman {
    String name;
    int level;

    Pokeman() {
        level = 1;
    }

    Pokeman(String name, int level) {
        this.name = name;
        this.level = level;
        this.attack();
    }

    void attack() {
        System.out.print(name+" attack!");
    }
}
