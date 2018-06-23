package _04_hospital;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hospital {
List doctor = new List();
//switched from list to array....confused
	public void addDoctor(Surgeon surgeon) {
		doctor.add(surgeon);
	}
	public void addDoctor(GeneralPractitioner generalPractitioner) {
		doctor.add(generalPractitioner);
		
	}

	public Object getDoctors() {
		return doctor;
	}
}
