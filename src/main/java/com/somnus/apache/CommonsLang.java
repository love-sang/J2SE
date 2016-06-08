package com.somnus.apache;

import java.io.File;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.Validate;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;
/**
 * 
 *@Project:J2SE
 *@class:CommonsLang
 *@descript:
 *StringUtils.isEmpty() 字符串是否为空
 *CollectionUtils.isEmpty() 集合是否为空
 *ArrayUtils.isEmpty() 数组是否为空
 *NumberUtils.isNumber() 判断是否为数字
 *@date:2016年6月8日 上午11:53:40
 *@author San
 *@version:V1.0
 */
public class CommonsLang {

	@Test
    public void ArrayUtils(){
        /**判断数组是否为空*/
		 System.out.println(ArrayUtils.isEmpty(new String[]{"21","是"}));//false
        System.out.println(ArrayUtils.isEmpty(new String[]{""}));//false
        System.out.println(ArrayUtils.isEmpty(new String[]{null}));//false
        System.out.println(ArrayUtils.isEmpty(new String[]{}));//true
        /**将两个数组合并为一个数组*/
        String[] s1 = new String[] {"1", "2", "3" };
        String[] s2 = new String[] {"a", "b", "c" };
        String[] s = (String[]) ArrayUtils.addAll(s1, s2);
        System.out.println(ArrayUtils.toString(s));
        /**移除*/
        String[] s3 = new String[] {"","", "a","", "b", "c" };
        for (int i = 0; i < s3.length; i++){
            if(StringUtils.isEmpty(s3[i])){
                s3 = ArrayUtils.remove(s3, i);
                i--;
            }
        }
        System.out.println(ArrayUtils.toString(s3));
        String[] ss = ArrayUtils.subarray(s, 1, 4);//数组下标从0开始
        System.out.println(ArrayUtils.toString(ss));
    }
	
	@Test
    public void ClassUtils(){
        // 取得类名
        System.out.println(ClassUtils.getShortClassName(CommonsLang.class));
        // 取得其包名
        System.out.println(ClassUtils.getPackageName(CommonsLang.class));
        // 五位的随机字母和数字 
        System.out.println(RandomStringUtils.randomAlphanumeric(5));
    }
	
	@Test
    public void StringEscapeUtils(){
        System.out.println(StringEscapeUtils.escapeHtml3("<html>"));//&lt;html&gt;
        System.out.println(StringEscapeUtils.escapeJava("String你好"));//String\u4F60\u597D
        System.out.println(StringEscapeUtils.unescapeJava("String\u4F60\u597D"));//String你好
    }
	
