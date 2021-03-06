package com.imooc.netty.mahjong.common.msg;

import com.imooc.netty.mahjong.common.protocol.MahjongMessage;
import lombok.Data;

@Data
public class CreateRoomResponse implements MahjongMessage {
    private boolean result;
    private String message;
}
