
public class Main {

	public static void main(String[] args) {
		numFinder();
	}

	public static void numFinder() {
		int[] number = new int[] { 1, 2, 3, 5, 7, 9, 0 };
		int finder = 6;
		boolean cath = false;

		for (int numbers : number) {
			if (numbers == finder) {
				cath = true;
				break;
			}
		}

		if (cath) {
			mesajVer("the number is available:" +finder);
		} else {
			mesajVer("the number does not exist:" +finder);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}
}
