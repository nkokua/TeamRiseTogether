package com.metaverse.risetogether.z_activity.mission1.util;

import com.metaverse.risetogether.z_activity.mission1.model.Book;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LogManager {

    // logTransaction(String record, String filePath)` 메서드 구현
    private static  List<Book> books;

    public static void logTransaction(String record, String filePath){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

            if (books == null){
                books = new ArrayList<>();
            }

            // record를 파일에 기록
            bw.write(record);
            bw.newLine();

            // books 리스트의 내용도 파일에 기록
            for(Book book : books){
                bw.write(book.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("로그 기록 저장 중 오류 발생 : " + e.getMessage());
        }
    }
}
