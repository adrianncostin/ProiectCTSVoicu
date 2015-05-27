package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;
import org.mockito.Mockito;

import clase.Pilot;

public class Teste extends TestCase{
	
	public Teste(String nume)
	{
		super(nume);
	}
	
	//Aflam categoria din care face parte masina
	@Test
	public void testAflaMasina1() 
	{
		Pilot pilot1 = new Pilot("Voicu Costin", 21, 1200, "1920927460041", 9, 16, "1");
		assertEquals("McLaren", pilot1.aflaMasina());
	}
	
	@Test
	public void testAflaMasina2()
	{
		Pilot pilot2 = new Pilot("Voicu Costin", 21, 1200, "1920927460041", 9, 16, "2");
		assertEquals("Mercedes", pilot2.aflaMasina());
	}
	
	@Test
	public void testAflaMasina3()
	{
		Pilot pilot3 = new Pilot("Voicu Costin", 21, 1200, "1920927460041", 9, 16, "3");
		assertEquals("Alfa Romeo", pilot3.aflaMasina());
	}
	
	@Test
	public void testAflaMasina4()
	{
		Pilot pilot4 = new Pilot("Voicu Costin", 21, 1200, "1920927460041", 9, 16, "4");
		assertEquals("Ferrari", pilot4.aflaMasina());
	}
	
	@Test
	public void testAflaMasina5()
	{
		Pilot pilot5 = new Pilot("Voicu Costin", 21, 1200, "1920927460041", 9, 16, "5");
		assertEquals("Red Bull Racing", pilot5.aflaMasina());
	}
	
	@Test
	public void testAflaMasina6()
	{
		Pilot pilot6 = new Pilot("Voicu Costin", 21, 1200, "1920927460041", 9, 16, "6");
		assertEquals("Nu Exista Marca!", pilot6.aflaMasina());
	}
	
	//Aflam Starea Pilotului 
	@Test
	public void testAflaStareaPilotului1()
	{
		Pilot pilot7 = new Pilot("Voicu Costin", 21, 1200, "1920927460041", 9, 16, "6");
		assertEquals("Incepator", pilot7.aflaStareaPilotului());
	}
	
	@Test
	public void testAflaStareaPilotului2()
	{
		Pilot pilot8 = new Pilot("Voicu Costin", 34, 1200, "1920927460041", 9, 16, "6");
		assertEquals("Mediu", pilot8.aflaStareaPilotului());
	}
	
	@Test
	public void testAflaStareaPilotului3()
	{
		Pilot pilot9 = new Pilot("Voicu Costin", 44, 1200, "1920927460041", 9, 16, "6");
		assertEquals("Avansat", pilot9.aflaStareaPilotului());
	}
	
	@Test
	public void testAflaStareaPilotului4()
	{
		Pilot pilot10 = new Pilot("Voicu Costin", 53, 1200, "1920927460041", 9, 16, "6");
		assertEquals("Profesionist", pilot10.aflaStareaPilotului());
	}
	
	@Test
	public void testAflaStareaPilotului5()
	{
		Pilot pilot11 = new Pilot("Voicu Costin", 17, 1200, "1920927460041", 9, 16, "6");
		assertEquals("Nu are permis!", pilot11.aflaStareaPilotului());
	}
	
	//Aflam total premii castigate
	@Test
	public void testPremiiTotale1()
	{
		Pilot pilot12 = new Pilot("Voicu Costin", 17, 1200, "1920927460041", 9, 16, "6");
		ArrayList<Integer> premii = new ArrayList<Integer>();
		
		premii.add(0);
		premii.add(18000);
		premii.add(19000);
		premii.add(21500);
		premii.add(0);
		premii.add(25000);
		
		pilot12.setPremiu(premii);
		assertEquals(83500, pilot12.totalPremiiCastigate());
	}
	
	@Test
	public void testPremiiTotale2()
	{
		Pilot pilot13 = new Pilot("Voicu Costin", 17, 1200, "1920927460041", 9, 16, "6");
		ArrayList<Integer> premii = new ArrayList<Integer>();
		
		premii.add(0);
		premii.add(0);
		premii.add(0);
		premii.add(0);
		premii.add(0);
		premii.add(0);
		
		pilot13.setPremiu(premii);
		assertEquals(0, pilot13.totalPremiiCastigate());
	}
	
