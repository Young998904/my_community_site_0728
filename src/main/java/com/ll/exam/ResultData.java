package com.ll.exam;

import com.ll.exam.article.dto.ArticleDto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class ResultData <T> {
    private final String resultCode;
    private String msg;
    private T data;
}
