

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
		System.out.println("5是否大于 4.0：" + (5 > 4.0)); // 输出true
		System.out.println("5和5.0是否相等：" + (5 == 5.0)); // 输出true
		System.out.println("97和'a'是否相等：" + (97 == 'a')); // 输出true
		System.out.println("true和false是否相等：" + (true == false)); // 输出false
		// 创建2个ComparableOperatorTest对象，分别赋给t1和t2两个引用
		var t1 = new ComparableOperatorTest();
		var t2 = new ComparableOperatorTest();
		// t1和t2是同一个类的两个实例的引用，所以可以比较，
		// 但t1和t2引用不同的对象，所以返回false
		System.out.println("t1是否等于t2：" + (t1 == t2));
		// 直接将t1的值赋给t3，即让t3指向t1指向的对象
		var t3 = t1;
		// t1和t3指向同一个对象，所以返回true
		System.out.println("t1是否等于t3：" + (t1 == t3));
	}
}
