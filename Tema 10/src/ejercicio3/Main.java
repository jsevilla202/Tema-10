package ejercicio3;

public class Main {

	public static void main(String[] args) {
		try {
			Fecha fecha = new Fecha(0, 12, 14);
		} catch (DayException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		} catch (MonthException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}

	}

}
