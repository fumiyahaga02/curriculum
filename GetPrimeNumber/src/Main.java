
public class Main {
	public static int array[] = { 3, 7, 45, 1, 6, 75, 85, 24, 11, 87 };

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Question 素数を抽出するプログラムを作成しましょう。パラメータはint型の配列で入力されます。
//		要素数は10。
//		ではなく、
//		１～100の中で2で割れる回数をカウント
//		→２なら１回、６なら３回
//		→奇数なら条件分岐で奇数ですと表示

		for (int i = 1; i <= 100; i++) {
			int count = 0;
			if (i % 2 == 1) {
				continue;
			}
			for (int j = i; j % 2 == 0; j /= 2) {
				count++;
			}
			if (count >= total) {
				total = count;
				System.out.println("一番多く割れた数→" + i);
			}
		}
		System.out.println("");
		System.out.println("一番多く割れる回数→" + total);
	}
}
