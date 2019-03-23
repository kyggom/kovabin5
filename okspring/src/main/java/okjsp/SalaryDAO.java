package okjsp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SalaryDAO {

    static List<Salary> paylist = new ArrayList<Salary>();
    static List<String> list = new ArrayList<String>();
    static Salary sal = new Salary();
    private static BufferedReader bfr;

    /* 지급과목 */
    public static void paysave(Salary sal) throws IOException {
        FileInputStream payfile = new FileInputStream(
//                new File("c:/kova/salary/" + sal.getYear() + sal.getMonth() + "_1", sal.getGnum()));
                new File("c:/kova/salary/201903_1"));
        bfr = new BufferedReader(new InputStreamReader(payfile, "euc-kr"));
        String linepay;
        
        while ((linepay = bfr.readLine()) != null) {
            String[] payVers = linepay.split("\t");
            if (!(payVers[2].equals("0600001"))) {
                return;
            } else {
                for (int i = 4; i+1 < payVers.length; i++) {
                    list.add(payVers[4]);
                    list.add(payVers[5]);
                    System.out.println(list.toString());
                }
            }
        }
        
        bfr.close();
    }
    
    public static void main(String[] args) throws IOException {
        SalaryDAO.paysave(sal);
    }

    /* 공제과목 */
    public static void deduction(Salary sal) {

    }

    /*
     * public static void save(Salary sal) { list.add(sal); }
     * 
     * public static int size() { return list.size(); }
     */

}
