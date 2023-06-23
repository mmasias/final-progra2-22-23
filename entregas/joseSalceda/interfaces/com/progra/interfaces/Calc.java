package entregas.joseSalceda.interfaces.com.progra.interfaces;

 //Crear la interfaz AdvancedArithmetic que contiene un método int divisorSum(int n). *[ ] La clase Calc implementa la interfaz AdvancedArithmetic. La función divisorSum solo toma un número entero como entrada y devuelve la suma de todos sus divisores, el valor de n será como máximo 999, caso contrario lanzar una excepción.En la clase Calc crear función describeDivisors(int n) donde solo toma un número entero como entrada y debe retornar todos sus divisores separados por comas. El valor de n será como máximo 999, caso contrario lanzar una excepción. Para la excepción debe tener dos constructores, uno con un mensaje por defecto y otro recibe como parámetro el mensaje a mostrar.Todas las funciones implementadas las debe de usar en Main como prueba de que funcionan.
//Do the class calc, remember that the class calc must implement the interface AdvancedArithmetic
//Also rememeber that you have to ask for a number in both functions, and if the number is greater than 999 you have to throw an exception in both functions, remember to ask the user for a number

import entregas.joseSalceda.interfaces.com.progra.interfaces.Exceptions.InputMaxValueAllowed;

public class Calc {

    public void divisorSum(int n) {
        if(n > 999) {
            try{
                throw new InputMaxValueAllowed("Max value allowed is 999");
            } catch(InputMaxValueAllowed e){
                System.out.println(e.getMessage());
            }
        } else{

        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) sum += i;
        }

        System.out.println("Sum of divisors of " + n + ": " + sum);

        }
    }


    public void describeDivisors(int n) {
        if(n > 999) {
            try{
                throw new InputMaxValueAllowed("Max value allowed is 999");
            } catch(InputMaxValueAllowed e){
                System.out.println(e.getMessage());
            }
        } else{
        System.out.print("Divisors of " + n + ": ");
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) System.out.print(i);
            if(n % i == 0) if(i != n) System.out.print(",");
        }
    }
    }

}