	@Test
	public void testPremiiTotale3()
	{
		Pilot pilot14 = new Pilot("Voicu Costin", 17, 1200, "1920927460041", 9, 16, "6");
		ArrayList<Integer> premii = new ArrayList<Integer>();
		
		premii.add(65000);
		premii.add(0);
		premii.add(0);
		premii.add(54000);
		premii.add(0);
		premii.add(-30000);
		
		pilot14.setPremiu(premii);
		assertEquals(89000, pilot14.totalPremiiCastigate());
	}
	
	@Test
	public void testPremiiTotale4()
	{
		Pilot pilot15 = new Pilot("Voicu Costin", 17, 1200, "1920927460041", 9, 16, "6");
		ArrayList<Integer> premii = new ArrayList<Integer>();
		
		premii.add(null);
		premii.add(0);
		premii.add(0);
		premii.add(54000);
		premii.add(0);
		premii.add(-30000);
		
		pilot15.setPremiu(premii);
		assertEquals(24000, pilot15.totalPremiiCastigate());
	}
	
	@Test
	public void testPremiiTotale5()
	{
		Pilot pilot16 = new Pilot("Voicu Costin", 17, 1200, "1920927460041", 9, 16, "6");
		ArrayList<Integer> premii = new ArrayList<Integer>();
		
		pilot16.setPremiu(premii);
		assertEquals(0, pilot16.totalPremiiCastigate());
	}
	
	//Aflam nationalitatea pilotului
	@Test
	public void testNationalitate1()
	{
		Pilot pilot17 = new Pilot("Voicu Costin", 21, 1200, "1930927460041", 9, 16, "1");
		assertEquals("Roman", pilot17.aflaNationalitate());
	}
	
	@Test
	public void testNationalitate2()
	{
		Pilot pilot18 = new Pilot("Voicu Costin", 21, 1200, "1930927460041", 9, 16, "2");
		assertEquals("Ungur", pilot18.aflaNationalitate());
	}
	
	@Test
	public void testNationalitate3()
	{
		Pilot pilot19 = new Pilot("Voicu Costin", 21, 1200, "1930927460041", 9, 16, "5");
		assertEquals("Danez", pilot19.aflaNationalitate());
	}
	
	@Test
	public void testNationalitate4()
	{
		Pilot pilot20 = new Pilot("Voicu Costin", 21, 1200, "1930927460041", 9, 16, "3");
		assertEquals("German", pilot20.aflaNationalitate());
	}
	
	@Test
	public void testNationalitate5()
	{
		Pilot pilot21 = new Pilot("Voicu Costin", 21, 1200, "1930927460041", 9, 16, "4");
		assertEquals("Francez", pilot21.aflaNationalitate());
	}
	
	//Aflam varsta dupa cnp-ul pilotului
	@Test
	public void testVarsta1()
	{
		Pilot pilot22 = new Pilot("Voicu Costin", 21, 1200, "1930927460041", 9, 16, "4");
		assertEquals(22, pilot22.aflaVarstaDupaCNP());
	}
	@Test
	public void testVarsta2()
	{
		Pilot pilot23 = new Pilot("Voicu Costin", 21, 1200, "2920927460041", 9, 16, "4");
		assertEquals(23, pilot23.aflaVarstaDupaCNP());
	}
	@Test
	public void testVarsta3()
	{
		Pilot pilot24 = new Pilot("Voicu Costin", 21, 1200, "5020927460041", 9, 16, "4");
		assertEquals(13, pilot24.aflaVarstaDupaCNP());
	}
	@Test
	public void testVarsta4()
	{
		Pilot pilot25 = new Pilot("Voicu Costin", 21, 1200, "6010927460041", 9, 16, "4");
		assertEquals(14, pilot25.aflaVarstaDupaCNP());
	}
	
	@Test
	public void testVarsta5()
	{
		Pilot pilot43 = new Pilot("Voicu Costin", 21, 1200, "3010927460041", 9, 16, "4");
		assertEquals(214, pilot43.aflaVarstaDupaCNP());
	}
	
