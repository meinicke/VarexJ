package cmu.testprograms;

import static org.junit.Assert.*;

import java.io.IOException;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;
import net.sf.zipme.ZipTest;

import org.junit.Ignore;
import org.junit.Test;

public class ZipMeTest extends TestJPF {
//	private static String file = "C:\\Users\\Loaner\\workspace\\BankAccount-FH-JML_new\\BAmodel.dimacs";
//	private static String file = "BAmodel.dimacs";
	
	private static final String FM = "+featuremodel=zipme.dimacs";
	
	@Test
	public void runZipMe() {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch", "+classpath=lib\\ZipMe.jar", FM)) {
			try {
				ZipTest.main(new String[]{"Jens"});
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	String arg = "Bears are mammals of the family Ursidae. Bears are classified as caniforms, or doglike carnivorans, with the pinnipeds being their closest living relatives. Although there are only eight living species of bear, they are widespread, appearing in a wide variety of habitats throughout the Northern Hemisphere and partially in the Southern Hemisphere. Bears are found in the continents of North America, South America, Europe, and Asia.\n"+
			"Common characteristics of modern bears include a large body with stocky legs, a long snout, shaggy hair, plantigrade paws with five nonretractile claws, and a short tail. While the polar bear is mostly carnivorous and the giant panda feeds almost entirely on bamboo, the remaining six species are omnivorous, with largely varied diets including both plants and animals.\n" +
			"With the exceptions of courting individuals and mothers with their young, bears are typically solitary animals. They are generally diurnal, but may be active during the night (nocturnal) or twilight (crepuscular), particularly around humans. Bears are aided by an excellent sense of smell, and despite their heavy build and awkward gait, they can run quickly and are adept climbers and swimmers. In autumn some bear species forage large amounts of fermented fruits which affects their behaviour.[1] Bears use shelters such as caves and burrows as their dens, which are occupied by most species during the winter for a long period of sleep similar to hibernation.";
	@Test
	public void runZipMe2() {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch", "+classpath=lib\\ZipMe.jar", FM)) {
			try {
				ZipTest.main(new String[]{arg});
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Conditional
	public static boolean __SELECTED_FEATURE_Base = true;
	@Conditional
	public static boolean __SELECTED_FEATURE_CRC = true;
	@Conditional
	public static boolean __SELECTED_FEATURE_ArchiveCheck = true;
	@Conditional
	public static boolean __SELECTED_FEATURE_ZipMeTest = true;
	@Conditional
	public static boolean __SELECTED_FEATURE_GZIP = true;
	@Conditional
	public static boolean __SELECTED_FEATURE_Adler32Checksum = false;
	@Conditional
	public static boolean __SELECTED_FEATURE_Compress = true;
	@Conditional
	public static boolean __SELECTED_FEATURE_Extract = true;
	@Conditional
	public static boolean __SELECTED_FEATURE_DerivativeGZIPCRC = false;
	@Conditional
	public static boolean __SELECTED_FEATURE_DerivativeCompressCRC = true;
	@Conditional
	public static boolean __SELECTED_FEATURE_DerivativeExtractCRC = true;
	@Conditional
	public static boolean __SELECTED_FEATURE_DerivativeCompressGZIP = true;
	@Conditional
	public static boolean __SELECTED_FEATURE_DerivativeCompressAdler32Checksum = true;
	@Conditional
	public static boolean __SELECTED_FEATURE_DerivativeCompressGZIPCRC = true;
	
	@Test
	public void modelTest() throws Exception {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch", "+classpath=lib\\ZipMe.jar", FM)) {
			assertTrue(valid_product());
		}
	}
	
	public static boolean valid_product() {
		if ((__SELECTED_FEATURE_Base) && (__SELECTED_FEATURE_ZipMeTest) && (__SELECTED_FEATURE_Compress) && (__SELECTED_FEATURE_Extract)
				&& (!__SELECTED_FEATURE_GZIP || __SELECTED_FEATURE_CRC)
				&& (__SELECTED_FEATURE_CRC || __SELECTED_FEATURE_Adler32Checksum)
				&& (!(__SELECTED_FEATURE_Compress && __SELECTED_FEATURE_Adler32Checksum) ^ __SELECTED_FEATURE_DerivativeCompressAdler32Checksum)
				&& (!(__SELECTED_FEATURE_Compress && __SELECTED_FEATURE_CRC) ^ __SELECTED_FEATURE_DerivativeCompressCRC)
				&& (!(__SELECTED_FEATURE_Compress && __SELECTED_FEATURE_GZIP) ^ __SELECTED_FEATURE_DerivativeCompressGZIP)
				&& (!(__SELECTED_FEATURE_Compress && __SELECTED_FEATURE_GZIP && __SELECTED_FEATURE_CRC) ^ __SELECTED_FEATURE_DerivativeCompressGZIPCRC)
				&& (!(__SELECTED_FEATURE_Extract && __SELECTED_FEATURE_CRC) ^ __SELECTED_FEATURE_DerivativeExtractCRC)
				&& (!(__SELECTED_FEATURE_GZIP && __SELECTED_FEATURE_CRC) ^ __SELECTED_FEATURE_DerivativeGZIPCRC))
			return true;
		else
			return false;
	}

}
