package com.its.board.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {
    private int commentId;
            private String commentWriter;
    private String commentContents;
            private Date commentCreatedTime;
    private int commentRecommend;
}
