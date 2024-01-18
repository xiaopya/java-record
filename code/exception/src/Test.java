import java.util.Scanner;

/**
 * 异常处理
 * 1.运行时异常
 * 2.编译时异常
 * 3.尝试修复
 */
public class Test {
    public static void main(String[] args) {
        // 加一个循环，尝试修复异常
        while (true) {
            try {
                System.out.println(ageIllegal1());;
                break;
            } catch (ExceptionTest e) {
                System.out.println("输入年龄格式有误，请重新输入");
            }
        }
    }

    public static double ageIllegal1() throws ExceptionTest {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入合适的价格：");
            double price = sc.nextDouble();
            if (price >= 0) {
                return price;
            } else {
                // 编译时异常
                //throw new ExceptionTest("/age is illegal, current age is: " + age);
                System.out.println("当前年龄不符合要求");
            }
        }
    }

    public static void ageIllegal(int age) {
        if (age > 0 && age < 150) {
            System.out.println("输入的年龄正常");
        } else {
            // 运行时异常
            throw new RunTimeExceptionTest("/age is illegal, current age is: " + age);
        }
    }
}