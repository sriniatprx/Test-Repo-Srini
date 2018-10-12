package basicJava;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for_loop();
//		for_loop_with_break();
//		for_loop_with_continue();
//		while_loop();
//		do_while_loop();
		enhanced_for_loop();
	}

	public static void for_loop() {
		int ivalue;
		for (ivalue = 0; ivalue <= 5; ivalue++) {
			System.out.println("Counter is:"+ ivalue);

		}
		System.out.println("----ENd of simple for loop---------");
	}

	public static void for_loop_with_break() {
		int ivalue;
		for (ivalue = 0; ivalue <=5; ivalue++) {
			if (ivalue==3) {
				System.out.println("the counter reached the if condition hence broken the if loop");
				System.out.println("-----ENd of loop with break------");
				break;
			}
			System.out.println("the counter is:"+ ivalue);
		}
	}

	public static void for_loop_with_continue() {
		for (int ivalue = 0; ivalue <=5; ivalue++) {
			if (ivalue==3) {
				System.out.println("the counter is excluding the rest of the body as If condition is true and jumps to next increment");
				continue;
			}
			System.out.println("the counter is:"+ ivalue);

		}
		System.out.println("---------end of for loop with continue-------");
	}
	public static void while_loop() {
		int iwhile = 0;
		while (iwhile<50) {
			iwhile = iwhile+5;
			System.out.println("the while counter is:"+ iwhile);

		}
		System.out.println("-----end of while loop-------");
	}

	public static void do_while_loop() {
		int ivalue = 0;
		do {
			ivalue = ivalue+5;
			System.out.println("the count is:"+ ivalue);
		} while (ivalue < 25);

		int ivalue1 = 0;
		do {
			ivalue1 = ivalue1 + 30;
			System.out.println(" the count is:"+ ivalue1);

		} while (ivalue1 < 25);
		System.out.println("--------end of do while loop-------");
	}

	public static void enhanced_for_loop() {
		int avalues[] = {0,1,2,3,4,5};
		System.out.println("----enhanced for loop for array iteration with out iterator");
		for (int iIterable : avalues) {

			iIterable = iIterable+1;
			System.out.println("the iterable value are:"+iIterable);

		}
		System.out.println("----normal for loop for the same array");
		for (int i = 0; i < avalues.length; i++) {
			i= i+i;
			System.out.println("the iterator value by normal for loop is:"+ i);
		}
	}

}
