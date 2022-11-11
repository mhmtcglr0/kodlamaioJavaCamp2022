package abstractClasses;

public abstract class GameCalculator {
	
	//Kim inherit ediyorsa hesaplayı içermeli fakat override ederek kullanmalıdır.    
	public abstract void hesapla();
	
	
	//Override edilemez, GameCalculatorı kim kullanıyorsa olduğu gibi kullanmak zorundadır.
	public final void gameOver() {
		System.out.println("Oyun Bitti");
	}

}
