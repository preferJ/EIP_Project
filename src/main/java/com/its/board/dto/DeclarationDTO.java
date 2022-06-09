package com.its.board.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeclarationDTO {
    private int declarationId;
    private int boardDecId;
    private int commentDecId;
    private int memberDecId;
    private String decReason;
    private Date decTime;
}
