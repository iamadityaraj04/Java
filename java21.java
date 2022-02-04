public class java21 {

	public static void main(String[] args) {
		
		String names = "john, jennie, jim, jack, joe";
		
		int length = names.length();
		System.out.println("Length of names is: "+length);
		
		int idx = names.indexOf('h');
		System.out.println("idx of h is: "+idx);
		
		idx = names.lastIndexOf('o');
		System.out.println("idx of o from the end is: "+idx);
		
		idx = names.indexOf("jim"); // it will give the index from where, jim's j starts :)
		System.out.println("jim index is: "+idx); // 14
		
		//String name = names.substring(idx); // 14 | from index 14 to end
		String name = names.substring(14, 17); // 14, 15, 16
		System.out.println(name);
		
		//char ch = names.charAt(idx);
		char ch = names.charAt(length-1);
		System.out.println("ch is: "+ch); // e
		
		char[] chArr = names.toCharArray();
		int count = 0;
		for(char chr : chArr) {
			System.out.print(chr+" ");
			if(chr == 'j') {
				count++;
			}
		}
		System.out.println();
		System.out.println("j appears "+count+" times");
		
		String[] strArr = names.split(",");
		for(String str : strArr) {
			System.out.println(str.trim()); // any extra spaces from the front and end will be removed
		}
		
		String email = "john@example.com";
		if(email.contains("@") && email.contains(".com")) {
			System.out.println("A Valid Email");
		}else {
			System.out.println("Invalid Email");
		}
			
		String songName = "hello.mp3";
		if(songName.endsWith(".mp3")) { // startsWith
			System.out.println("We can play this audio file");
		}else {
			System.out.println("invalid audio file");
		}

        //join() : joins the string and 1st parameter is the symbol by which we want to join
        String joinString=String.join(" ","welcome","to","java","progamming.");  
        System.out.println(joinString);  
		
        String demo="welcome to java progamming.";
        String replace=demo.replace("o",":)");  //replaces all the occurrences of old char with new char 
        System.out.println(replace);  
        
		String demo1="welcome to java progamming. I will help you to program in java.";
        String replaceAll=demo1.replaceAll("java","python");  //replaces all the occurrences of old string with the new string.
        System.out.println(replaceAll);  
		
		//intern(): returns the interned string.
		String s1 = "welcome to java progamming";  
        String s2 = s1.intern();  
        String s3 = new String("welcome to java progamming");  
        String s4 = s3.intern();          
        System.out.println(s1==s2);  
        System.out.println(s1==s3); 
        System.out.println(s1==s4); 
	}

}