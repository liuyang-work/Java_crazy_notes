

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:42
*/
public class IfCorrectTest2
{
	public static void main(String[] args)
	{
		var age = 45;
		if (age > 60)
		{
			System.out.println("������");
		}
		// ��ԭ����if������������else����������
		if (age > 40 && !(age >60))
		{
			System.out.println("������");
		}
		// ��ԭ����if������������else����������
		if (age > 20 && !(age > 60) && !(age > 40 && !(age >60)))
		{
			System.out.println("������");
		}
	}
}
