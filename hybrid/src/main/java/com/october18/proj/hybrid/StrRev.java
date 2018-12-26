package com.october18.proj.hybrid;

public class StrRev {
	
	
	
	static String recursiveMtd(String str1) {
		
		if(null == str1||str1.length()<=0) {
			
			return str1;
		}else {
			
			return recursiveMtd(str1.substring(1)) + str1.charAt(0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "xycadz";
		
		char[] ch = str.toCharArray();
		//System.out.println(ch.length);
		
		for(int i=ch.length-1;i>=0;i--){
		System.out.print(ch[i]);
	}
		System.out.println();
		System.out.print(StrRev.recursiveMtd("David"));
		
		System.out.println("This is Branch 2");
}

}
