// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Mahjong.proto

package com.imooc.netty.mahjong.common.proto;

public interface RoomMsgOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RoomMsg)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   **
   * 房间id
   * </pre>
   *
   * <code>optional int64 id = 1;</code>
   */
  long getId();

  /**
   * <pre>
   **
   * 房间最大的人数
   * </pre>
   *
   * <code>optional int32 maxPlayerNum = 2;</code>
   */
  int getMaxPlayerNum();

  /**
   * <pre>
   **
   * 底分
   * </pre>
   *
   * <code>optional int32 baseScore = 3;</code>
   */
  int getBaseScore();

  /**
   * <pre>
   **
   * 房间内的玩家列表
   * </pre>
   *
   * <code>repeated .PlayerMsg players = 4;</code>
   */
  java.util.List<com.imooc.netty.mahjong.common.proto.PlayerMsg> 
      getPlayersList();
  /**
   * <pre>
   **
   * 房间内的玩家列表
   * </pre>
   *
   * <code>repeated .PlayerMsg players = 4;</code>
   */
  com.imooc.netty.mahjong.common.proto.PlayerMsg getPlayers(int index);
  /**
   * <pre>
   **
   * 房间内的玩家列表
   * </pre>
   *
   * <code>repeated .PlayerMsg players = 4;</code>
   */
  int getPlayersCount();
  /**
   * <pre>
   **
   * 房间内的玩家列表
   * </pre>
   *
   * <code>repeated .PlayerMsg players = 4;</code>
   */
  java.util.List<? extends com.imooc.netty.mahjong.common.proto.PlayerMsgOrBuilder> 
      getPlayersOrBuilderList();
  /**
   * <pre>
   **
   * 房间内的玩家列表
   * </pre>
   *
   * <code>repeated .PlayerMsg players = 4;</code>
   */
  com.imooc.netty.mahjong.common.proto.PlayerMsgOrBuilder getPlayersOrBuilder(
      int index);

  /**
   * <pre>
   **
   * 未摸的牌
   * </pre>
   *
   * <code>optional bytes remainCards = 5;</code>
   */
  com.google.protobuf.ByteString getRemainCards();

  /**
   * <pre>
   **
   * 出牌玩家的位置
   * </pre>
   *
   * <code>optional int32 chuPos = 6;</code>
   */
  int getChuPos();

  /**
   * <pre>
   **
   * 状态
   * </pre>
   *
   * <code>optional .RoomStatus status = 7;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   **
   * 状态
   * </pre>
   *
   * <code>optional .RoomStatus status = 7;</code>
   */
  com.imooc.netty.mahjong.common.proto.RoomStatus getStatus();
}
