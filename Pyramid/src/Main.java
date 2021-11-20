
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Qestion ９段の星（★）で出来たピラミッドを作成しましょう。
		int count = 1;
		for (int i = 9; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= count; k++) {
				System.out.print("★");
			}
			count = count + 1;
			System.out.println();
		}
	}
}

//        ★					半角空白８
//       ★★
//      ★★★
//     ★★★★
//    ★★★★★
//   ★★★★★★
//  ★★★★★★★
// ★★★★★★★★		半角空白１
//★★★★★★★★★
