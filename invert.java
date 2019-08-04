// 反转数字，如果反转结果溢出，则返回0
public class invert {
    public static void main(String[] args) {
        int srcNum = 1534236469;
        System.out.println("num:" + srcNum);
        System.out.println("invert num:" + reverse(srcNum));
    }

    public static int reverse(int x) {
        int result = 0;
        int dig = 0;
        int temp = 0;
        while(x != 0){
            dig = x % 10;
            temp = dig + result * 10;
            if((temp - dig)/10 != result){
                return 0;
            }
            result = temp;
            x = x / 10;
        }
        return result;
    }
}
