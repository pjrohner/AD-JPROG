import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Inspector {

	private static Auto auto;

	public static void main(String[] args) {
		auto = new Auto("BMW", "Limousine", 2.0);

		checkClass(auto.getClass());

		auto.setTyp("BMW");
		System.out.println("Typ (alt): " + auto.getTyp());
		editClass(auto.getClass());
		System.out.println("Typ (neu): " + auto.getTyp());
	}

	// Ausgabe der Klasse
	public static void checkClass(Class c) {
		String name;
		int modifier;
		Constructor[] constructor;
		Method[] method;
		Field[] field;
		Class superclass;
		Class[] interfaces;

		name = c.getName();
		modifier = c.getModifiers();
		field = c.getDeclaredFields();
		constructor = c.getDeclaredConstructors();
		method = c.getDeclaredMethods();
		superclass = c.getSuperclass();
		interfaces = c.getInterfaces();

		System.out.println("Superclass: " + superclass.getSimpleName());
		evalClass(modifier, name, interfaces);
		try {
			evalDeclaredConstrutors(constructor);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		evalDeclaredMethods(method);
		evalDeclaredFields(field);
	}

	private static void editClass(Class c) {
		try {
			Field field = c.getField("typ");
			field.set(auto, "Touring");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void evalClass(int modifier, String name, Class[] interfaces) {
		InspectorPrinter.printClass(name, modifier, interfaces);
	}

	private static void evalDeclaredFields(Field[] field) {
		for (int i = 0; i < field.length; i++) {
			InspectorPrinter.printField(field[i].getModifiers(), field[i]
					.getType(), field[i].getName());
		}
	}

	private static void evalDeclaredConstrutors(Constructor[] constructor)
			throws NoSuchFieldException {
		for (int i = 0; i < constructor.length; i++) {
			InspectorPrinter.printConstructor(constructor[i].getModifiers(),
					constructor[i].getName(), constructor[i]
							.getParameterTypes(), constructor[i]
							.getExceptionTypes());
		}
	}

	private static void evalDeclaredMethods(Method[] methods) {
		for (int i = 0; i < methods.length; i++) {
			InspectorPrinter.printMethod(methods[i].getModifiers(), methods[i]
					.getReturnType(), methods[i].getName(), methods[i]
					.getParameterTypes(), methods[i].getExceptionTypes());
		}
	}

}