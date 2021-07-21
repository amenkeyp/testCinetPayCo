package cinetPay.backend.TestUnitaire;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cinetPay.backend.test.Resolution;

class TestUnitaire {
    protected static Resolution re;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		re = new Resolution();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testnombreOccurenceUnMotDansTableau() {
		String arr[] = {"Test", "CinetPay", "cela", "Pierre", "Cela", "Boris",
				 "CELA", "Probleme1" ,"C" ,"A" };
		assertEquals(3, Resolution.nombreOccurenceUnMotDansTableau(arr,"cela"));
	}
	@Test
	void testnombreOccurrenceDeChaqueCaratereDansUnMot() {
		assertEquals(11, Resolution.nombreOccurrenceDeChaqueCaratereDansUnMot("anticonstitutionnellement").length);	
	}

}
