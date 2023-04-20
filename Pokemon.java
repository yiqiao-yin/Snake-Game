public class Pokemon {

    // initialize with 2 variables
    String name;
    int level;

    // initialize using 1 variable you just defined
    Pokemon() {
        level = 1;
    }

    // intialize with a void method
    Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
        this.attack();
    }

    void attack() {
        System.out.print(name+" attack!");
    }
}
