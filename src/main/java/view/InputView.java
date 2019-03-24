package view;

import domain.Lotto;
import domain.LottoMoney;
import domain.WinningLotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    public static int getLottoCountFromInputMoney() {
        System.out.println("���Աݾ��� �Է��� �ּ���.");
        Scanner scanner = new Scanner(System.in);

        LottoMoney money = new LottoMoney(scanner.nextInt());

        System.out.println(money.getNumberOfLotto() + "���� �����߽��ϴ�");
        return money.getNumberOfLotto();
    }


    public static WinningLotto getWinnerNoByString() {
        WinningLotto winner;
        List<Integer> speicifedNumbers = new ArrayList<>();
        System.out.println("���� �� ��÷ ��ȣ�� �Է��� �ּ���.(,�� ���� ����)");
        Scanner scanner = new Scanner(System.in);
        String[] inputs = splitStringToWinner(scanner.nextLine());

        for(String input : inputs) {
            speicifedNumbers.add(Integer.parseInt(input));
        }

        winner = new WinningLotto(speicifedNumbers);
        return winner;
    }

    private static String[] splitStringToWinner(String input) {
        return input.split(",");
    }


}
