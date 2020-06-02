

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:46
*/
public class BreakTest
{
	public static void main(String[] args)
	{
		// 一个简单的for循环
		for (var i = 0; i < 10; i++)
		{
			System.out.println("i的值是" + i);
			if (i == 2)
			{
				// 执行该语句时将结束循环
				break;
			}
		}
	}
}
