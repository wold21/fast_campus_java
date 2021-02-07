package com.example.study.model;

import lombok.*;

@Data
public class SearchParam {
    private @NonNull String account;
    private @NonNull String email;
    private @NonNull int page;
}
