package com.msa.MemberMS.domain.model.event;


import com.msa.MemberMS.domain.model.vo.IDName;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class ItemRented implements Serializable {
    private IDName idName;
    private Item item;
    private long point;
}
