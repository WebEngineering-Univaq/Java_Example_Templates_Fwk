/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.univaq.f4i.iw.examples;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Giuseppe Della Penna
 */
public class Utilities {
    public static List getHeaderList(HttpServletRequest request) {
        List<Pair> headers = new ArrayList();
        Enumeration<String> names = request.getHeaderNames();
        while (names.hasMoreElements()) {
            String name = names.nextElement();
            headers.add(new Pair<>(name, (String) request.getHeader(name)));
        }
        return headers;
    }
}
