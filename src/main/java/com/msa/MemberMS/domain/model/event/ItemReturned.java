package com.msa.MemberMS.domain.model.event;


import com.msa.MemberMS.domain.model.vo.IDName;
import lombok.Getter;


@Getter
public class ItemReturned extends ItemRented{

    public ItemReturned(IDName idName, Item item, long point) {
        super(idName, item, point);
    }
}
