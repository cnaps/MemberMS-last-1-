package com.msa.MemberMS.domain.model.event;

import com.msa.MemberMS.domain.model.vo.IDName;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PointUseCommand {
    private IDName idName;
    private long point;
}
