package com.guardiana.zoologico;

public class Gorila extends Mamifero
{

	public Gorila() 
	{
		super();
	}
	
	public void lanzarAlgo()
	{
		int energia = getNivelDeEnergia()-5;
		setNivelDeEnergia(energia);
		System.out.println("El gorila arrojo algo");
	}
	
	public void comerBananas() 
	{
		int energia = getNivelDeEnergia()+10;
		setNivelDeEnergia(energia);
		System.out.println("El gorila esta sadisfecho");
	}
	
	public void escalar()
	{
		int energia = getNivelDeEnergia()-10;
		setNivelDeEnergia(energia);
		System.out.println("Gorila ha trepado a un árbol");
	}
}
