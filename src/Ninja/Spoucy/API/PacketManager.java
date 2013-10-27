package Ninja.Spoucy.API;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

import ljdp.easypacket.EasyPacketDispatcher;
import ljdp.easypacket.EasyPacketHandler;

public class PacketManager {
		
		public PacketManager() {
			EasyPacketDispatcher dispatcher = new EasyPacketDispatcher("SpoucyChannel");
			Packet packet1 = new Packet("TextureTransfer", 21, true);
			EasyPacketHandler examplePacketHandler = EasyPacketHandler.registerEasyPacket(Packet.class, dispatcher);
			
			byte[] data = examplePacketHandler.write(packet1);
			DataInputStream in = new DataInputStream(new ByteArrayInputStream(data));
			
			Packet packet2 = new Packet();
			examplePacketHandler.read(packet2, in);
			
			assert packet1.age == packet2.age; //Time in seconds before timeout
			assert packet1.name.equals(packet2.name);
			assert packet1.isPacket == packet2.isPacket;
			assert packet1.someLong == packet2.someLong;
		}
	}
