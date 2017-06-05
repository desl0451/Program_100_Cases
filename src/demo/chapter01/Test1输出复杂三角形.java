package demo.chapter01;

//555555555
//544444445
//543333345
//543222345
//543212345
//543222345
//543333345
//544444445
//555555555

public class Test1Êä³ö¸´ÔÓÈı½ÇĞÎ {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= i; j++) {
					System.out.print(6 - j);
				}
				for (int k = 1; k < 11 - 2 * i - 1; k++) {
					System.out.print(6 - i);
				}
				for (int n = 1; n <= i; n++) {
					if (i == 5) {
						if (n != 5) {
							System.out.print(n + 1);
						}
					} else {
						System.out.print(5 + n - i);
					}
				}
			} else {
				for (int j = 1; j <= 10 - i; j++) {
					System.out.print(i - (i - 6) - j);
				}
				for (int k = 1; k <= (i - 5) * 2 - 1; k++) {
					System.out.print(i - 4);
				}
				for (int n = 1; n <= 10 - i; n++) {
					System.out.print(i - (5 - n));
				}
			}
			System.out.println();
		}
	}
}
