

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:40
*/
public class BitOperatorTest
{
	public static void main(String[] args)
	{
//		System.out.println(2.5 & 3.0);
		System.out.println(5 & 9); // �����1
		System.out.println(5 | 9); // �����13
		System.out.println(~-5); // �����4
		System.out.println(5 ^ 9); // �����12
		System.out.println(5 << 2); // ���20
		System.out.println(-5 << 2); // ���-20
		System.out.println(-5 >> 2); // ���-2
		System.out.println(-5 >>> 2); // ���1073741822
	}
}
