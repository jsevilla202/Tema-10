package ejercicio2;

public class Main {

	public static void main(String[] args) {
		try {
			Hora hora = new Hora(1, -1, -1);
		} catch (NegativeSecondException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		} catch (NegativeMinuteException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		} catch (NegativeHourException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}

}
