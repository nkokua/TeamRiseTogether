package libraryfilestorage;


import java.io.*;
import java.util.*;

public class FileStorageManager {
    public void saveBooksToFile(List<Book> books, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Book book : books) {
                writer.write(book.toString());
                writer.newLine();
            }
            System.out.println("도서정보가 " + filePath+"에 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("실패: " + e.getMessage());
        }
    }

    public void saveMembersToFile(List<LibraryMember> members, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (LibraryMember member : members) {
                writer.write(member.toString());
                writer.newLine();
            }
            System.out.println("멤버 정보가 " + filePath+"에 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("실패: " + e.getMessage());
        }
    }
}