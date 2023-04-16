public class main_pokeman {
    public static void main (String []args) {

        Pokeman p1 = new Pokeman();
        p1.name = "pikachu";
        // p1.level = 20;

        System.out.println(p1.name + ' ' + p1.level);

        Pokeman p2 = new Pokeman();
        p2.name = "firedragon";
        p2.level = 10;

        System.out.println(p2.name + ' ' + p2.level);

        // p2.attack();

        Pokeman p3 = new Pokeman("watermonster", 6);

        System.out.println(p3.name + ' ' + p3.level);
        p3.attack();
    }
}
