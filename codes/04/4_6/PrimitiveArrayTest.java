

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:49
*/
public class PrimitiveArrayTest
{
	public static void main(String[] args)
	{
		// ����һ��int[]���͵��������
		int[] iArr;
		// ��̬��ʼ�����飬���鳤��Ϊ5
		iArr = new int[5];
		// ����ѭ����ʽΪÿ������Ԫ�ظ�ֵ��
		for (var i = 0; i <iArr.length; i++)
		{
			iArr[i] = i + 10;
		}
	}
}
