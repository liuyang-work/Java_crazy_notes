

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:45
*/
public class ForTest2
{
	public static void main(String[] args)
	{
		// ͬʱ������������ʼ��������ʹ��&&����϶��boolean���ʽ
		for (int b = 0, s = 0, p = 0;
			b < 10 && s < 4 && p < 10; p++)
		{
			System.out.println(b++);
			System.out.println(++s + p);
		}
	}
}