	@Test
    public void StringUtils(){
        // 截取从from开始字符串
        System.out.println(StringUtils.substringAfter("SELECT * FROM PERSON " , "FROM"));// PERSON 
        // 判断该字符串是不是为数字(0~9)组成，如果是，返回true 但该方法不识别有小数点和请注意
        System.out.println(StringUtils.isNumeric("454534"));// true
        
        /**
         * 判断字符串是否为空则StringUtils.isEmpty();
         * 判断字符串是否为null则StringUtils.isBlank();
         */
        /**
         * 判断是否是空格字符
         * StringUtils.isBlank(null)      = true
         * StringUtils.isBlank("")        = true
         * StringUtils.isBlank(" ")       = true 
         * StringUtils.isBlank("bob")     = false
         * StringUtils.isBlank("  bob  ") = false
         */
        System.out.println(StringUtils.isBlank("   "));
        /**
         * 判断是否是空字符串
         * StringUtils.isEmpty(null)      = true
         * StringUtils.isEmpty("")        = true
         * StringUtils.isEmpty(" ")       = false 
         * StringUtils.isEmpty("bob")     = false
         * StringUtils.isEmpty("  bob  ") = false
         */
        System.out.println(StringUtils.isEmpty("   "));
        // 将数组中的内容以@分隔(注意join返回类型为String而split返回类型为数组)
        System.out.println(StringUtils.join(new String[] { "1", "2", "3" }, "@"));//1@2@3
        // 将集合中的内容以@分隔
        System.out.println(StringUtils.join(Arrays.asList("1", "2", "3"), "@"));//1@2@3
        // 在左边加下字符,使之总长度为6
        System.out.println(StringUtils.leftPad("abc", 6, 'T'));//TTTabc
        // 在右边加下字符,使之总长度为6
        System.out.println(StringUtils.rightPad("abc", 6, 'T'));//abcTTT
        // 首字母大写 
        System.out.println(StringUtils.capitalize("abc"));//Abc
        // Deletes all whitespaces from a String 删除所有空格
        System.out.println(StringUtils.deleteWhitespace("   ab  c  "));//abc
        // 判断是否包含这个字符 
        System.out.println(StringUtils.contains("abc", "ba"));//false
        // 表示左边两个字符 
        System.out.println(StringUtils.left("abc", 2));//ab
        // 表示左边两个字符 
        System.out.println(StringUtils.right("abc", 2));//bc
        /**
         * StringUtils.remove(null, *)        = null
         * StringUtils.remove("", *)          = ""
         * StringUtils.remove(*, null)        = *
         * StringUtils.remove(*, "")          = *
         * StringUtils.remove("queued", "ue") = "qd"
         * StringUtils.remove("queued", "zz") = "queued"
         */
        System.out.println(StringUtils.remove("2015-10-01", "-"));//20151001
        System.out.println(StringUtils.isNumeric("100"));//true
        /**
         * StringUtils.strip(null)     = null
         * StringUtils.strip("")       = ""
         * StringUtils.strip("   ")    = ""
         * StringUtils.strip("abc")    = "abc"
         * StringUtils.strip("  abc")  = "abc"
         * StringUtils.strip("abc  ")  = "abc"
         * StringUtils.strip(" abc ")  = "abc"
         * StringUtils.strip(" ab c ") = "ab c"
         */
        //去掉字符串两端的空白符(whitespace) 
        System.out.println(StringUtils.strip("abc")); 
        /**
         * StringUtils.trim(null)          = null
         * StringUtils.trim("")            = ""
         * StringUtils.trim("     ")       = ""
         * StringUtils.trim("abc")         = "abc"
         * StringUtils.trim("    abc    ") = "abc"
         * StringUtils.trim("     \n\tss   \b") = "ss"
         * StringUtils.trim("  \b \t \n \f \r    ") = ""
         */
        //去掉字符串两端的控制符(control characters, char <= 32) 
        System.out.println(StringUtils.trim("abc"));
        //去掉 str 两端的在 stripChars 中的字符
        System.out.println(StringUtils.strip("  abcyx", "xyz")); // "  abc"  
        //去掉 str 前端的在 stripChars 中的字符
        System.out.println(StringUtils.stripStart("yxabc  ", "xyz")); // "abc  "
        //去掉 str 末端的在 stripChars 中的字符
        System.out.println(StringUtils.stripEnd("  abcyx", "xyz")); // "  abc"
        //默认半角空格分割  
        String str = "aaa bbb ccc";  
        String[] s = StringUtils.split(str);
        System.out.println(ArrayUtils.toString(s));//{aaa,bbb,ccc}
        //注意StringUtils.join()与StringUtils.split()的区别，前者是把数组拼接成字符串，返回类型为字符串，
        //后着是把字符串拆分成数组，返回类型是数组
        
        //指定分隔符  
        String str2 = "aaa,bbb,ccc";  
        String[] s2 = StringUtils.split(str2, ",");
        System.out.println(ArrayUtils.toString(s2));//{aaa,bbb,ccc}
        String str22 = "aaa|bbb|ccc";  
        String[] s22 = StringUtils.split(str22, "\\|");
        System.out.println(ArrayUtils.toString(s22));//{aaa,bbb,ccc}
        //去除空字符串 
        String str3 = "aaa,,ccc,";  
        String[] s3 = StringUtils.split(str3, ",");
        System.out.println(ArrayUtils.toString(s3));//{aaa,ccc}
        //去除空字符串 
        String str4 = "aaa,,ccc,";  
        String[] s4 = StringUtils.splitPreserveAllTokens(str4, ",");
        System.out.println(ArrayUtils.toString(s4));//{aaa,,ccc,}
        //指定分割的最大次数（超过后不分割）  
        String str5 = "aaa,bbb,ccc,ddd,eee";  
        String[] s5 = StringUtils.split(str5, ",", 3);
        System.out.println(ArrayUtils.toString(s5));//{"aaa","bbb","ccc,ddd,eee"}
        //生成n*String或n*char长度的字符串
        System.out.println(StringUtils.repeat("ab", 5));
        //两边填充
        System.out.println(StringUtils.center("ab", 4));
        System.out.println(StringUtils.center("ab", 6, "*"));
        //截取()中间的字符串
        System.out.println(StringUtils.substringBetween("abc(123)cde", "(", ")"));
    }
	
	 @Test
	    public void DateUtils() throws ParseException{
	        System.out.println(DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
	        //直接将日期格式化为内置的固定格式
	        System.out.println(DateFormatUtils.ISO_DATE_FORMAT.format(new Date()));
	        //字符型日期转化为Date
	        System.out.println(DateUtils.parseDate("2014-11-11 11:11:11", new String[] {"yyyy-MM-dd HH:mm:ss","yyyy-MM-dd", "yyyy/MM/dd" }));
	        System.out.println(DateUtils.parseDate("2014年11月11日", new String[] {"yyyy年MM月dd日","yyyy-MM-dd", "yyyy/MM/dd" }));
	        //日期舍入与截整
	        System.out.println(DateUtils.truncate(new Date(), Calendar.DATE));
	        //判断是否是同一天
	        System.out.println(DateUtils.isSameDay(new Date(), new Date()));
	        //加天数
	        System.out.println(DateUtils.addDays(new Date(), 10));
	    }
	
	 @Test
	    public void Validate(){
	        File sourceFile = new File(CommonsLang.class.getClassLoader().getResource("").getPath());
	        Validate.notNull(sourceFile, "source file is required.");
	        Validate.isTrue(sourceFile.isFile(), "source file [%s] is not a valid file.", sourceFile);
	        String string = "";
	        Validate.notEmpty(string, "string is not empty");
	    }
	
	
	 public void NumberUtils(){
	        /**判断字符串是否是数字*/
	        System.out.println(NumberUtils.isNumber("5.96"));//结果是true
	        System.out.println(NumberUtils.isNumber("s5"));//结果是false
	        System.out.println(NumberUtils.isNumber("0000000000596"));//结果是true
	        /**判断字符串中是否全为数字*/
	        System.out.println(NumberUtils.isDigits("0000000000.596"));//false
	        System.out.println(NumberUtils.isDigits("0000000000596"));//true
	        /**找出最大的一个*/
	        System.out.println(NumberUtils.max(new int[]{3,5,6}));
	        System.out.println(NumberUtils.max(3,1,7));
	    }
	
	
}
