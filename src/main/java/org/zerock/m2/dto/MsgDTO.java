package org.zerock.m2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data//getter setter tostring hashcode 등... import한다.
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MsgDTO {

    private Long mno;
    private String who,whom,content;
    private Timestamp regdate,opendate;
}
