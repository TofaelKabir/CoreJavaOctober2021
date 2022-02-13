package lec22_01_java_string_manipulation02;

public class UseOfStringBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello"); // It creates a String Builder with the specified string.
		System.out.println(sb);
		// The append() method concatenates the given argument with this String at the end
		sb.append(" World!");
		System.out.println(sb);
		
		// The insert() method inserts the given String with this string at the given position.		
		StringBuffer sb2 = new StringBuffer("Wee to Java");
		sb2.insert(2, "lcom");
		System.out.println(sb2);
		
		// The replace() method replaces the given String from the specified beginIndex and endIndex.
		StringBuffer sb3 = new StringBuffer("Welcomi oo Javascript");
		sb3.replace(6, 10, "e to"); // replace start from 6, the upper boundary is 10 and excluded
		System.out.println(sb3);
		
		// The delete() method of the StringBuffer class deletes the String from the
		// specified beginIndex to endIndex.
		sb.delete(0, 6); // sb = Hello World!
		System.out.println(sb); // outcome: World!
			
		// The reverse() method of the StringBuilder class reverses the current String.
		sb.reverse(); // now sb = World!
		System.out.println(sb);// prints !dlroW
		
		// The capacity() method of the StringBuffer class returns the current capacity of the buffer. The default capacity of the buffer is 16.

		StringBuffer sb4 = new StringBuffer();
		System.out.println(sb4.capacity());
		sb4.append("Hello! "); // by default 16
		System.out.println(sb4.capacity());
		sb4.append("Java is a popular language");
		System.out.println(sb4.capacity()); // formula: (16*2)+2=34 i.e (oldcapacity*2)+2
		sb4.ensureCapacity(10); // now no change
		System.out.println(sb4.capacity());// now 34
		sb4.ensureCapacity(50); 
		System.out.println(sb4.capacity());// now 70
		
		
		
		
		
		

	}

}
