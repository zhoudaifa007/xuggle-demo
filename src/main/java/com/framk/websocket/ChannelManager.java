package com.framk.websocket;

import com.corundumstudio.socketio.SocketIOClient;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Daifa on 2017/12/1.
 */
@Component
public class ChannelManager {

    private Map<String,SocketIOClient> sessionMap = new ConcurrentHashMap<>();

    public void add(SocketIOClient socketIOClient) {
       String sessionId =  socketIOClient.getSessionId().toString();
       sessionMap.put(sessionId,socketIOClient);
    }

    public void remove(SocketIOClient socketIOClient) {
        String sessionId =  socketIOClient.getSessionId().toString();
        sessionMap.remove(sessionId);
    }


}
