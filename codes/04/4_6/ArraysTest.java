
import java.util.Arrays;
/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:48
*/
public class ArraysTest
{
	public static void main(String[] args)
	{
		// ����һ��a����
		var a = new int[] {3, 4, 5, 6};
		// ����һ��a2����
		var a2 = new int[] {3, 4, 5, 6};
		// a�����a2����ĳ�����ȣ�ÿ��Ԫ��������ȣ������true
		System.out.println("a�����a2�����Ƿ���ȣ�"
			+ Arrays.equals(a, a2));
		// ͨ������a���飬����һ���µ�b����
		var b = Arrays.copyOf(a, 6);
		System.out.println("a�����b�����Ƿ���ȣ�"
			+ Arrays.equals(a, b));
		// ���b�����Ԫ�أ������[3, 4, 5, 6, 0, 0]
		System.out.println("b�����Ԫ��Ϊ��"
			+ Arrays.toString(b));
		// ��b����ĵ�3��Ԫ�أ�����������5��Ԫ�أ�����������Ϊ1
		Arrays.fill(b, 2, 4, 1);
		// ���b�����Ԫ�أ������[3, 4, 1, 1, 0, 0]
		System.out.println("b�����Ԫ��Ϊ��"
			+ Arrays.toString(b));
		// ��b�����������
		Arrays.sort(b);
		// ���b�����Ԫ�أ������[0, 0, 1, 1, 3, 4]
		System.out.println("b�����Ԫ��Ϊ��"
			+ Arrays.toString(b));
	}
}
