package app;

import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        String path = "/home/claude/WebSite/PlayStation World/WEB-INF/lib";
        File file = new File(path);
        File[] files = file.listFiles();
        for (File f : files) {
            String str = String.format("<classpathentry kind=\"lib\" path=\"WEB-INF/lib/%s\"/>", f.getName());
            System.out.println(str);
        }
    }
}