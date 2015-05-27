package clase;

import intefete.ICommand1;
import intefete.ICommand2;
import intefete.IStrategy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;

public class Pilot implements ICommand1
{
	private String nume;
	private int varsta;
	private float castiguri;
	private String cnp;
	private int curseCastigate;
	private int totalCurse;
	private IStrategy pilott;
	private String numarMasina;
	private ArrayList<Integer> premii;
	private ArrayList<Boolean> accidente;
	private ArrayList<Integer> puncte;
	
	
	LinkedList<ICommand2> comenzi = new LinkedList<ICommand2>();
	
	public void proceed(ICommand2 comanda)
	{
		comenzi.add(comanda);
		comanda.start();
	}
	
	public void notProceed()
	{
		comenzi.pollLast().stop();
	}
	
	
	
	public Pilot(String nume, int varsta, float castiguri, String cnp,
			int curseCastigate, int totalCurse, String numarMasina) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.castiguri = castiguri;
		this.cnp = cnp;
		this.curseCastigate = curseCastigate;
		this.totalCurse = totalCurse;
		this.numarMasina = numarMasina;
	}

	public void piloteaza()
	{
		pilott.piloteaza(nume);
	}
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public IStrategy getPilott() {
		return pilott;
	}
	public void setPilott(IStrategy pilott) {
		this.pilott = pilott;
	}
	public float getCastiguri() {
		return castiguri;
	}
	public void setCastiguri(float castiguri) {
		this.castiguri = castiguri;
	}
	
	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public int getCurseCastigate() {
		return curseCastigate;
	}

	public void setCurseCastigate(int curseCastigate) {
		this.curseCastigate = curseCastigate;
	}

	public int getTotalCurse() {
		return totalCurse;
	}

	public void setTotalCurse(int totalCurse) {
		this.totalCurse = totalCurse;
	}

	public ArrayList<Integer> getPremiu() {
		return premii;
	}

	public void setPremiu(ArrayList<Integer> premiu) {
		this.premii = premiu;
	}
	

	public ArrayList<Boolean> getAccident() {
		return accidente;
	}

	public void setAccident(ArrayList<Boolean> accident) {
		this.accidente = accident;
	}
	
	

	public ArrayList<Integer> getPuncte() {
		return puncte;
	}

	public void setPuncte(ArrayList<Integer> puncte) {
		this.puncte = puncte;
	}

	public String getNumarMasina() {
		return numarMasina;
	}

	public void setNumarMasina(String numarMasina) {
		this.numarMasina = numarMasina;
	}

	@Override
	public String toString() {
		return "Pilot [nume=" + nume + ", varsta=" + varsta + ", castiguri="
				+ castiguri + ", cnp=" + cnp + ", curseCastigate="
				+ curseCastigate + ", totalCurse=" + totalCurse
				+ ", numarMasina=" + numarMasina + "]";
	}

	@Override
	public void incepe() {
		System.out.println("Pilotul " + nume +"incepe cursa!");
		
	}

	@Override
	public void seTermina() {
		System.out.println("Pilotul " + nume+  "termina cursa!");
		
	}

	@Override
	public void restrictie() {
		System.out.println("Pilotul " + nume+  " nu poate depasi!");
		
	}

	@Override
	public void faraRestrictii() {
		System.out.println("Pilotul " + nume+  " nu are restrictii pentru depasire!");
		
	}
	
	//functii
	public String aflaMasina() 
	{
		switch(numarMasina.charAt(0))
		{
		case '1': return "McLaren";
		case '2': return "Mercedes";
		case '3': return "Alfa Romeo";
		case '4': return "Ferrari";
		case '5': return "Red Bull Racing";
		}
		return "Nu Exista Marca!";
	}
	
	public String aflaStareaPilotului() // 5 teste
	{
		if(varsta>=18 && varsta<25)
			return "Incepator";
		else if(varsta>=25 && varsta <40)
			return "Mediu";
		else if(varsta >= 40 && varsta <50)
			return "Avansat";
		else if(varsta >= 50)
			return "Profesionist";
		else 
			return "Nu are permis!";
	}
	
	public int aflaVarstaDupaCNP() // 7 teste
	{
		if(cnp.charAt(0) == '5' || cnp.charAt(0) == '6')
		{
			return Calendar.getInstance().get(1) - (2000 + Integer.parseInt("" + cnp.charAt(1) + cnp.charAt(2)));
		}
		else if(cnp.charAt(0) == '1' || cnp.charAt(0) == '2')
		{
			return Calendar.getInstance().get(1) - (1900 + Integer.parseInt("" + cnp.charAt(1) + cnp.charAt(2)));
		}
		else if(cnp.charAt(0) == '3' || cnp.charAt(0) == '4')
		{
			return Calendar.getInstance().get(1) - (1800 + Integer.parseInt("" + cnp.charAt(1) + cnp.charAt(2)));
		}
		else
			return 0;
	}
	
	public String aflaNationalitate() //5 teste
	{
		HashMap<Integer, String> nationalitate = new HashMap<Integer, String>();
		
		try
		{
			FileReader citire = new FileReader("Nationalitate.txt");
			BufferedReader buffercitire = new BufferedReader(citire);
			String linie = null;
			
			while((linie = buffercitire.readLine()) != null && linie.length() >0)
			{
				nationalitate.put(Integer.parseInt(linie.split("	")[0]), linie.split("	")[1]);
			}
		}
		catch(FileNotFoundException error)
		{
			error.printStackTrace();
		}
		catch(IOException error)
		{
			error.printStackTrace();
		}
		return nationalitate.get(Integer.parseInt(""+numarMasina.charAt(0)));
	}
	
	public int totalPremiiCastigate()
	{
		int suma = 0;
		
		for(int i=0;i<premii.size();i++)
		{
			if(premii.get(i) != null)
			{
				suma += premii.get(i);
			}
		}
		return suma;
	}
	
	public boolean AflaAntecedente()
	{
		boolean accident = false;
		int k = 0;
		
		for(int i=0;i<accidente.size();i++)
		{
			if(accidente.get(i) == true)
			{
				accident = true;
				k = k+1;
			}
		}
		if(k!=0)
		{
			return accident = true;
		}
		else
		return accident = false;
	}
	
	public String AflaSex()
	{
		switch(cnp.charAt(0))
		{
		case '1': return "Masculin";
		case '2': return "Feminin";
		case '3': return "Masculin";
		case '4': return "Feminin";
		case '5': return "Masculin";
		case '6': return "Feminin";
		}
		
		return "Cnp Invalid!";
	}
	
	public int MaximPuncte()
	{
		int maxim = 0;
		for (int i=0;i<puncte.size();i++)
		{
			if(puncte.get(i) > maxim)
			{
				maxim = puncte.get(i);
			}
		}
		return maxim;
	}
	
	public float mediePremii()
	{
		int p = totalPremiiCastigate();

		float rezultat = 0;
		if(getTotalCurse() > 0)
		{
			rezultat =(float) p / getTotalCurse();
		}
		
		return rezultat;
	}
	
	public int CursePierdute()
	{
		int diferenta = 0;
		if(curseCastigate > 0)
		{
			diferenta = totalCurse - curseCastigate;
		}
		else
			return 0;
		return diferenta;
	}
}
