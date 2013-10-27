package Ninja.Spoucy.API;

import cpw.mods.fml.common.network.Player;
import ljdp.easypacket.EasyPacket;
import ljdp.easypacket.EasyPacketData;

public class Packet extends EasyPacket {
	
	@EasyPacketData
	public String name;
	
	@EasyPacketData
	public int age;
	
	@EasyPacketData
	public boolean isPacket; //A poor but better than nothing way of preventing packet spoofing
	
	@EasyPacketData
	public long someLong;
	
	public Packet(String name, int age, boolean isMale) {
		this.name = name;
		this.age  = age;
		this.isPacket = isPacket;
		this.someLong = 1827366;
	}

	public Packet() {
	}

	@Override
	public boolean isChunkDataPacket() {
		return false;
	}

	@Override
	public void onReceive(Player player) {
	}
}