	@Test
	public void testVarsta6()
	{
		Pilot pilot44 = new Pilot("Voicu Costin", 21, 1200, "4990927460041", 9, 16, "4");
		assertEquals(116, pilot44.aflaVarstaDupaCNP());
	}
	//Aflam daca pilotul a avut antecedente
	@Test
	public void testAflaAntecedente1()
	{
		Pilot pilot26 = new Pilot("Voicu Costin", 17, 1200, "1930927460041", 9, 16, "6");
		ArrayList<Boolean> accidente = new ArrayList<Boolean>();
		
		accidente.add(false);
		accidente.add(false);
		accidente.add(false);
		accidente.add(false);
		
		pilot26.setAccident(accidente);
		assertFalse(pilot26.AflaAntecedente());
	}
	
	@Test
	public void testAflaAntecedente2()
	{
		Pilot pilot27 = new Pilot("Voicu Costin", 17, 1200, "1930927460041", 9, 16, "6");
		ArrayList<Boolean> accidente = new ArrayList<Boolean>();
		
		accidente.add(false);
		accidente.add(false);
		accidente.add(true);
		accidente.add(false);
		
		pilot27.setAccident(accidente);
		assertTrue(pilot27.AflaAntecedente());
	}
	
	@Test
	public void testAflaAntecedente3()
	{
		Pilot pilot28 = new Pilot("Voicu Costin", 17, 1200, "1930927460041", 9, 16, "6");
		ArrayList<Boolean> accidente = new ArrayList<Boolean>();
		
		accidente.add(true);
		accidente.add(true);
		accidente.add(true);
		accidente.add(true);
		
		pilot28.setAccident(accidente);
		assertTrue(pilot28.AflaAntecedente());
	}
	
	@Test
	public void testAflaAntecedente4()
	{
		Pilot pilot29 = new Pilot("Voicu Costin", 17, 1200, "1930927460041", 9, 16, "6");
		ArrayList<Boolean> accidente = new ArrayList<Boolean>();
		
		pilot29.setAccident(accidente);
		assertFalse(pilot29.AflaAntecedente());
	}
	
	//Aflam sexul pilotului
	
	@Test
	public void testAflaSex1()
	{
		Pilot pilot30 = new Pilot("Voicu Costin", 21, 1200, "1930927460041", 9, 16, "4");
		assertEquals("Masculin", pilot30.AflaSex());
	}
	@Test
	public void testAflaSex2()
	{
		Pilot pilot31 = new Pilot("Voicu Ana", 21, 1200, "2930927460041", 9, 16, "4");
		assertEquals("Feminin", pilot31.AflaSex());
	}

	@Test
	public void testAflaSex3()
	{
		Pilot pilot32 = new Pilot("Voicu Costin", 21, 1200, "3930927460041", 9, 16, "4");
		assertEquals("Masculin", pilot32.AflaSex());
	}

	@Test
	public void testAflaSex4()
	{
		Pilot pilot33 = new Pilot("Voicu Ana", 21, 1200, "4930927460041", 9, 16, "4");
		assertEquals("Feminin", pilot33.AflaSex());
	}

	@Test
	public void testAflaSex5()
	{
		Pilot pilot34 = new Pilot("Voicu Costin", 21, 1200, "5930927460041", 9, 16, "4");
		assertEquals("Masculin", pilot34.AflaSex());
	}

	@Test
	public void testAflaSex6()
	{
		Pilot pilot35 = new Pilot("Voicu Ana", 21, 1200, "6930927460041", 9, 16, "4");
		assertEquals("Feminin", pilot35.AflaSex());
	}

	@Test
	public void testAflaSex7()
	{
		Pilot pilot36 = new Pilot("Voicu Costin", 21, 1200, "8930927460041", 9, 16, "4");
		assertEquals("Cnp Invalid!", pilot36.AflaSex());
	}
	
	//Aflam medie puncte
	
	@Test
	public void testAflaMediePremii1()
	{
		Pilot pilot38 = new Pilot("Voicu Costin", 21, 1200, "8930927460041", 9, 4, "4");
		ArrayList<Integer> premii = new ArrayList<Integer>();
		
		premii.add(15);
		premii.add(0);
		premii.add(20);
		premii.add(5);
		
		pilot38.setPremiu(premii);
		assertEquals(10.0, pilot38.mediePremii(), 0.1);
	}
	
