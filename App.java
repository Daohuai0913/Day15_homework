import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author huai
 * @date 2022/8/17
 */
public class App {
    public static void main(String[] args) throws ParseException {
        Mathtool mathtool = new Mathtool();
        System.out.println(Mathtool.divide(1.0, 2.0, 1));
        System.out.println(Mathtool.add(1.0, 2.0, 2));
        System.out.println(Mathtool.subtract(1.0, 2.0, 2));
        System.out.println(Mathtool.multiply(1.0, 2.0, 2));

        System.out.println(DateUtil.dateToStr(new Date()));

        System.out.println(DateUtil.strToDate("2020-08-17"));

        System.out.println(MoneyUtil.formatPercent(100.25));

        System.out.println(MoneyUtil.formatMoney(100.25));





    }

}

/**
 * @author huai
 * @date 2022/8/17
 * 编写类MathTool,该类包含两个数字的精确的加减乘除和四舍五入的静态方法。加的方法头如下:
 * Public static double add(double d1, double d2, int scale) //scale代表小数的位数，结果四舍五入。
 * Public static double add(double d1, double d2) //没有scale，默认值为3。
 * Public static double subtract(double d1, double d2, int scale)
 * Public static double multiply(double d1, double d2, int scale)
 * public static double divide(double d1, double d2, int scale)
 * 编写用户程序对加减乘除和四舍五入进行测试。
 */
class Mathtool {


    public static double add(double d1, double d2, int scale) {
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.add(b2).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static double add(double d1, double d2) {
        return add(d1, d2, 3);
    }

    public static double subtract(double d1, double d2, int scale) {
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.subtract(b2).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static double multiply(double d1, double d2, int scale) {
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.multiply(b2).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static double divide(double d1, double d2, int scale) {
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

}

/**
 * 写一个工具类，实现字符串转化为Date和Date转化为字符串的方法。编写测试代码进行测试。
 */
class DateUtil {
    public static Date strToDate(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


        return sdf.parse(str);
    }

    public static String dateToStr(Date date) {
//        Date转化为字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);


    }
}

/**
 * @author huai
 * 写一个工具类：写两个方法，分别把数字格式化成中文的钱币格式和把数字格式化成百分比格式
 */
class MoneyUtil {
    public static String formatMoney(double money) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        return nf.format(money);

    }

    public static String formatPercent(double percent) {
        NumberFormat nf = NumberFormat.getPercentInstance();
        String numberString = nf.format(percent);
        return numberString;
    }
}



