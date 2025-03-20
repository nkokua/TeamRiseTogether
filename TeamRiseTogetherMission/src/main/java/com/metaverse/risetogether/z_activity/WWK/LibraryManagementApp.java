package libraryfilestorage;

import libraryfilestorage.FileStorageManager;
import libraryfilestorage.LibraryMember;

import java.util.*;

public class LibraryManagementApp {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("신유나 예쁘다","우원경",102345.00),
                new Book("내가 제일 예뻐","신유나",105678.00),
                new Book("야 우원경 나는 안예뻐?","이채영",104763.00)
        );

        List<LibraryMember> members = Arrays.asList(
                new LibraryMember("우원경", "X001"),
                new LibraryMember("신유나", "X002"),
                new LibraryMember("이채영", "X003")
        );

        FileStorageManager storageManager = new FileStorageManager();
        storageManager.saveBooksToFile(books, "books.txt");
        storageManager.saveMembersToFile(members, "members.txt");
    }
}