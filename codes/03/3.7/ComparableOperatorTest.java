

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:40
*/
public class ComparableOperatorTest
{
	public static void main(String[] args)
	{
		System.out.println("5�Ƿ���� 4.0��" + (5 > 4.0)); // ���true
		System.out.println("5��5.0�Ƿ���ȣ�" + (5 == 5.0)); // ���true
		System.out.println("97��'a'�Ƿ���ȣ�" + (97 == 'a')); // ���true
		System.out.println("true��false�Ƿ���ȣ�" + (true == false)); // ���false
		// ����2��ComparableOperatorTest���󣬷ֱ𸳸�t1��t2��������
		var t1 = new ComparableOperatorTest();
		var t2 = new ComparableOperatorTest();
		// t1��t2��ͬһ���������ʵ�������ã����Կ��ԱȽϣ�
		// ��t1��t2���ò�ͬ�Ķ������Է���false
		System.out.println("t1�Ƿ����t2��" + (t1 == t2));
		// ֱ�ӽ�t1��ֵ����t3������t3ָ��t1ָ��Ķ���
		var t3 = t1;
		// t1��t3ָ��ͬһ���������Է���true
		System.out.println("t1�Ƿ����t3��" + (t1 == t3));
	}
}
