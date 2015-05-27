package main;

import intefete.ICommand1;
import intefete.ICommand2;
import intefete.IPilot;
import clase.ComandaIncepe;
import clase.ComandaTermina;
import clase.Formula1;
import clase.Formula3;
import clase.Pilot;
import clase.PilotFactory;
import clase.Piloti;

public class Main 
{
	public static void main(String[] args) 
	{
		//Simple Factory
		IPilot pilot;
		PilotFactory pilotFactory = new PilotFactory();
		
		pilot=pilotFactory.creeazaInstanta(Piloti.Ferrari);
		System.out.println(pilot.toString());
		
		pilot=pilotFactory.creeazaInstanta(Piloti.McLaren);
		System.out.println(pilot.toString());
		
		//Strategy
		Pilot pilot1= new Pilot("Voicu Costin ", 56, 1000, "1930927460041", 9, 16, "1");
		pilot1.setPilott(new Formula1());
		pilot1.piloteaza();

		
		Pilot pilot2= new Pilot("Voicu Mihai ", 18, 1200, "5050607461141", 8, 16, "2");
		pilot2.setPilott(new Formula3());
		pilot2.piloteaza();
		
		
		pilot1.aflaStareaPilotului();
		System.out.println(pilot1.aflaStareaPilotului());
		
		//Command
		ICommand1 comanda1 = new Pilot("Voicu Costin ", 21, 1000, "1930927460041", 9, 16, "1");
		ICommand2 comanda2 = new ComandaIncepe(comanda1);
		Pilot pilot3 = new Pilot("Voicu Costin ", 21, 1000, "1930927460041", 9, 16, "1");
		pilot3.proceed(comanda2);
		pilot3.notProceed();
		
		ICommand1 comanda3 = new Pilot("Voicu Mihai", 18, 1200, "5050607461141", 8, 16, "2");
		ICommand2 comanda4 = new ComandaTermina(comanda3);
		Pilot pilot4 = new Pilot("Voicu Mihai", 18, 1200, "5050607461141", 8, 16, "2");
		pilot4.proceed(comanda4);
		pilot4.notProceed();
		
	
	}
}
