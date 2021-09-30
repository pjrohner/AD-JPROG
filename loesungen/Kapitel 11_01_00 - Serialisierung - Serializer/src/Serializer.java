import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializer implements Serializable {

	private static void writeObject(Object object, String filename) throws IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
		out.writeObject(object);
	}

	private static Object readObject(String filename) throws IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
		return in.readObject();
	}

	public static void main(String[] args) {
		Auto auto = new Auto("VW", "Käfer", 2.00, "rot");
		Cabrio cabrio = new Cabrio("BMW", "Z3", 1.80, "schwarz");

		try {
			writeObject(auto, "auto.dat");
			writeObject(cabrio, "cabrio.dat");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

		Auto serAuto = null;
		Cabrio serCabrio = null;
		try {
			serAuto = (Auto) readObject("auto.dat");
			serCabrio = (Cabrio) readObject("cabrio.dat");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}

		serAuto.drucken();
		serCabrio.drucken();
	}
	
}