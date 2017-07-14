/**
 * Created by jingbao on 2017/7/14.
 */
public class BigNumber {
    public static void main(String[] args) {
        System.out.println(getBigNumber("135268079"));
    }
    public static String getBigNumber(String number){
        char[] arr = {'零','一','二','三','四','五','六','七','八','九'};

        char[] numArr = number.toCharArray();
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = arr[numArr[i]-'0'];
        }
        return new String(numArr);
    }
}
