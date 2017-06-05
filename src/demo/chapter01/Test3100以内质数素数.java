package demo.chapter01;

/**
 * 质数(素数)1-100之间
 * 
 * @author 王涛
 *
 */
public class Test3100以内质数素数 {

	public static void main(String[] args) {
		boolean bl = true;
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					bl = false;
					break;
				}
			}
			if (bl) {
				System.out.print(i + " ");
			} else {
				bl = true;
			}
		}

	}

}
