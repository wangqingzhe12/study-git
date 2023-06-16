package work8;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Naming {
    public static void main(String[] args) {
        List<String> stulist = new ArrayList<String>();
        try {
            FileReader fr = new FileReader("C:/name.txt");
            BufferedReader bf = new BufferedReader(fr);
            String str = null;
            while ((str = bf.readLine()) != null) {
                stulist.add(str);
            }
            bf.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("读取txt文档内容时，发生异常！");
            e.printStackTrace();
        }
//        for (int i = 0; i < stulist.size(); i++) {
//            String stu = stulist.get(i);
//            String[] strarr = stu.split("&");
//            System.out.println((i+1)+" 学号：" + strarr[0] + " 姓名：" + strarr[1]);
//        }
        System.out.println();
        Random random = new Random();
        int number = random.nextInt(stulist.size()) % (stulist.size() - 0 + 1) + 0;
        String stu = stulist.get(number);
        String[] strarr = stu.split("&");
        System.out.println(" 姓名：" + strarr[1]);


    }
}