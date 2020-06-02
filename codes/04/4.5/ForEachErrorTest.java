

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
		String[] books = {"轻量级Java EE企业应用实战",
			"疯狂Java讲义",
			"疯狂Android讲义"};
		// 使用foreach循环来遍历数组元素，其中book将会自动迭代每个数组元素
		for (var book : books)
		{
			book = "疯狂Ajax讲义";
			System.out.println(book);
		}
		System.out.println(books[0]);
	}
}
