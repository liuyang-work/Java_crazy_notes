

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
		// ѭ���ĳ�ʼ������,ѭ��������ѭ��������䶼������һ��
		for (var count = 0; count < 10; count++)
		{
			System.out.println(count);
			// �ٴ��޸���ѭ������
			count *= 0.1;
		}
		System.out.println("ѭ������!");
	}
}