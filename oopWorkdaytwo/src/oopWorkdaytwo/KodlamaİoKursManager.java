package oopWorkdaytwo;

public class KodlamaŻoKursManager {
	public void add(KodlamaŻoKurs kodlamaŻoKurs) {
		System.out.println("Kurs eklendi :" + kodlamaŻoKurs.courseName);
	}

	public void list(KodlamaŻoKurs kodlamaŻoKurs) {
		System.out.println("Kurs listelendi :" + kodlamaŻoKurs.courseName + " " + kodlamaŻoKurs.description + " "
				+ kodlamaŻoKurs.id + " " + kodlamaŻoKurs.teacherName);
	}
}
