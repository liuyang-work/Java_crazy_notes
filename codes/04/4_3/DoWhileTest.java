

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:44
*/
public class DoWhileTest
{
	public static void main(String[] args)
	{
		// �������count
		var count = 1;
		// ִ��do whileѭ��
		do
		{
			System.out.println(count);
			// ѭ���������
			count++;
			// ѭ����������while�ؼ���
		}while (count < 10);
		System.out.println("ѭ������!");

		// �������count2
		var count2 = 20;
		// ִ��do whileѭ��
		do
			// ���д����ѭ����͵������ֺϲ�����һ�д���
			System.out.println(count2++);
		while (count2 < 10);
		System.out.println("ѭ������!");
	}
}
