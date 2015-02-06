package coverage;

import static org.junit.Assert.*;

import org.junit.Test;

public class InteractionTest {

	@Test
	public void testInteraction() {
		int line = 1;
		int degree = 2;
		String text = "TRUE";
		Interaction interaction = new Interaction(line, degree, text);
		assertEquals(line, interaction.getLine());
		assertEquals(degree, interaction.getInteraction());
		assertEquals(text, interaction.getText());
	}

	@Test
	public void testEqualsObject() {
		int line = 1;
		int degree = 2;
		String text = "TRUE";
		Interaction interaction = new Interaction(line, degree, text);
		assertEquals(interaction, interaction);
		
		Interaction interaction2 = new Interaction(line, degree, text);
		assertEquals(interaction, interaction2);
		
		Interaction interaction3 = new Interaction(line + 1, degree, text);
		assertNotEquals(interaction, interaction3);
		
		Interaction interaction4 = new Interaction(line, degree + 1, text);
		assertNotEquals(interaction, interaction4);
		
		Interaction interaction5 = new Interaction(line, degree, text + "X");
		assertNotEquals(interaction, interaction5);
		
		
	}

}
