// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Mahjong.proto

package com.imooc.netty.mahjong.common.proto;

public interface RoomRefreshNotificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RoomRefreshNotification)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 operation = 1;</code>
   */
  int getOperation();

  /**
   * <code>optional .RoomMsg room = 2;</code>
   */
  boolean hasRoom();
  /**
   * <code>optional .RoomMsg room = 2;</code>
   */
  com.imooc.netty.mahjong.common.proto.RoomMsg getRoom();
  /**
   * <code>optional .RoomMsg room = 2;</code>
   */
  com.imooc.netty.mahjong.common.proto.RoomMsgOrBuilder getRoomOrBuilder();
}
