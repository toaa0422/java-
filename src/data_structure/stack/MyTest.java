package data_structure.stack;

public class MyTest {
    public static void main(String[] args) {
        String str = "4+3*2-1";
        System.out.println(stackCalculator(str));




    }
    public static int stackCalculator(String str) {
        int result=1;
//        MyStack numStack = new MyStack((10));
//        MyStack symbolStack = new MyStack((10));
//        int temp1=0;
//        int temp2=0;
//        int symbolChar=0;
//        int result=0;
//        int length =str.length();
//        String values = "";
//        for (int i = 0; i < length; i++) {
//            char c = str.charAt(i);
//            if (symbolStack.isOper(c)) {
//                if (!symbolStack.isEmpty()) {
//                    if(symbolStack.priority(c))
//                }
//
//            }
//
//
//
//        }
        return result;
    }

    public static void run2() {
        System.out.println(detecation("123321"));
    }
    public static boolean detecation(String val) {
        MyStack arrayStack = new MyStack(10);
        int length = val.length();
        for (int i = 0; i < length; i++) {
            arrayStack.push(val.charAt(i));
        }
        String newVal = "";
        int length1 = arrayStack.length();
        for (int i = 0; i < length1; i++) {
            if (!arrayStack.isEmpty()) {
                char pop = (char) arrayStack.pop();
                newVal = newVal + pop;
            }
        }
        if (val.equals(newVal)) {
            return true;
        }
        return false;

    }

    public static void run1() {
        MyStack stack = new MyStack(5);
        System.out.println(stack.isFull());
        stack.push(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (true) {
            System.out.println(stack.pop());
            if (stack.isEmpty()) {
                break;
            }

        }
    }
}
