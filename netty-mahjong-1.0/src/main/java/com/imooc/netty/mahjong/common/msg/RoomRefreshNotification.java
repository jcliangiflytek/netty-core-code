package com.imooc.netty.mahjong.common.msg;

import com.imooc.netty.mahjong.common.domain.Room;
import com.imooc.netty.mahjong.common.protocol.MahjongMessage;
import lombok.Data;

@Data
public class RoomRefreshNotification implements MahjongMessage {
    private int operation;
    private Room room;
}
