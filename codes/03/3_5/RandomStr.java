

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:39
*/
public class RandomStr
{
	public static void main(String[] args)
	{
		// ����һ�����ַ���
		var result = "";
		// ����6��ѭ��
		for (var i = 0; i < 6; i++)
		{
			// ����һ��97��122��int�͵�����
			var intVal = (int) (Math.random() * 26 + 97);
			// ��intValueǿ��ת��Ϊchar�����ӵ�result����
			result = result + (char) intVal;
		}
		// �������ַ���
		System.out.println(result);
	}
}
