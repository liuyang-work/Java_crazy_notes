

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:42
*/
public class IfErrorTest
{
	public static void main(String[] args)
	{
		var age = 45;
		if (age > 20)
		{
			System.out.println("青年人");
		}
		else if (age > 40)
		{
			System.out.println("中年人");
		}
		else if (age > 60)
		{
			System.out.println("老年人");
		}
	}
}
