

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:41
*/
public class MathTest
{
	public static void main(String[] args)
	{
		var a = 3.2; // �������aΪ3.2
		// ��a��5�η���������������Ϊb��
		double b = Math.pow(a, 5);
		System.out.println(b); // ���b��ֵ��
		// ��a��ƽ�����������������c
		double c = Math.sqrt(a);
		System.out.println(c); // ���c��ֵ��
		// ���������,����һ��0��1֮���α�������
		double d = Math.random();
		System.out.println(d); // ��������d��ֵ
		// ��1.57��sin����ֵ��1.57�����ɻ�����
		double e = Math.sin(1.57);
		System.out.println(e); // ����ӽ�1
	}
}
