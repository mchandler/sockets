package com.zonkware.sockets.endpoint;

import java.io.IOException;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/saymyname")
public class TestEndPoint {
	
	@OnOpen
	public void onOpen(Session session) throws IOException {
		session.getBasicRemote().sendText("I can hear you now!");
	}
	
	@OnMessage
	public String onMessage(String name) {
		return "Your name is " + name;
	}
	
}
