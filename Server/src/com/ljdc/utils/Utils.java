package com.ljdc.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA
 * User:邹旭
 * Date:2017/2/23 0023
 * Time:上午 2:22
 * Desc:略
 */
public class Utils {

    /**向浏览器返回字符串数据
     * @param response
     * @param stream
     */
    public static void printToBrowser(HttpServletResponse response, String stream) {
        response.setCharacterEncoding("utf-8");
        PrintWriter pw=null;
        try {
            pw = response.getWriter();
            pw.write(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        pw.flush();
        pw.close();
    }
}