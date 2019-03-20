package view;

import domain.LottoGame;
import domain.LottoResult;

import java.util.List;

public class ResultView {

    public static void printProfitStatics(List<LottoResult> result){
        System.out.println("��÷ ���\n-----------");
        for(LottoResult lottoResult : result) {
            if(lottoResult.getNumberOfMatch() >- 3) {
            System.out.println(lottoResult.getNumberOfMatch() + "�� ��ġ (" + lottoResult.getProfitMoney()
                                + ")�� - " + lottoResult.getCount() + "��");
        }
        }
    }

    public static void printProfitRate(List<LottoResult> results, int inputMoney){
        System.out.println("�� ���ͷ��� " + calculateProfitRate(results, inputMoney) + "�Դϴ�.");
    }

    private static float calculateProfitRate(List<LottoResult> results, int inputMoney){
        int totalProfitMoney = 0;
        for(LottoResult result : results){
            totalProfitMoney += result.getProfitMoney();
        }
        return (float) (totalProfitMoney / inputMoney);
    }
}
