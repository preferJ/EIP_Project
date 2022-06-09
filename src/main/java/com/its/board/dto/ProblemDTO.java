package com.its.board.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProblemDTO {
    private int problemId;
    private String problemYear;
    private String problemSubject;
    private int problemQNumber;
    private String problemQ;
    private String problemA1;
    private String problemA2;
    private String problemA3;
    private String problemA4;
    private String problemAns;
    private String problemCommentary;
    private int problemRecommed;
}
