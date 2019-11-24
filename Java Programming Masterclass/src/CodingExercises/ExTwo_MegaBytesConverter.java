package CodingExercises;

public class ExTwo_MegaBytesConverter {
	

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		
		if (kiloBytes < 0) {
			System.out.println("Invalid");
		}
		else {
			int megaBytes = kiloBytes / 1024;
			int remainingKiloBytes = kiloBytes % 1024;
			System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB"); //2500 KB = 2 MB and 452 KB
		}
	}

}
