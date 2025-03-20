package com.ohgiraffers.z_activity.mission.LHS;

import com.ohgiraffers.z_activity.mission.LHS.model.Book;
import com.ohgiraffers.z_activity.mission.LHS.model.LogTransaction;
import com.ohgiraffers.z_activity.mission.LHS.until.FileStorageManager;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // 도서 정보를 담은 Book 객체 리스트
        List<Book> books = List.of(
                new Book("Effectivejava","이한솔"),
                new Book("Java","한솔")
        );
        List<LogTransaction> logTransactions = List.of(
                new LogTransaction("대출","아직 반납하지 않았습니다."),
                new LogTransaction("대출일시 ~~~ ","반납이 완료되었습니다.")
        );

        FileStorageManager.saveBookLone(books,"book2.txt");
        FileStorageManager.saveBookReturn(logTransactions,"transaction.log");
    }
}


