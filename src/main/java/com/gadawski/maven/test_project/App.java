package com.gadawski.maven.test_project;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException, URISyntaxException {
        showFiles();
    }

    private static void showFiles() throws IOException, URISyntaxException {
        ClassLoader classLoader = App.class.getClassLoader();
        String userDir = System.getProperty("user.dir");
        System.out.println("prop: " + userDir);
        String property = System.getProperty("java.class.path");
        System.out.println("classpath: " + property);
        String url = userDir + "\\src\\main\\clojure\\pierwszy\\lukasz.clj";
        System.out.println(url);
//        Enumeration<URL> resource = classLoader.getResources(url);
        InputStream systemResource = classLoader.getResourceAsStream("pierwszy\\lukasz.clj");
        System.out.println(systemResource);
        InputStream systemResourceAsStream = ClassLoader.getSystemResourceAsStream("pierwszy\\lukasz.clj");
        System.out.println(systemResourceAsStream);
        InputStreamReader inputStreamReader = new InputStreamReader(systemResource); 
    }
}
