package oopWorkdaytwo;

public class Main {

	public static void main(String[] args) {
		KodlamaİoKurs kodlamaİoKurs= new KodlamaİoKurs("Engin", "Java", 5,"Ücretsiz" );
		KodlamaİoKursManager kodlamaİoKursManager=new KodlamaİoKursManager();
		kodlamaİoKursManager.add(kodlamaİoKurs);
		kodlamaİoKursManager.list(kodlamaİoKurs);
	}

}

