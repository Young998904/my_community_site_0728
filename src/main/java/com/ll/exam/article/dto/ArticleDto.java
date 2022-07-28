package com.ll.exam.article.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor

public class ArticleDto {
    private long id;
    private String title;
    private String body;
}
