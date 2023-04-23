import java.util.Random;

class RandomExample {
   public static void main(String[] args) {
      Random random = new Random();
      
      int min = 1;
      int max = 10;
      int randomInt = random.nextInt(max - min + 1) + min;

      System.out.println(randomInt);
   }
}
