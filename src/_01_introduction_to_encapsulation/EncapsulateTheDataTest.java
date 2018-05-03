package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulateTheDataTest extends EncapsulateTheData{

	@Test
	void itemsReceivedtest() {
		setitemsReceived(-2);
		assertEquals(getitemsReceived(), 0);
	}
	@Test
	void Degreestest() {
		setdegreesTurned(-2);
		assertEquals(getdegreesTurned(), 0);
	}
	@Test
	void Stringtest() {
		setnomenclature("");
		assertEquals(getnomenclature(), " ");
	}
	@Test
	void NoMentest() {
		setmemberObj("hello");
		assertEquals(getmemberObj(), null);
	}

	
	
}
