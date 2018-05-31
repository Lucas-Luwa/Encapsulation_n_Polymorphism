package _04_hospital;

import java.util.ArrayList;

public class Hospital {
ArrayList doctor = new ArrayList();

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
