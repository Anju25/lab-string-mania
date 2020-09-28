package utility;

public class StringBoolean {
	private String input1;
	private String input2;

	public String getInput1() {
		return input1;
	}

	public void setInput1(String input1) {
		this.input1 = input1;
	}

	public String getInput2() {
		return input2;
	}

	public void setInput2(String input2) {
		this.input2 = input2;
	}

	public boolean contains(String input1, String input2) {
		boolean output = input1.contains(input2);
		System.out.println(output);
		return output;
	}

	public boolean endsWith(String input1, String input2) {
		boolean output = input1.endsWith(input2);
		return output;
	}

	public boolean startsWith(String input1, String input2) {
		boolean output = input1.startsWith(input2);
		return output;
	}

	public boolean equals(String input1, String input2) {
		boolean output = input1.equals(input2);
		return output;
	}

	public boolean equalsIgnoreCase(String input1, String input2) {
		boolean output = input1.equalsIgnoreCase(input2);
		return output;
	}
	public String concatenate(String input1,String input2)
	{
		return input1.concat(input2);
	}
	public int indexOf(String input,char ch)
	{
		return indexOf(input,ch);
		/*int index=0;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==ch)
				index=i;
		}
		return index;*/
	}
	public String[] split(String input1,String input2)
	{
		String[] s=input1.split(input2);
		return s;
	}

}
