package com.github.mouse0w0.wow.network;

@FunctionalInterface
public interface PacketHandler<T extends Packet> {

    void hander(Connection sender, T packet);
}
