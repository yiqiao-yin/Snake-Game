public class main_pokemon {
    public static void main (String []args) {

        Pokemon p1 = new Pokemon();
        p1.name = "pikachu";
        p1.level = 20;

        System.out.println(p1.name + ' ' + p1.level);

        Pokemon p2 = new Pokemon();
        p2.name = "firedragon";
        p2.level = 10;

        System.out.println(p2.name + ' ' + p2.level);

        // p2.attack();
        p1.attack();

        // Pokemon p3 = new Pokemon("watermonster", 6);

        // System.out.println(p3.name + ' ' + p3.level);
        // p3.attack();
    }
}
