package com.example.study.model;

public class SearchParam {

    private String account;
    private String email;
    private int page;

    // JSON 형태로 변환
    // {"account" : "", "email" : "", "page" : 0}

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPage() {
        return this.page;
    }

    public void setPage(int page) {
        this.page = page;
    }

}
