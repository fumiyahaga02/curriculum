package q3;

public class Main {

	public static void main(String[] args) {
		int count = 0;
		int hamada = 111;
		int matsumoto = 1355;
		int total = hamada + matsumoto;

		while (total >= 100) {
			total /= 2;
			count++;
		}

		System.out.println("相性: " + total);
		System.out.println("割った回数: " + count);

	}

}