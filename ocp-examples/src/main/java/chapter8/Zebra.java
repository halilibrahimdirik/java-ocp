package chapter8;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Zebra implements Serializable {
	private static final long serialUID = 1L;
	private transient String name = "George";
	private static String birthPlace = "Africa";
	private transient Integer age;
	private java.util.List<Zebra> friends = new java.util.ArrayList<>();
	private Object tail = null;
	{
		age = 10;
	}

	public Zebra() {
		this.name = "Sophia";
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Zebra zebra = new Zebra();
		File dataFile = new File("zebra.data");
		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(dataFile)))) {

			out.writeObject(zebra);
		}
	}
}
