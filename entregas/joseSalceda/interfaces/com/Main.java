package entregas.joseSalceda.interfaces.com;

//Crear la interfaz AdvancedArithmetic que contiene un método int divisorSum(int n). *[ ] La clase Calc implementa la interfaz AdvancedArithmetic. La función divisorSum solo toma un número entero como entrada y devuelve la suma de todos sus divisores, el valor de n será como máximo 999, caso contrario lanzar una excepción.En la clase Calc crear función describeDivisors(int n) donde solo toma un número entero como entrada y debe retornar todos sus divisores separados por comas. El valor de n será como máximo 999, caso contrario lanzar una excepción. Para la excepción debe tener dos constructores, uno con un mensaje por defecto y otro recibe como parámetro el mensaje a mostrar.Todas las funciones implementadas las debe de usar en Main como prueba de que funcionan.4
//Haz el main, donde se pruebe el int divisorSum(int n) y describeDivisors(int n) de la clase Calc 

import entregas.joseSalceda.interfaces.com.progra.interfaces.AdvancedArithmetic;
import entregas.joseSalceda.interfaces.com.progra.interfaces.Calc;
import entregas.joseSalceda.interfaces.com.progra.interfaces.Exceptions.InputMaxValueAllowed;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.divisorSum(100);
        calc.describeDivisors(100);
    }
}