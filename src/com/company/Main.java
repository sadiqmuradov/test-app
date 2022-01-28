package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static void copyFile() {
        InputStream initialStream = null; //src/main/resources/sample.txt
        try {
            initialStream = new FileInputStream("src/com/company/Main.java");
            File targetFile = new File("Main-copy.java"); //src/main/resources/targetFile.tmp
            Path targetPath = targetFile.toPath();

            Files.copy(
                initialStream,
                targetPath,
                StandardCopyOption.REPLACE_EXISTING);
            initialStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static boolean isPrime(int num) {
        boolean res = false;
        if (num >= 2) {
            if (num == 2 || num == 3) {
                res = true;
            } else if (num % 2 != 0) {
                int i = 2;
                for (; i < num / 2; i++) {
                    if (num % i == 0) {
                        break;
                    }
                }
                if (i == num / 2) {
                    res = true;
                }
            }
        }
        return res;
    }

    static List<Integer> getPrimeNumbers(int num) {
        List<Integer> res = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                res.add(i);
            }
        }
        return res;
    }


    public static void main(String[] args) {
	    // write your code here

        System.out.println(getPrimeNumbers(31));

//        copyFile();

        /*String a = "qwe rtyyu    asdfg      hjklmnb                            ";
        String pn = a.replaceAll("\\s+","");
        System.out.println(a);
        System.out.println(pn);

        a = "{\"status\":\"ok\",\"message\":\"processed successfully\",\"status\":\"ok\",\"ok\",\"message\":\"processed successfully\"}";
        pn = "\"ok\"";
        System.out.println(a.indexOf(pn));
        System.out.println(a.substring(0, a.indexOf(pn)) + a.substring(a.indexOf(pn) + pn.length()));
        System.out.println(a.indexOf(',', a.indexOf(pn)));

        String body = a, TOKEN_PATTERN = pn;
        if (body.contains(TOKEN_PATTERN)) {
            int firstPatternIdx = body.indexOf(TOKEN_PATTERN);
            int firstCommaIdx = body.indexOf(',', firstPatternIdx) + 1;
            int lastPatternIdx = body.lastIndexOf(TOKEN_PATTERN);
            int lastCommaIdx = body.indexOf(',', lastPatternIdx) + 1;

            body = body.substring(0,
                                  firstPatternIdx) +
                   body.substring(firstCommaIdx,
                                  lastPatternIdx) +
                   body.substring(lastCommaIdx);
        }
        System.out.println(body);*/

        /*LocalDateTime ldt = LocalDateTime.parse("",
                                                 DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        ZoneOffset offset = ZoneId.systemDefault().getRules().getOffset(ldt);
//        OffsetDateTime odt = LocalDateTime.parse("31/05/2021 16:38:13",
//                                                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))
//                                         .atOffset(ZoneOffset.UTC);
        OffsetDateTime odt = OffsetDateTime.of(ldt, offset);
        System.out.println(odt.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:st")));*/

//        String r = null;
//        System.out.println(Integer.parseInt(r));

//        Integer result = null; // -2147483648 to 2147483647
//        int x = 2147483647;
//        try {
//            result = Integer.parseInt("2147483648");
//        } catch (NumberFormatException e) {
//            e.printStackTrace();
//        }
//        System.out.println(result);
//        System.out.println(x);

//        System.out.println(check(21,21));
    }

    private static int check(int a, int b) {
        return a>21 && b>21 ? 0 : a>21 ? b : b>21 ? a : a>b ? a : b;
    }
}
