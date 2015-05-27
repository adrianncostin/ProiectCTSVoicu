package clase;

import intefete.IPilot;

public class PilotFactory 
{
	public IPilot creeazaInstanta(Piloti piloti)
	{
		switch(piloti)
		{
		case McLaren: return new McLaren();
		case Mercedes: return new Mercedes();
		case Ferrari: return new Ferrari();
		case RedBullRacing: return new RedBullRacing();
		case AlfaRomeo: return new AlfaRomeo();
		}
		return null;
	}
}
