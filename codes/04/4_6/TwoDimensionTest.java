

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:53
*/
public class TwoDimensionTest
{
	public static void main(String[] args)
	{
		// ����һ����ά����
		int[][] a;
		// ��a����һά������г�ʼ������ʼ��a��һ������Ϊ4������
		// a���������Ԫ��������������
		a = new int[4][];
		// ��a���鵱��һά���飬����a�����ÿ������Ԫ��
		for (int i = 0, len = a.length; i < len; i++)
		{
			System.out.println(a[i]);
		}
		// ��ʼ��a����ĵ�һ��Ԫ��
		a[0] = new int[2];
		// ����a����ĵ�һ��Ԫ����ָ����ĵڶ���Ԫ��
		a[0][1] = 6;
		// a����ĵ�һ��Ԫ����һ��һά���飬�������һά����
		for (int i = 0, len = a[0].length; i < len; i++)
		{
			System.out.println(a[0][i]);
		}

		// ͬʱ��ʼ����ά�����2��ά��
		int[][] b = new int[3][4];

		// ʹ�þ�̬��ʼ�����﷨����ʼ��һ����ά����
		String[][] str1 = new String[][] {new String[3],
			new String[] {"hello"}};
		// ʹ�ü򻯵ľ�̬��ʼ���﷨����ʼ����ά����
		String[][] str2 = {new String[3],
			new String[] {"hello"}};
		System.out.println(str1[1][0]);
		System.out.println(str2[1][0]);
	}
}

