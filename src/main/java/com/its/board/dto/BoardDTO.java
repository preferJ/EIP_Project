package com.its.board.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {
    private int boardId;
    private String boardTitle;
    private String boardWriter;
    private String boardContents;
    private int boardHits;
    private int boardRecommend;
    private Date boardCreatedTime;
}
