public class Main {
  public static void main(String[] args) {
   //winter, springs, summer, autumn
   //warm javket, t-shirt, swimming suit, rain coar

    int temp = 45;

    if (temp >= 0 && temp <=5) {
      System.out.println("Wear a warm jacket!");
    }
    else if (temp >= 15 && temp <=30) {
      System.out.println("Wear a T-shirt!");
    }
    else if (temp >= 30 && temp <=40) {
      System.out.println("Wear a swimming suite!");
    }
    else {
      System.out.println("Tou need cooling!");
    }
  }
}
