package Interfaces;

public class Main2 {
    public static void main(String[] args) {
       
       System.out.println("==================================");
       System.out.println("===   Ejercicio 2: Interfaces  ===");
       System.out.println("==================================");
      
      
      Calc myCalculator = new Calc();
      System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
      System.out.println(myCalculator.divisorSum(6));
    }
}
