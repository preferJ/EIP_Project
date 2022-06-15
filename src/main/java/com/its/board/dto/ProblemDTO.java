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
    private int problemAns;
    private String problemCommentary;
    private int problemRecommed;

    public ProblemDTO(String problemYear , String problemSubject, int problemQNumber, String problemQ, String problemA1, String problemA2, String problemA3, String problemA4,int problemAns, String problemCommentary) { // 생성자 오버로딩
        this.problemYear = problemYear;
        this.problemSubject = problemSubject;
        this.problemQNumber = problemQNumber;
        this.problemQ = problemQ;
        this.problemA1 = problemA1;
        this.problemA2 = problemA2;
        this.problemA3 = problemA3;
        this.problemA4 = problemA4;
        this.problemAns = problemAns;
        this.problemCommentary = problemCommentary;
    }


}
