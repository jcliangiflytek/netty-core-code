package com.imooc.netty.core.$26.common.domain;

import com.alibaba.fastjson.JSON;
import lombok.Data;

@Data
public class Table implements Cloneable{
    public static final int STATUS_WAITING = 1;
    public static final int STATUS_PLAYING = 2;
    public static final int SUBSTATUS_WAITING_CHU = 1;
    public static final int SUBSTATUS_WAITING_OPERATE = 1;


    /**
     * 桌子id
     */
    private long id;
    /**
     * 底注
     */
    private int baseScore;
    /**
     * 玩家最大数量
     */
    private int maxPlayerNum;
    /**
     * 玩家列表
     */
    private Player[] players;
    /**
     * 庄家的位置
     */
    private int zhuangPos = -1;
    /**
     * 出牌玩家的位置
     */
    private int chuPos;
    /**
     * 序列号，用于防止过时的消息
     */
    private int sequence;
    /**
     * 状态，1等待中，2游戏中
     */
    private int status;
    /**
     * 子状态，1等待玩家出牌，2等待玩家操作（碰杠胡）
     */
    private int subStatus;

    public int validPlayerNum() {
        int num = 0;
        for (Player player : players) {
            if (player != null) {
                num++;
            }
        }
        return num;
    }

    public void incrementZhuangPos() {
        zhuangPos = (++zhuangPos) % players.length;
    }

    public void incrementSequence() {
        sequence++;
    }

    public Player chuPlayer() {
        return players[chuPos];
    }

    public void moveToNext() {
        chuPos = (++chuPos) % players.length;
    }
}