package chapter3;

import java.util.ArrayList;
import java.util.List;

public class WrapperAndAutoboxing {

	public static void main(String[] args) {

		// 1)Wrapper Classes

		boolean b = true;
		Boolean bw = new Boolean(true);

		byte byte1 = 1;
		Byte byteW = new Byte((byte) 1);

		short short1 = 1;
		Short sw = new Short((short) 1);

		// Type mismatch: cannot convert from short to byte
		// TODO-Uncomment byte byte2 = short1;

		// Can convert byte to short
		short short2 = byte1;

		int int1 = 1;
		Integer integer1 = new Integer(1);

		long l = 1;
		Long lw = new Long(1);

		float float1 = 1;
		float float2 = 1.1f;
		Float float3 = new Float(1);
		Float float4 = new Float(1.0);

		double d1 = 1;
		double d2 = 1.0;
		double d3 = 1.1d;

		// Can convert float to double
		double double4 = float1;
		double double5 = int1;

		// Type mismatch: cannot convert from double to float
		// TODO-Uncomment float f2 = 1.0;

		// Type mismatch: cannot convert from double to float
		// TODO-Uncomment float f4 = d3;

		Double dw1 = new Double(1.0);
		Double dw2 = new Double(1);
		char ch = 1;
		Character chw = new Character('c');

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(new Integer(3));
		numbers.add(new Integer(5));
		numbers.remove(1);
		numbers.remove(new Integer(5));
		System.out.println(numbers);

		List<String> names = new ArrayList<>();
	}

}
