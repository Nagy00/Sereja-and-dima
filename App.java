import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int n = 0;
		int sereja = 0;
		int dima = 0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int[] cards = new int[n];
		for (int i = 0; i < cards.length; i++) {
			cards[i] = in.nextInt();
		}
		int rightMost = n - 1;
		int leftMost = 0;
		boolean turns = true;
		while (leftMost <= rightMost) {
			if (cards[rightMost] >= cards[leftMost]) {
				if (turns) {
					sereja += cards[rightMost];
				} else {
					dima += cards[rightMost];
				}
				rightMost--;
			} else if (cards[leftMost] > cards[rightMost]) {
				if (turns) {
					sereja += cards[leftMost];
				} else {
					dima += cards[leftMost];
				}
				leftMost++;
			}
			if (turns)
				turns = false;
			else
				turns = true;
		}
		System.out.println(sereja + " " + dima);
		in.close();
	}
}