package telusko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

	public static void main(String[] args) {
		int n = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter a number");
			n = Integer.parseInt(br.readLine());
			System.out.println(n);
		} catch (IOException e) {
			System.out.println("I/O Error");
		} finally {
			try {
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
