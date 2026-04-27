class Char_Plus
{
	public static void main(String[] args)
	{
		String str="Hello";
		
		char [] arr=str.toCharArray();
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.print((char)(arr[i]+4));
		}
	}
}