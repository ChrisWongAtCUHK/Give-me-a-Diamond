class Diamond {
	public static String print(int n) {
		if(n % 2 == 0 || n < 0) return null; // invalid input
		  int i = 1;
		  // first center
		  String d = new String(new char[n]).replace("\0", "*") + "\n";
		  while(true){
		    n -=2;
		    d = String.format("%s%s\n%s%s%s\n", 
		    		// adding upper *s
		    		new String(new char[i]).replace("\0", " "),
		    		new String(new char[n]).replace("\0", "*"),
		    		// center *s
		    		d,
		    		// adding lower *s
		    		new String(new char[i++]).replace("\0", " "),
		    		new String(new char[n]).replace("\0", "*"));
		    if(n == 1)	break;
		  }
			
		return d;
	}
}