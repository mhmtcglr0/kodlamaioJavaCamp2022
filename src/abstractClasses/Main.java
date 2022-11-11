package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		//Abstract sınıflar newlenemez,newlersek metodunu ezmek zorunda kalırız buda çirkin bir kullanımdır.
		//Abstract sınıflar base sınıfı gizlemek için kullanılabilir
		
		GameCalculator gameCalculator = new WomanGameCalculator();
		
		
		

	}

}
