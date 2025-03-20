package com.ohgiraffers.z_activity.mission.LHS.model;

public class LogTransaction {
    private String BookLoan;
    private String BookReturn;

    public LogTransaction(String bookLoan, String bookReturn) {
        BookLoan = bookLoan;
        BookReturn = bookReturn;
    }

    public String getBookLoan() {
        return BookLoan;
    }

    public void setBookLoan(String bookLoan) {
        BookLoan = bookLoan;
    }

    public String getBookReturn() {
        return BookReturn;
    }

    public void setBookReturn(String bookReturn) {
        BookReturn = bookReturn;
    }

    @Override
    public String toString() {
        return "LogTransaction{" +
                "BookLoan='" + BookLoan + '\'' +
                ", BookReturn='" + BookReturn + '\'' +
                '}';
    }
}
