package com.guardiana.zoologico;

public class TestGorila 
{
	public static void main(String[]args)
	{
		Gorila gorila = new Gorila();
		System.out.println("El nivel de energia del gorila es de "+gorila.mostrarEnergia()); 
		gorila.lanzarAlgo();
		gorila.lanzarAlgo();
		gorila.lanzarAlgo();
		gorila.comerBananas();
		gorila.comerBananas();
		gorila.escalar();
		System.out.println("El nivel de energia del gorila es de "+gorila.mostrarEnergia());
	}
}
