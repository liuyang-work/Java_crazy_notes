

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:45
*/
public class NestedLoopTest
{
	public static void main(String[] args)
	{
		// ���ѭ��
		for (var i = 0; i < 5; i++)
		{
			// �ڲ�ѭ��
			for (var j = 0; j < 3; j++)
			{
				System.out.println("i��ֵΪ:" + i + "  j��ֵΪ:" + j);
			}
		}
	}
}
