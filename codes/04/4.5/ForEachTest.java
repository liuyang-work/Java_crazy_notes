

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
		String[] books = {"轻量级Java EE企业应用实战",
			"疯狂Java讲义",
			"疯狂Android讲义"};
		// 使用foreach循环来遍历数组元素，
		// 其中book将会自动迭代每个数组元素
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
