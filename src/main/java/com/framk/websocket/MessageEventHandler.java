package com.framk.websocket;

import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.annotation.OnConnect;
import com.corundumstudio.socketio.annotation.OnDisconnect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Daifa on 2017/12/1.
 */
@Component
public class MessageEventHandler {

    private final SocketIOServer server;

    @Autowired
    public MessageEventHandler(SocketIOServer server)
    {
        this.server = server;
    }

    @OnConnect
    public void onConnect(SocketIOClient client){

    }

    @OnDisconnect
    public void onDisconnect(SocketIOClient client){

    }
}
