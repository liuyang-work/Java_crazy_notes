

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:27:37
*/
public class StringSwitchTest
{
	public static void main(String[] args)
	{
		// ��������season
		var season = "����";
		// ִ��swicth��֧���
		switch (season)
		{
			case "����":
				System.out.println("��ů����.");
				break;
			case "����":
				System.out.println("��������.");
				break;
			case "����":
				System.out.println("�����ˬ.");
				break;
			case "����":
				System.out.println("��ѩ����.");
				break;
			default:
				System.out.println("�����������");
		}
	}
}
