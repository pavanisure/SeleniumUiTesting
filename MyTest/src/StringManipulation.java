
public class StringManipulation {

	public static boolean comparingStrings(String input1, String input2) {
		if(input1==null && input2==null) {
			return true;
		}
		if(input1.isEmpty() && input2.isEmpty()) {
			return true;
		}
		if(input1==null || input2==null) {
			return false;
		}
		if(input1.length()!=input2.length()) {
			return false;
		}
		char[] input1CharArray=	input1.toCharArray();
		char[] input2CharArray=	input2.toCharArray();
		for(int i=0; i<input1CharArray.length;i++) {
			if(input1CharArray[i]!=input2CharArray[i])
			{
				return false;
			}

		}


		return true;
	}


}
