package teste;

import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class SuiteTest {

	public static void main(String[] args) {
		TestSuite suite1 = new TestSuite();
		
		suite1.addTest(new Teste("testAflaMasina3"));
		suite1.addTest(new Teste("testAflaMasina4"));
		suite1.addTest(new Teste("testConstructor1"));
		suite1.addTest(new Teste("testConstructor2"));
		suite1.addTest(new Teste("testAflaMaximPuncte1"));
		suite1.addTest(new Teste("testAflaMaximPuncte2"));
		suite1.addTest(new Teste("testAflaMaximPuncte3"));
		suite1.addTest(new Teste("testAflaMediePremii1"));
		suite1.addTest(new Teste("testAflaMediePremii3"));
		suite1.addTest(new Teste("testAflaSex3"));
		suite1.addTest(new Teste("testAflaSex5"));
		suite1.addTest(new Teste("testAflaSex6"));
		suite1.addTest(new Teste("testAflaAntecedente2"));
		suite1.addTest(new Teste("testAflaAntecedente4"));
		
		
		TestRunner.run(suite1);

	}

}
