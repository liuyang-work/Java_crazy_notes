

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:42
*/
public class ModTest
{
	public static void main(String[] args)
	{
		var a = 5.2;
		var b = 3.1;
		var mod = a % b;

		System.out.println(mod); // mod��ֵΪ2.1
		System.out.println("5��0.0����Ľ����:" + 5 % 0.0); // �������:NaN
		System.out.println("-5.0��0����Ľ����:" + -5.0 % 0); // �������:NaN
		System.out.println("0��5.0����Ľ����:" + 0 % 5.0); // ���0.0
		System.out.println("0��0.0����Ľ����:" + 0 % 0.0); // �������:NaN
		// ������뽫�����쳣��java.lang.ArithmeticException: / by zero
		System.out.println("-5��0����Ľ����:" + -5 % 0);
	}
}
