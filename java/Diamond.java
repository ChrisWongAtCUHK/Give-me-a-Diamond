class Diamond {
	public static String print(int n) {
		if (n < 0 || n % 2 == 0)
			return null;

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= n; i += 2) {
			printLine(sb, n, i);
		}

		for (int i = n - 2; i >= 1; i -= 2) {
			printLine(sb, n, i);
		}

		return sb.toString();
	}

	static void printLine(StringBuilder sb, int n, int i) {
		repeatChar(sb, ' ', (n - i) / 2);
		repeatChar(sb, '*', i);
		sb.append('\n');
	}

	static void repeatChar(StringBuilder sb, char c, int n) {
		for (int i = 0; i < n; i++) {
			sb.append(c);
		}
	}
}