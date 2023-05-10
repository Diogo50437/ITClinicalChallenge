package com.tddExercises.mavenproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;

/**
 * Unit test for TDD Exercises.
 */

public class AppTest 
{

	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@AfterEach
	public void tearDown() {
		System.setOut(standardOut);
	}

	// PRIMEIRO TEST : EXERCICIO DA ENTREVISTA //

	@Test
	void testMultipleAlgs() {
		App.multiplesAlg();   
		assertEquals("12IT4ClinicalIT78ITClinical11IT1314ITClinical1617IT19ClinicalIT2223ITClinical26IT2829ITClinical3132IT34ClinicalIT3738ITClinical41IT4344ITClinical4647IT49ClinicalIT5253ITClinical56IT5859ITClinical6162IT64ClinicalIT6768ITClinical71IT7374ITClinical7677IT79ClinicalIT8283ITClinical86IT8889ITClinical9192IT94ClinicalIT9798ITClinical",
				outputStreamCaptor.toString().trim());
	}

	// SEGUNDO TEST : EXERCICIO DO CHALLENGE //

	@Test
	void testUpperCaseAlg() {
		assertEquals("ITCLNA",App.upperCaseAlg("ITCLiNicAl", 1));
		assertEquals("TLN",App.upperCaseAlg("ITCLiNicAl", 2));
		assertEquals("CNA",App.upperCaseAlg("ITCLiNicAl", 3));
		assertEquals("L",App.upperCaseAlg("ITCLiNicAl", 4));
		assertEquals("",App.upperCaseAlg("ITCLiNicAl", 100));
		assertEquals("",App.upperCaseAlg("ITCLiNicAl", -1));
		assertEquals("",App.upperCaseAlg("ITCLiNicAl", 0));
	}

	// TERCEIRO TEST : TASK 1 EXTRA DO CHALLENGE //

	@Test
	void testUpperCaseAlgExtra1() {
		assertEquals("!CL1N",App.upperCaseAlgExtra1("!tCL1Nical", 1));
		assertEquals("LN",App.upperCaseAlgExtra1("!tCL1Nical", 2));
		assertEquals("CN",App.upperCaseAlgExtra1("!tCL1Nical", 3));
		assertEquals("",App.upperCaseAlgExtra1("!tCL1Nical", 100));
		assertEquals("",App.upperCaseAlgExtra1("!tCL1Nical", -1));
		assertEquals("",App.upperCaseAlgExtra1("!tCL1Nical", 0));
		assertEquals("ICLINCAL",App.upperCaseAlgExtra1("ItCLINiCAL", 1));
	}

	// QUARTO TEST : TASK 2 EXTRA DO CHALLENGE //

	@Test
	void testUpperCaseAlgExtra2() {
		App.upperCaseAlgExtra2("ItCLINiCAL", 1);
		assertEquals("A = 1\r\n"
				+ "C = 2\r\n"
				+ "I = 2\r\n"
				+ "L = 2\r\n"
				+ "N = 1",
				outputStreamCaptor.toString().trim());
		assertEquals("ICLINCAL",App.upperCaseAlgExtra2("ItCLINiCAL", 1));
	}

}