	@Test
	public void testAflaMediePremii2()
	{
		Pilot pilot39 = new Pilot("Voicu Costin", 21, 1200, "8930927460041", 9, 4, "4");
		ArrayList<Integer> premii = new ArrayList<Integer>();
		
		premii.add(15);
		premii.add(40);
		premii.add(10);
		premii.add(5);
		
		pilot39.setPremiu(premii);
		assertEquals(17.5, pilot39.mediePremii(), 0.1);
	}
	
	@Test
	public void testAflaMediePremii3()
	{
		Pilot pilot40 = new Pilot("Voicu Costin", 21, 1200, "8930927460041", 9, 4, "4");
		ArrayList<Integer> premii = new ArrayList<Integer>();
		
		pilot40.setPremiu(premii);
		assertEquals(0, pilot40.mediePremii(), 0.1);
	}
	
	//Aflam maxim premiilor
	
		@Test
		public void testAflaMaximPuncte1()
		{
			Pilot pilot37 = new Pilot("Voicu Costin", 21, 1200, "8930927460041", 9, 16, "4");
			ArrayList<Integer> puncte = new ArrayList<Integer>();
			
			puncte.add(15);
			puncte.add(0);
			puncte.add(30);
			puncte.add(7);
			
			pilot37.setPuncte(puncte);
			assertEquals(30, pilot37.MaximPuncte());
		}
		
		public void testAflaMaximPuncte2()
		{
			Pilot pilot41 = new Pilot("Voicu Costin", 21, 1200, "8930927460041", 9, 16, "4");
			ArrayList<Integer> puncte = new ArrayList<Integer>();
			
			pilot41.setPuncte(puncte);
			assertEquals(0, pilot41.MaximPuncte());
		}
		
		@Test
		public void testAflaMaximPuncte3()
		{
			Pilot pilot42 = new Pilot("Voicu Costin", 21, 1200, "8930927460041", 9, 16, "4");
			ArrayList<Integer> puncte = new ArrayList<Integer>();
			
			puncte.add(15124);
			puncte.add(51235);
			puncte.add(30);
			puncte.add(-12);
			
			pilot42.setPuncte(puncte);
			assertEquals(51235, pilot42.MaximPuncte());
		}

	//Aflam cate curse a pierdut pilotul
		@Test
		public void testAflaCursePierdute1()
		{
			Pilot pilot45 = new Pilot("Voicu Costin", 21, 1200, "8930927460041", 9, 16, "4");
			assertEquals(7, pilot45.CursePierdute());
		}
		
		@Test
		public void testAflaCursePierdute2()
		{
			Pilot pilot46 = new Pilot("Voicu Costin", 21, 1200, "8930927460041", 0, 16, "4");
			assertEquals(0, pilot46.CursePierdute());
		}
		
		//Testam constructorul
		
		@Test
		public void testConstructor1()
		{
			Pilot pilot47 = new Pilot("Voicu Costin", 21, 1200, "1930927460041", 7, 16, "4");
			assertEquals("Voicu Costin", pilot47.getNume());
		}
		
		@Test
		public void testConstructor2()
		{
			Pilot pilot48 = new Pilot("Voicu Costin", 21, 1200, "1930927460041", 7, 16, "4");
			assertEquals(21, pilot48.getVarsta());
		}
		
		@Test
		public void testConstructor3()
		{
			Pilot pilot49 = new Pilot("Voicu Costin", 21, 1200, null, 7, 16, "4");
			assertEquals(null, pilot49.getCnp());
		}
		
		@Test
		public void testConstructor4()
		{
			Pilot pilot50 = new Pilot("Voicu Costin", 21, 1200, "1930927460041", 0, 16, "4");
			assertEquals(0, pilot50.getCurseCastigate());
		}
		
		//Mock
		Pilot pilotMock;
		public void setUp(){
			pilotMock = Mockito.mock(Pilot.class);
			Mockito.when(pilotMock.totalPremiiCastigate()).thenReturn(10);
			Mockito.when(pilotMock.mediePremii()).thenCallRealMethod();
			Mockito.when(pilotMock.getTotalCurse()).thenReturn(20);
		}
		
		public void testSex(){
			//System.out.println(pilotMock.getTotalCurse());
			assertEquals(0.5, pilotMock.mediePremii(),0.001);
		}

}
