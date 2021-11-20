public class Main {
	public static void main(String[] args) {
//	Question 整数Aが書かれたカードを持っています。
//	　　　　　1~Aの中で2で割れる回数が、一番多い数値を出力しなさい。
//	　　　　　例）A=12
//	         A/2 =6, 6/2=3, 二回
		int A = 68;
		int total = 0;
		for (int i = 1; i <= A; i++) {
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

//1,2,3,...,67,68
//64の場合
//64 / 2 = 32
//32 / 2 = 16
//16 / 2 = 8
//8 / 2 = 4
//4 / 2 = 2
//2 / 2 = 1
