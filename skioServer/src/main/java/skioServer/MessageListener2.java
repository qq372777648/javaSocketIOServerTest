package skioServer;

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

public class MessageListener2 implements DataListener<String> {

	SocketIOServer server;

	public void setServer(SocketIOServer server) {
		this.server = server;
	}

	public void onData(SocketIOClient client, String data, AckRequest ackSender) throws Exception {
		System.out.println("this is msg2 service");
		System.out.println(data);
		// JSON转换类，你们可以自己挑选自己喜欢的，这里推荐net.sf.json和alibaba的
//		JSONObject jobj = JSONObject.fromObject(data);
//		System.out.println(jobj.getString("phoneNumber"));
//		System.out.println(jobj.getString("token"));
		client.sendEvent("message2", "success");
//		server.s
	}

}
