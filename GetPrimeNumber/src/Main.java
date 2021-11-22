//解答

public class Main {
	public static int array[] = { 3, 7, 45, 1, 6, 75, 85, 24, 11, 87, 43 };

	public static void main(String[] args) {
//		Question 素数を抽出するプログラムを作成しましょう。パラメータはint型の配列で入力されます。
//		要素数は入力者の任意です。
		for (int i = 0; i < array.length; i++) {
			// if (!変数名)は (変数 == false)のとき を表す。if文に書くのはboolean型と決まっているらしい
			if (!judgePrime(i)) {
				System.out.println(array[i]);
			}
		}
	}

	public static boolean judgePrime(int i) {
		for (int a = 2; a <= array[i] / 2; a++) {
			if (array[i] % a == 0) {
				return true;
			}
		}
		return false;
	}
}