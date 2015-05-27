package clase;

import intefete.ICommand1;
import intefete.ICommand2;

public class ComandaIncepe implements ICommand2
{
	private ICommand1 comanda1;
	
	public ComandaIncepe(ICommand1 comanda1)
	{
		this.comanda1 = comanda1;
	}
	@Override
	public void start() {
		comanda1.incepe();
		
	}

	@Override
	public void stop() {
		comanda1.seTermina();
		
	}

}
