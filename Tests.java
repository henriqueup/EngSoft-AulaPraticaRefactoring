import org.junit.*;
import static org.junit.Assert.*;

public class Tests {
	@Test
	public void testStatement(){
		Movie joker = new Movie("The Joker", 1);
		Movie spongeBob = new Movie("Sponge Bob - The Movie", 2);

		Rental jokerR = new Rental(joker, 8);
		Rental spongeBobR = new Rental(spongeBob, 8);

		Customer me = new Customer("Henrique");
		me.addRental(jokerR);
		me.addRental(spongeBobR);

		String expected = "";

		expected = "Rental Record for Henrique\n" +
		"	The Joker	24.0\n" +
		"	Sponge Bob - The Movie	9.0\n" +
		"Amount owed is 33.0\n" +
		"You earned 3 frequent renter points";

		assertEquals(me.statement(), expected);
	}
}
