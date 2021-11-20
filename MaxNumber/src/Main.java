public class Main {
	public static void main(String[] args) {
//	Question 整数Aが書かれたカードを持っています。
//	　　　　　1~Aの中で2で割れる回数が、一番多い数値を出力しなさい。
//	　　　　　例）A=12
//	         A/2 =6, 6/2=3, 二回
//		訂正↓
//		１～100の中で2で割れる回数をカウント
//		→奇数なら条件分岐で奇数ですと表示

		for (int i = 1; i <= 100; i++) {
			int count = 0;
			if (i % 2 == 1) {
				System.out.println(i + "は奇数です");
				continue;
			}
			for (int j = i; j % 2 == 0; j /= 2) {
				count++;
			}
			System.out.println(i + "が2で割れる回数 " + count + "回");
		}
	}
}

//1,2,3,...,100
//64の場合
//64 / 2 = 32
//32 / 2 = 16
//16 / 2 = 8
//8 / 2 = 4
//4 / 2 = 2
//2 / 2 = 1
