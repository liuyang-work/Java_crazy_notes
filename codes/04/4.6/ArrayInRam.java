

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:24:00
*/
public class ArrayInRam
{
	public static void main(String[] args)
	{
		// ���岢��ʼ�����飬ʹ�þ�̬��ʼ��
		int[] a = {5, 7, 20};
		// ���岢��ʼ�����飬ʹ�ö�̬��ʼ��
		var b = new int[4];
		// ���b����ĳ���
		System.out.println("b����ĳ���Ϊ��" + b.length);
		// ѭ�����a�����Ԫ��
		for (int i = 0, len = a.length; i < len; i++)
		{
			System.out.println(a[i]);
		}
		// ѭ�����b�����Ԫ��
		for (int i = 0, len = b.length; i < len; i++)
		{
			System.out.println(b[i]);
		}
		// ��Ϊa��int[]���ͣ�bҲ��int[]���ͣ����Կ��Խ�a��ֵ����b��
		// Ҳ������b����ָ��a����ָ�������
		b = a;
		// �ٴ����b����ĳ���
		System.out.println("b����ĳ���Ϊ��" + b.length);
	}
}
