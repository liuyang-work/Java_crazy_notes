

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:44
*/
public class ForErrorTest
{
	public static void main(String[] args)
	{
		// 循环的初始化条件,循环条件，循环迭代语句都在下面一行
		for (var count = 0; count < 10; count++)
		{
			System.out.println(count);
			// 再次修改了循环变量
			count *= 0.1;
		}
		System.out.println("循环结束!");
	}
}