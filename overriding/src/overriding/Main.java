package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] krediManagers=new BaseKrediManager[] {new OgretmenKrediManager(), new Tar�mKrediManager(), new O�renc�KrediManager()};
        for (BaseKrediManager krediManager :krediManagers) {
        	System.out.println(krediManager.hesapla(1000));
        }
}
}