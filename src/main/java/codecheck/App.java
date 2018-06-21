package codecheck;

public class App {
	public static void main(String[] args) {
		// mを取得
		int m = Integer.parseInt(args[args.length -1]);

		int a;
		String s;
		StringBuilder output = null;

		// ｍ以前の引数分処理
		for (int i = 0, l = args.length-1; i < l; i++) {
			// aとsを取得
			System.out.println(args[i].substring(0,args[i].indexOf(":")-1);
			a = Integer.parseInt(args[i].substring(0,args[i].indexOf(":")-1));
			s = args[i].substring(args[i].indexOf(":")+1);

			// 割り切れる場合
			if (m % a == 0) {
				output.append(s);
			}
		}
		if (output == null) {
			System.out.println(m);
		} else {
			System.out.println(output);
		}
	}
}
