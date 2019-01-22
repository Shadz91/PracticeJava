package telusko;

public class DemoException {

	public static void main(String[] args) {

		int i = 5;

		try {
			if (i < 10)
				throw new MyException();
		} catch (MyException e) {
			System.out.println("All mine now");
		}
	}

}