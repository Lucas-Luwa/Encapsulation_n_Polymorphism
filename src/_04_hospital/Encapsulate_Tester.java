package _04_hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import _01_introduction_to_encapsulation.EncapsulateTheData;

public class Encapsulate_Tester {
	EncapsulateTheData ETD = new EncapsulateTheData();

	@Test
	public void testsetitemsReceived() {
		ETD.setitemsReceived(-2);
		assertEquals(0, ETD.getitemsReceived());
	}

	@Test
	public void testsetdegreesTurned() {
		assertEquals(0, ETD.getdegreesTurned(), .001);
	}

	@Test
	public void testsetnomenclature() {

		assertEquals(" ", ETD.getnomenclature());
	}

	@Test
	public void testsetmemberObj() {
		assertEquals(null, ETD.getmemberObj());
	}
}