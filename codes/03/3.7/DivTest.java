

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:40
*/
public class DivTest
{
	public static void main(String[] args)
	{
		var a = 5.2;
		var b = 3.1;
		var div = a / b;
		// div��ֵ����1.6774193548387097
		System.out.println(div);
		// ����������Infinity
		System.out.println("5����0.0�Ľ����:" + 5 / 0.0);
		// ����������-Infinity
		System.out.println("-5����0.0�Ľ����:" + - 5 / 0.0);
		// ������뽫�����쳣
		// java.lang.ArithmeticException: / by zero
		System.out.println("-5����0�Ľ����::" + -5 / 0);
	}
}

