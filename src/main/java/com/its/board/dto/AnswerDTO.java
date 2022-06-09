package com.its.board.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnswerDTO {
    private int AnsId;
    private int AnsMemberId;
    private int AnsProblemId;
    private int AnsVal;
    private int AnsResult;
    private Date AnsTime;
}
