import java.lang.reflect.Modifier;

public class InspectorPrinter {

	static void printField(int modifier, Class classtype, String name) {

		System.out.println("- " + Modifier.toString(modifier) + " "
				+ classtype.getName() + " " + name);
	}

	static void printConstructor(int modifier, String name, Class[] params,
			Class[] exceptions) throws NoSuchFieldException {

		System.out.println("- " + Modifier.toString(modifier) + " " + name
				+ getParametersAsString(params)
				+ getExceptionsAsString(exceptions));
	}

	static void printClass(String name, int modifier, Class[] interfaces) {
		System.out
				.println("Inspektion : \n-------------------------------------------");
		System.out.print(Modifier.toString(modifier) + " class " + name);
		if (interfaces.length != 0) {
			System.out.print(" implements ");
			for (int i = 0; i < interfaces.length; i++) {
				System.out.print(interfaces[i].getName());
				if (interfaces.length > 1) {
					System.out.print(", ");
				} else {
				}
			}
		}
		System.out.println();
	}

	static void printMethod(int modifier, Class returnType, String name,
			Class[] params, Class[] exceptions) {

		System.out.println(Modifier.toString(modifier) + " "
				+ returnType.getName() + " " + name
				+ getParametersAsString(params)
				+ getExceptionsAsString(exceptions));

	}

	private static String getParametersAsString(Class[] params) {
		StringBuffer sb = new StringBuffer();
		sb.append("(");
		for (int i = 0; i < params.length; i++) {
			if (i == (params.length - 1)) {
				sb.append(params[i].getName());
			} else {
				sb.append(params[i].getName() + ", ");
			}
		}
		sb.append(")");
		return sb.toString();
	}

	private static String getExceptionsAsString(Class[] exceptions) {
		StringBuffer sb = new StringBuffer();
		if (exceptions.length != 0) {
			sb.append(" throws ");
			for (int i = 0; i < exceptions.length; i++) {
				sb.append(exceptions[i].getName());
				if (exceptions.length > 1) {
					sb.append(", ");
				}
			}
		}
		return sb.toString();
	}
}