

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:48
*/
public class ForEachTest
{
	public static void main(String[] args)
	{
		String[] books = {"������Java EE��ҵӦ��ʵս",
			"���Java����",
			"���Android����"};
		// ʹ��foreachѭ������������Ԫ�أ�
		// ����book�����Զ�����ÿ������Ԫ��
		for (String book : books)
		{
			System.out.println(book);
		}
		for (var book : books)
		{
			System.out.println(book);
		}
	}
}
