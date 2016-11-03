package skioServer;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

/**   
* @author lzw   
* @date 2016年11月3日 上午10:02:39 
* @Description: 
* @version V1.0   
*/
import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.listener.DataListener;

public class MessageListener4 implements DataListener<String> {

	SocketIOServer server;

	public void setServer(SocketIOServer server) {
		this.server = server;
	}

	public void onData(SocketIOClient client, String data, AckRequest ackSender) throws Exception {
		System.out.println("this is msg4 service");
		System.out.println(data);
		
		String msg[]=data.split("###");
		UUID 	uid=UUID.fromString(msg[0]);
		server.getClient(uid).sendEvent("message3", msg[1]);
	}

}
