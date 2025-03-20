package com.metaverse.risetogether.z_activity.mission1;

import com.metaverse.risetogether.z_activity.mission1.util.LogManager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("고객님 대출 또는 반납 인지 작성해 주세요.");
        String message = scanner.nextLine().trim();

        String record = "";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("transaction.log", true))) {
            // 사용자 입력 기록
            writer.write("사용자 입력 : " + message);
            writer.newLine();

            // 대출/반납 구분
            if (message.equalsIgnoreCase("대출")) {
                System.out.print("책 제목을 입력해 주세요: ");
                String bookTitle = scanner.nextLine();
                System.out.print("책 저자를 입력해 주세요: ");
                String author = scanner.nextLine();
                System.out.print("책 고유의 ISBN 을 입력해 주세요: ");
                String isbn = scanner.nextLine();
                System.out.print("대출 하려는 고객님의 아이디 또는 이름을 작성해 주세요: ");
                String customerInfo = scanner.nextLine();

                // 대출 정보 기록
                record = "대출 정보: \n" +
                        "===============================================================\n" +
                        "책 제목 및 저자: " + bookTitle + "\n" +
                        "저자: " + author + "\n" +
                        "ISBN 정보 : " + isbn + "\n" +
                        "대출 시간: " + java.time.LocalDate.now() + "\n" +
                        "고객 아이디: " + customerInfo + "\n" +
                        "===============================================================\n";
            } else if (message.equalsIgnoreCase("반납")) {
                System.out.print("책 제목을 입력해 주세요: ");
                String bookTitle = scanner.nextLine();
                System.out.print("책 저자를 입력해 주세요: ");
                String author = scanner.nextLine();
                System.out.print("책 고유의 ISBN 을 입력해 주세요: ");
                String isbn = scanner.nextLine();
                System.out.print("반납 하려는 고객님의 아이디 또는 이름을 작성해 주세요: ");
                String customerInfo = scanner.nextLine();

                // 반납 정보 기록
                record = "반납 정보: \n" +
                        "===============================================================\n" +
                        "책 제목 및 저자: " + bookTitle + "\n" +
                        "저자: " + author + "\n" +
                        "ISBN 정보 : " + isbn + "\n" +
                        "반납 시간: " + java.time.LocalDate.now() + "\n" +
                        "고객 아이디: " + customerInfo + "\n" +
                        "===============================================================\n";
            }

            // 로그 파일에 기록
            LogManager.logTransaction(record, "transaction.log");

            // 로그 출력
            System.out.println(message + " 정보가 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("log 파일 저장 실패 : " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
