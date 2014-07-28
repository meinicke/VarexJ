package cmu.testprograms;

import gov.nasa.jpf.util.test.TestJPF;

import java.io.IOException;

import net.sf.zipme.ZipTest;

import org.junit.Test;

public class ZipMeTest extends TestJPF {
	
	private static final String FM = "+featuremodel=zipme.dimacs";
	private static String[] config = {"+search.class= .search.RandomSearch", "+classpath=lib\\ZipMe.jar", FM};

	@Test
	public void runZipMe() {
		if (verifyNoPropertyViolation(config)) {
			try {
				ZipTest.main(new String[]{"Jens"});
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	final static String arg = "Bears are mammals of the family Ursidae. Bears are classified as caniforms, or doglike carnivorans, with the pinnipeds being their closest living relatives. Although there are only eight living species of bear, they are widespread, appearing in a wide variety of habitats throughout the Northern Hemisphere and partially in the Southern Hemisphere. Bears are found in the continents of North America, South America, Europe, and Asia.\n"+
			"Common characteristics of modern bears include a large body with stocky legs, a long snout, shaggy hair, plantigrade paws with five nonretractile claws, and a short tail. While the polar bear is mostly carnivorous and the giant panda feeds almost entirely on bamboo, the remaining six species are omnivorous, with largely varied diets including both plants and animals.\n" +
			"With the exceptions of courting individuals and mothers with their young, bears are typically solitary animals. They are generally diurnal, but may be active during the night (nocturnal) or twilight (crepuscular), particularly around humans. Bears are aided by an excellent sense of smell, and despite their heavy build and awkward gait, they can run quickly and are adept climbers and swimmers. In autumn some bear species forage large amounts of fermented fruits which affects their behaviour.[1] Bears use shelters such as caves and burrows as their dens, which are occupied by most species during the winter for a long period of sleep similar to hibernation.";
	@Test
	public void runZipMe2() {
		if (verifyNoPropertyViolation(config)) {
			try {
				ZipTest.main(new String[]{arg});
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
