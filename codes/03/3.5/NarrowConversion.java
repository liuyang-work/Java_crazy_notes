

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:39
*/
public class NarrowConversion
{
	public static void main(String[] args)
	{
		var iValue = 233;
		// ǿ�ư�һ��int���͵�ֵת��Ϊbyte���͵�ֵ
		byte bValue = (byte) iValue;
		// �����-23
		System.out.println(bValue);
		var dValue = 3.98;
		// ǿ�ư�һ��double���͵�ֵת��Ϊint
		int tol = (int) dValue;
		// �����3
		System.out.println(tol);
	}
}
