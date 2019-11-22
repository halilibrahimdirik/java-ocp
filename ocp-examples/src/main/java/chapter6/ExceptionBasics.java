package chapter6;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class ExceptionBasics {

	public static void main(String[] args) {

		System.out.println("started");
		read8();
	}

	// 1)
	public static void read1() throws SQLException {
		throw new SQLClientInfoException();
	}

	// 2)
	public static void read2() throws Exception {
		throw new SQLClientInfoException();
	}

	// 3)
	public static void read3() throws Exception {
		throw new Exception();
	}

	// 4)
	public static void read4() throws SQLException {

		//Unhandled exception type Exception
//		throw new Exception();

	}

	// 5)
	public static void read5() throws Exception {

	}

	// 6)
	public static void read6() {
		throw new ArrayStoreException("Array Store");
	}

	// 7)
	public static void read7() {
		// try {
		//
		// }
		// // Unreachable catch block for SQLException. This exception is never thrown
		// from
		// // the try statement body
		// catch (SQLException e) {
		//
		// }
	}

	// 8)
	public static void read8() throws Error {

		throw new Error();

	}
}
