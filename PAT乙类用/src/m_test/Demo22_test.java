package m_test;

public class Demo22_test {
    //测试Integer.parseInt()的用法
    public static void main(String[] args) {
        //Integer.parseInt(s,2)的作用就是将字符串s看作二进制转换为十进制
        /*int i = Integer.parseInt("11", 8);
        System.out.println(i);*/


        //123 456 8
        //而我们要求的是将十进制转化为8进制
        //使用循环
        /*int i = 0;
        while (true){
            //i中不能有超过等于8的数字
            i++;
            if (Integer.parseInt(i+"",8) == 579){
                break;
            }
        }
        System.out.println(i);*/
//        System.out.println(Integer.parseInt("1103",8));


        //牛逼
        System.out.println(Integer.toString(10,2));
    }
}
