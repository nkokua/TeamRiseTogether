package com.ohgiraffers.z_activity.mission.LHS.until;

import com.ohgiraffers.z_activity.mission.LHS.model.Book;
import com.ohgiraffers.z_activity.mission.LHS.model.LogTransaction;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;



    //// Book 객체와 LogTransaction 객체의 정보를 파일(예: "book2.txt", "transaction.txt")에 저장한다
    /// title과 name를 담은 saveBookLone 객체 리스트
//
//    public class FileStorageManager {
//    public static void saveBookLone(String Loadrecord, String filePath){
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
//            writer.write(Loadrecord+"\n");
//        } catch (IOException e) {
//            System.err.println("대출 중 오류 발생: " + e.getMessage());
//            throw new RuntimeException(e);
//        }
//    }
//
//    //// Book 객체와 LogTransaction 객체의 정보를 파일(예: "book2.txt", "transaction.txt")에 저장한다
//    /// BookLone와 BookReturn를 담은 saveBookReturn 객체 리스트
//    public static void saveBookReturn(String returnrecord, String filePath ){
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
//            writer.write(returnrecord+"\n");
//        } catch (IOException e) {
//            System.err.println("반납 중 오류 발생: " + e.getMessage());
//            throw new RuntimeException(e);
//        }
//    }
//}

//
public class FileStorageManager {
    //// Book 객체와 LogTransaction 객체의 정보를 파일(예: "book2.txt", "transaction.txt")에 저장한다
    /// title과 name를 담은 saveBookLone 객체 리스트


    public static void saveBookLone(List<Book> books, String filePath){
        try (FileWriter writer = new FileWriter(filePath, true);) {
            for (Book book : books){
                writer.write(books+"\n");
            }
        } catch (IOException e) {
            System.out.println("대출을 실패했습니다.");
            throw new RuntimeException(e);
        }
    }
    //// Book 객체와 LogTransaction 객체의 정보를 파일(예: "book2.txt", "transaction.txt")에 저장한다
    /// BookLone와 BookReturn를 담은 saveBookReturn 객체 리스트
    public static void saveBookReturn(List<LogTransaction> logTransactions, String filePath ){
        try (FileWriter writer = new FileWriter(filePath, true);) {
            for (LogTransaction LogTransactions : logTransactions){
                writer.write(logTransactions+"\n");
            }
        } catch (IOException e) {
            System.out.println("반납을 실패했습니다.");
            throw new RuntimeException(e);
        }


    }



}
