

/*
* @Author: liuyang
* @Date:   2020-06-02 15:22:32
* @Last Modified by:   liuyang
* @Last Modified time: 2020-06-02 15:26:43
*/
public class SwitchTest
{
	public static void main(String[] args)
	{
		// 声明变量score，并为其赋值为'C'
		var score = 'C';
		// 执行swicth分支语句
		switch (score)
		{
			case 'A':
				System.out.println("优秀");
				break;
			case 'B':
				System.out.println("良好");
//				break;
			case 'C':
				System.out.println("中");
				break;
			case 'D':
				System.out.println("及格");
				break;
			case 'F':
				System.out.println("不及格");
				break;
			default:
				System.out.println("成绩输入错误");
		}
	}
}
