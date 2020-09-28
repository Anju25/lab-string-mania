package utility;

public class StringAdvanceMethod
{
	public String[] split(String input1,String input2)
	{
		String[] s=input1.split(input2);
		return s;
	}

	/*public String setInput1(String string) {
		
		return setInput1(string);
	}
	public String setInput2(String string)
	{
		return setInput2(string);
	}
	public String getInput1()
	{
		return getInput1();
		
	}
	public String getInput2()
	{
		return getInput2();
	}*/

	public Object concat(String string, String string2) {
		
		return string.concat(string2);
	}

	public int indexOf(String string, String string2) {
		 return string.indexOf(string2);
	}
}
