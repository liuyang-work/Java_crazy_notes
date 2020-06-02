

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
		// 定义一个空字符串
		var result = "";
		// 进行6次循环
		for (var i = 0; i < 6; i++)
		{
			// 生成一个97～122的int型的整数
			var intVal = (int) (Math.random() * 26 + 97);
			// 将intValue强制转换为char后连接到result后面
			result = result + (char) intVal;
		}
		// 输出随机字符串
		System.out.println(result);
	}
}
