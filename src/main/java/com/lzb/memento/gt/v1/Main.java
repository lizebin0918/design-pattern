package com.lzb.memento.gt.v1;

import java.util.Scanner;

/**
 * 备忘录模式<br/>
 * Created on : 2021-10-13 12:41
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        InputText inputText = new InputText();
        SnapshotHolder snapshotHolder = new SnapshotHolder();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.next();
            if (":list".equals(input)) {
                System.out.println(inputText.toString());
            } else if (":undo".equals(input)) {
                inputText.setText(snapshotHolder.popSnapshot().getText());
            } else {
                snapshotHolder.pushSnapshot(inputText);
                inputText.append(input);
            }
        }
    }

}
