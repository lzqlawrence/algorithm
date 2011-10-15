package calcBytes;

import java.io.UnsupportedEncodingException;

public class FirstTest {
    public static void main(String... args) throws UnsupportedEncodingException {
        String str = "ÖÐÎÄ123";
//        String str = "abcdefg";
        String encoding = "GBK";//unicode, gbk, utf-8, iso8859-1,.....
        byte[] bytes = str.getBytes(encoding);
//        System.out.println(bytes.length);
//        for (int i = 0; i < bytes.length; i++) {
//            System.out.println((byte) bytes[i]);
//        }

        int pos = 3;
        System.out.println("ab".getBytes("unicode").length);
//        System.out.println(getSubString(str, pos, encoding));
    }

    private static String getSubString(String str, int pos, String encoding) throws UnsupportedEncodingException {
//        byte[] bytes = str.getBytes(encoding);
//        if (pos % 2 != 0) pos -= 1;
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < pos; i++) {
//            sb.append((char) bytes[i + 2]);
//        }
//        System.out.println("---" + sb.toString());
                    if (str == null || str.length() < 1) return null;
                    if (pos < 1) return null;
                    StringBuffer sb = new StringBuffer();
                    int all = 0;
                    for (int i = 0; i < str.length(); i++) {
                        if (all >= pos) {
                            break;
                        }
            String tmp = str.substring(i, i + 1);
            sb.append(tmp);
//            System.out.println("ddd" + sb.toString() + " ---" + tmp);
            byte[] tmpB = tmp.getBytes(encoding);
//            System.out.println("tmpB.length" + tmpB.length);
            all += tmpB.length;

        }
        return sb.toString();
    }
}

