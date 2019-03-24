package view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ResultView {

    private final static Map<Integer, Integer> PROFIT_VALUE = new HashMap<>();
    static {
        PROFIT_VALUE.put(3, 5000);
        PROFIT_VALUE.put(4, 50000);
        PROFIT_VALUE.put(5, 1500000);
        PROFIT_VALUE.put(6, 2000000000);
    }

    public static void printWinningStatistics(Map<Integer, Integer> result){
        System.out.println("��÷ ���\n-----------");
        Iterator<Integer> keys = result.keySet().iterator();
        while (keys.hasNext()) {
            int key = keys.next();
            System.out.println(key + "�� ��ġ (" + PROFIT_VALUE.get(key) +
                    ")�� - " + result.get(key) + "��");
        }
    }

    public static void printProfitRate(Map<Integer, Integer> result, int inputMoney){
        double totalProfit = 0.0;

        Iterator<Integer> keys = result.keySet().iterator();
        while (keys.hasNext()) {
            int key = keys.next();
            totalProfit += (double) PROFIT_VALUE.get(key) * result.get(key);
        }

        System.out.println("�� ���ͷ��� " + totalProfit / (double) inputMoney + "�Դϴ�.");
    }

}
