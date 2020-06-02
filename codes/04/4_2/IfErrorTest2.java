

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:43
*/
public class IfErrorTest2
{
	public static void main(String[] args)
	{
		var age = 45;
		if (age > 20)
		{
			System.out.println("青年人");
		}
		// 在原本的if条件中增加了else的隐含条件
		if (age > 40 && !(age > 20))
		{
			System.out.println("中年人");
		}
		// 在原本的if条件中增加了else的隐含条件
		if (age > 60 && !(age > 20) && !(age > 40 && !(age > 20)))
		{
			System.out.println("老年人");
		}
	}
}
