import java.util.Scanner;
import static java.lang.Long.parseLong;
import static java.lang.System.out;
import static java.text.MessageFormat.format;

public class CreditCardValidator {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		out.print("\nEnter a credit card number without spaces or dashes: ");
		var creditCardNumber = input.nextLine();
		input.close();
		
		var oddDigitsSum = 0;
		var evenDigitsSum = 0;
		long CreditCardNumberLong = parseLong(creditCardNumber);
		
		for (var i = 0; i < creditCardNumber.length(); i++) {
			if (i % 2 == 0) oddDigitsSum += CreditCardNumberLong % 10;
			else if (CreditCardNumberLong % 10 * 2 > 9)
				evenDigitsSum += (CreditCardNumberLong % 10 * 2) % 10 + (CreditCardNumberLong % 10 * 2) / 10;
			else evenDigitsSum += CreditCardNumberLong % 10 * 2;
			CreditCardNumberLong /= 10;
		}
		
		var totalSum = oddDigitsSum + evenDigitsSum;
		out.println(format("\nThe credit card number: {0}", creditCardNumber));
		if (totalSum % 10 == 0) out.println("The card is valid\n");
		else out.println("The credit card is INVALID\n");
	}
}
