

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
		// һ���򵥵�forѭ��
		for (var i = 0; i < 10; i++)
		{
			System.out.println("i��ֵ��" + i);
			if (i == 2)
			{
				// ִ�и����ʱ������ѭ��
				break;
			}
		}
	}
}
