package JAVA_NOTEBOOKS.s7_method_get;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ModifiersText {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("Test");
        //-------------------获取方法的详细信息
        //-------------------测试函数getDeclaredMethods()
        Method m[] = c.getDeclaredMethods();
//
        for (int i = 0; i < m.length; i++) {
            //--------------------获得方法的名字
            System.out.println("getDeclaredMethods()获得的方法的名字是:" + m[i].getName());

            //--------------------获得方法参数的类型和有几个参数
            Class b[] = m[i].getParameterTypes();//获得所有的参数并且存放到数组B中
            for (int j = 0; j < b.length; j++) {
                System.out.println("getDeclaredMethods()获得的参数的类型是" + b[j]);
            }
//
//            //--------------------获得方法返回值的类型
//            System.out.println("getDeclaredMethods()获得的方法的返回值的类型" + m[i].getReturnType());//获得方法的返回值类型
//
//            //--------------------获得方法的修饰符
//            int mod = m[i].getModifiers();
//            System.out.println("getDeclaredMethods()获得的方法的修饰符有" + Modifier.toString(mod));
//
//            //--------------------获得方法的异常类型
//            Class e[] = m[i].getExceptionTypes();//获得所有的异常类型存放到数组e中
//            for (int k = 0; k < e.length; k++) {
//                System.out.println("getDeclaredMethods()获得的方法的异常类型是：" + e[k]);
//            }
//
//            System.out.println("-------------------------------------------------------------------");
//        }
//
//        //-------------------获取方法的详细信息
//        //-------------------测试函数getMethods()
//        Method n[] = c.getMethods();
//
//        for (int i = 0; i < n.length; i++) {
//            //--------------------获得方法的名字
//            System.out.println("getMethods()获得的方法的名字是:" + n[i].getName());
//
//            //--------------------获得方法参数的类型和有几个参数
//            Class b1[] = n[i].getParameterTypes();//获得所有的参数并且存放到数组B中
//            for (int j = 0; j < b1.length; j++) {
//                System.out.println("getMethods()获得的参数的类型是" + b1[j]);
//            }
//
//            //--------------------获得方法返回值的类型
//            System.out.println("getMethods()获得的方法的返回值的类型" + n[i].getReturnType());//获得方法的返回值类型
//
//            //--------------------获得方法的修饰符
//            int mod1 = n[i].getModifiers();
//            System.out.println("getMethods()获得的方法的修饰符有" + Modifier.toString(mod1));
//
//            //--------------------获得方法的异常类型
//            Class e1[] = n[i].getExceptionTypes();//获得所有的异常类型存放到数组e中
//            for (int k = 0; k < e1.length; k++) {
//                System.out.println("getMethods()获得的方法的异常类型是：" + e1[k]);
//            }
//
//            System.out.println("-------------------------------------------------------------------");
//        }
        }
    }
}
