

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:47
*/
public class ContinueTest
{
	public static void main(String[] args)
	{
		// һ���򵥵�forѭ��
		for (var i = 0; i < 3; i++)
		{
			System.out.println("i��ֵ��" + i);
			if (i == 1)
			{
				// ���Ա���ѭ����ʣ�����
				continue;
			}
			System.out.println("continue���������");
		}
	}
}
