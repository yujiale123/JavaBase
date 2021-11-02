package com.yjl.primary.day02_Operator;

/**
 * 运算符:
 * 表示式是由运算符和操作数组成的，用运算符把常量或者变量连接起来符合java语法的式子
 *
 * @author yujiale
 */
public class Operator {
    public static void main(String[] args) {
        operatorTest07();
    }

    /**
     * 算术运算符
     * 可以通过使用字符与整数做算术运算，得出字符对应的数值是多少
     * 整数相除只能得到整数，如果想要小数，只能是在浮点数值进行操作
     * 提升规则：
     * 算术表达式中不同的基本数据类型的值的时候,整个表示式的数据类型等级都会自动提升
     * byte、short、char -》int-〉long-》float -〉double的顺序执行
     */
    static void OperatorTest01() {
        int a = 10;
        int b = 20;
        int i = a + b;
        System.out.println(i);
        int i1 = a % b;
        System.out.println(i1);
        int m = 50;
        double n = 50.0;
        double v = m + n;
        System.out.println(v);
        byte j = 1;
        short k = 10;
        int i2 = j + k;
        System.out.println(i2);
    }

    /**
     * 自增自减运算符
     * n++：先使用后加（自增）
     * ++n：先加后使用
     * n--：先使用后减（自减）
     * --n：先减后使用
     */
    static void OperatorTest02() {
        int n = 10;
        n++;
        System.out.println(n);//11
        int m = 12;
        ++m;
        System.out.println(m);//13
        int i = n + m;
        System.out.println(i);//24
        i--;
        System.out.println(i);//23
        --i;
        int i1 = i + m;
        System.out.println(i1);//35
    }

    /**
     * 赋值运算符：
     * * =	赋值	a=10，将10赋值给变量a
     * +=	加后赋值	a+=b，将a+b的值给a
     * -=	减后赋值	a-=b，将a-b的值给a
     * *=	乘后赋值	a*=b，将a×b的值给a
     * /=	除后赋值	a/=b，将a÷b的商给a
     * %=	取余后赋值	a%=b，将a÷b的余数给a
     */
    static void OperatorTest03() {
        int a = 10;
        int b = 1;
        int i = a += b;
        //11
        System.out.println(i);
        System.out.println(a);
        int i1 = a -= b;
        //10
        System.out.println(i1);
        int i2 = a *= b;
        //10
        System.out.println(i2);
        int i3 = a /= b;
        //10
        System.out.println(i3);
        int i4 = a %= b;
        //0
        System.out.println(i4);
    }


    /**
     * 关系运算符
     * <p>
     * ==	a==b，判断a和b的值是否相等，成立为true，不成立为false
     * !=	a!=b，判断a和b的值是否不相等，成立为true，不成立为false
     * >	a>b，判断a是否大于b，成立为true，不成立为false
     * >=	a>=b，判断a是否大于等于b，成立为true，不成立为false
     * <	a<b，判断a是否小于b，成立为true，不成立为false
     * <=	a<=b，判断a是否小于等于b，成立为true，不成立为false
     */
    static Boolean OperatorTest04() {
        int a = 3;
        int b = 6;
        if (a == b) {
            return true;
        } else {
            if (a >= b) {
                return true;
            }
            return false;
        }
    }

    /**
     * 逻辑运算符
     * <p>
     * &   |   !
     * &	逻辑与	a&b，a和b都是true，结果为true，否则为false
     * |	逻辑或	a|b，a和b都是false，结果为false，否则为true
     * ^	逻辑异或	a^b，a和b结果不同为true，相同为false
     * !	逻辑非	!a，结果和a的结果正好相反
     * && 短路与
     * || 短路或
     * 注意事项：
     * 逻辑与&，无论左边真假，右边都要执行。
     * 短路与&&，如果左边为真，右边执行；如果左边为假，右边不执行。
     * 逻辑或|，无论左边真假，右边都要执行。
     * 短路或||，如果左边为假，右边执行；如果左边为真，右边不执行。
     */
    static void OperatorTest05() {
        int i = 10;
        int j = 20;
        int k = 31;
        System.out.println((i > j) & (i > k)); //false & false
        System.out.println((i < j) & (i > k)); //true & false
        System.out.println((i > j) & (i < k)); //false & true
        System.out.println((i < j) & (i < k)); //true & true
        System.out.println("--------");


        System.out.println((i > j) | (i > k)); //false | false
        System.out.println((i < j) | (i > k)); //true | false
        System.out.println((i > j) | (i < k)); //false | true
        System.out.println((i < j) | (i < k)); //true | true
        System.out.println("--------");


        System.out.println((i > j) ^ (i > k)); //false ^ false
        System.out.println((i < j) ^ (i > k)); //true ^ false
        System.out.println((i > j) ^ (i < k)); //false ^ true
        System.out.println((i < j) ^ (i < k)); //true ^ true
        System.out.println("--------");

        //!
        System.out.println((i > j)); //false
        System.out.println(!(i > j)); //!false
        System.out.println(!!(i > j)); //!!false
        System.out.println(!!!(i > j)); //!!!false

        //&& 有false则false
        System.out.println((i > j) && (i > k)); //false && false
        System.out.println((i < j) && (i > k)); //true && false
        System.out.println((i > j) && (i < k)); //false && true
        System.out.println((i < j) && (i < k)); //true && true
        System.out.println("--------");

        //|| 有true则true
        System.out.println((i > j) || (i > k)); //false || false
        System.out.println((i < j) || (i > k)); //true || false
        System.out.println((i > j) || (i < k)); //false || true
        System.out.println((i < j) || (i < k)); //true || true
        System.out.println("--------");

        //&&和&
        //System.out.println((i++ > 100) & (j++ > 100)); //false & false
        System.out.println((i++ > 100) && (j++ > 100)); //false && false
        System.out.println("i:" + i);
        System.out.println("j:" + j);
    }

    /**
     * 三元运算符
     * 格式： 关系表达式？表达式1:表达式2
     * a>b?a:b
     * 计算规则：
     * 首先计算关系表达式的值
     * 如果为true，表达式1的值就是运算结果
     * 如果为false，表达式2的值就是运算结果
     */
    static void OperatorTest06() {
        int a = 10;
        int b = 20;
        int i = a > b ? a : b;
        System.out.println(i);
    }

    /**
     * 练习题
     */
    static void operatorTest07() {
        int m = 10;
        int n = 5;
        m += 3;
        n += 5;
        int p = (m + n) / 2;
        int q = (m * m) * (n * n);
        System.out.println(p);
        System.out.println(q);
    }

}
