package com.progra.interfaces;

import java.util.Scanner;

public class Calc implements AdvancedArithmetic{
	
	public static void main(String[]args) throws InvalidMaxValueException {
		int x;
		Scanner revisar = new Scanner(System.in);
		do{
			System.out.println("Introduzca un numero entero(maximo de 999)");
			x=revisar.nextInt();
		}while(x<=0);

		if(x>999) {

			throw new InvalidMaxValueException();

		}

		for (int i=1; i<=x; i++){
			if(x%i==0){
				System.out.println(i);
			}


		}











	}

	@Override
	public int divisorSum(int n) {
		// TODO Auto-generated method stub
		return 0;
	}
	




}

