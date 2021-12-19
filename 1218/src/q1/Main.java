package q1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		String[] qKankoku = { "1ソウル", "2プサン", "3ピョンヤン" };
//		String[] qFrance = { "1ロンドン", "2パリ", "3ウィーン" };
//		String[] qVietnam = { "1ハノイ", "2ホーチミン", "3ダナン" };
//		String[] answer = { "1ソウル", "2パリ", "1ハノイ" };
		Scanner scanner = new Scanner(System.in);

		System.out.println("韓国の首都は？");
		System.out.println("1:ソウル 2:プサン 3:ピョンヤン");
		System.out.print("解答を入力> ");
		int a = scanner.nextInt();
		if (a == 1) {
			System.out.println("正解です");
		} else {
			System.out.println("不正解です");
		}		
		System.out.println("");

		System.out.println("フランスの首都は？");
		System.out.println("1:ロンドン 2:パリ 3:ウィーン");
		System.out.print("解答を入力> ");
		a = scanner.nextInt();
		if (a == 2) {
			System.out.println("正解です");
		} else {
			System.out.println("不正解です");
		}
		System.out.println("");
		
		System.out.println("ベトナムの首都は？");
		System.out.println("1:ハノイ 2:ホーチミン 3:ダナン");
		System.out.print("解答を入力> ");
		a = scanner.nextInt();
		if (a == 1) {
			System.out.println("正解です");
		} else {
			System.out.println("不正解です");
		}
		scanner.close();
	}

}
