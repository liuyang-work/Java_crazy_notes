

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:47
*/
public class ForEachErrorTest
{
	public static void main(String[] args)
	{
		String[] books = {"������Java EE��ҵӦ��ʵս",
			"���Java����",
			"���Android����"};
		// ʹ��foreachѭ������������Ԫ�أ�����book�����Զ�����ÿ������Ԫ��
		for (var book : books)
		{
			book = "���Ajax����";
			System.out.println(book);
		}
		System.out.println(books[0]);
	}
}
