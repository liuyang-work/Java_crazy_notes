

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:41
*/
public class LogicOperatorTest
{
	public static void main(String[] args)
	{
		// ֱ�Ӷ�false������㣬������true
		System.out.println(!false);
		// 5>3����true��'6'ת��Ϊ����54��'6'>10����true������󷵻�true
		System.out.println(5 > 3 && '6' > 10);
		// 4>=5����false��'c'>'a'����true�����󷵻�true
		System.out.println(4 >= 5 || 'c' > 'a');
		// 4>=5����false��'c'>'a'����true��������ͬ�Ĳ���������򷵻�true
		System.out.println(4 >= 5 ^ 'c' > 'a');

		// �������a,b����Ϊ����������ֵ
		var a = 5;
		var b = 10;
		// ��a > 4��b++ > 10�������
		if (a > 4 | b++ > 10)
		{
			// ���a��ֵ��5��b��ֵ��11��
			System.out.println("a��ֵ��:" + a + "��b��ֵ��:" + b);
		}

		// �������c,d����Ϊ����������ֵ
		var c = 5;
		var d = 10;
		// c > 4 || d++ > 10�������
		if (c > 4 || d++ > 10)
		{
			// ���c��ֵ��5��d��ֵ��10��
			System.out.println("c��ֵ��:" + c + "��d��ֵ��:" + d);
		}

	}
}
