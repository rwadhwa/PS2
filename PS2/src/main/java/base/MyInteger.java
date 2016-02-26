// Raveena Wadhwa//
package base;

public class MyInteger {

	private int iValue;

	// An int data field named iValue that stores the int value represented by
	// this object.
	// A constructor that creates a MyInteger object for the specified iValue
	MyInteger(int value) {
		iValue = value;
	}
	// A get method that returns iValue

	public int getValue() {
		return this.iValue;
	}

	// Methods isEven(), isOdd(), and isPrime() that return true if iValue is
	// even, odd, or prime, respectively
	public boolean isEven() {
		if (this.iValue % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd() {
		if (this.iValue % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isPrime() {
		boolean prime = true;
		for (int x = 2; x < iValue; x++) {
			if (this.iValue % x == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}

	// Static methods isEven(int), isOdd(int), and isPrime(int) that return true
	// if the specified value is even, odd, or prime, respectively
	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(int num) {
		if (num % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(int num) {
		boolean prime = true;
		for (int x = 2; x < num; x++) {
			if (num % x == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
	// Static methods isEven(MyInteger), isOdd(MyInteger), and
	// isPrime(MyInteger) that return true if the specified value is even, odd,
	// or prime, respectively.

	public static boolean isEven(MyInteger num2) {
		int num = num2.getValue();
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(MyInteger num2) {
		int num = num2.getValue();
		if (num % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(MyInteger num2) {
		int num = num2.getValue();
		boolean prime = true;
		for (int x = 2; x < num; x++) {
			if (num % x == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
	// Methods equals(int) and equals(MyInteger) that return true if the value
	// in the object is equal to the specified value.

	public boolean equals(int num) {
		if (this.iValue == num) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equals(MyInteger num2) {
		int num = num2.getValue();
		if (this.iValue == num) {
			return true;
		} else {
			return false;
		}
	}
}