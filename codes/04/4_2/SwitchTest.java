

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:43
*/
public class SwitchTest
{
	public static void main(String[] args)
	{
		// ��������score����Ϊ�丳ֵΪ'C'
		var score = 'C';
		// ִ��swicth��֧���
		switch (score)
		{
			case 'A':
				System.out.println("����");
				break;
			case 'B':
				System.out.println("����");
//				break;
			case 'C':
				System.out.println("��");
				break;
			case 'D':
				System.out.println("����");
				break;
			case 'F':
				System.out.println("������");
				break;
			default:
				System.out.println("�ɼ��������");
		}
	}
}
