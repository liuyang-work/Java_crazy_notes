

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:40
*/
public class AssignOperatorTest
{
	public static void main(String[] args)
	{
		var str = "Java"; // Ϊ����str��ֵΪJava
		var pi = 3.14; // Ϊ����pi��ֵΪ3.14
		var visited = true; // Ϊ����visited��ֵΪtrue
		var str2 = str; // ������str��ֵ����str2
		int a;
		int b;
		int c;
		// ͨ��Ϊa, b, c��ֵ������������ֵ����7
		a = b = c = 7;
		// �������������ֵ��
		System.out.println(a + "\n" + b + "\n" + c);

		var d1 = 12.34;
		var d2 = d1 + 5; // �����ʽ��ֵ����d2
		System.out.println(d2); // ���d2��ֵ�������17.34

	}
}
