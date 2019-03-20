package view;

import domain.Lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    public static int getLottoCountFromInputMoney() {
        System.out.println("���Աݾ��� �Է��� �ּ���.");
        Scanner scanner = new Scanner(System.in);

        int lottoCount = scanner.nextInt() / 1000;

        System.out.println(lottoCount + "���� �����߽��ϴ�");
        return lottoCount;
    }


    public static Lotto getWinnerNoByString() {
        Lotto winner;
        List<Integer> speicifedNumbers = new ArrayList<>();
        System.out.println("���� �� ��÷ ��ȣ�� �Է��� �ּ���.(,�� ���� ����)");
        Scanner scanner = new Scanner(System.in);
        String[] inputs = splitStringToWinner(scanner.nextLine());

        for(String input:inputs) {
            speicifedNumbers.add(Integer.parseInt(input));
        }

        winner = new Lotto(speicifedNumbers);
        return winner;
    }

    private static String[] splitStringToWinner(String input) {
        return input.split(",");
    }

}
