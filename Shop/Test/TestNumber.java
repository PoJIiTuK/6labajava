package Test;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import main.ShopNumber;

	public class TestNumber {
		  @Test
		  public void test() {

		    String yourText = "ASHAN:N 50.48'69 SILPO:E 30.60'97";
		    InputStream input = new ByteArrayInputStream(yourText.getBytes());
		    System.setIn(input);

		    @SuppressWarnings("resource")
		    Scanner myScanner = new Scanner(System.in);
		    String text = myScanner.nextLine();
		    System.out.println(text);
		    ShopNumber.printText(text);
		  }
	}
