package skioServer;

/**   
* @author lzw   
* @date 2016��11��3�� ����10:02:39 
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
		// JSONת���࣬���ǿ����Լ���ѡ�Լ�ϲ���ģ������Ƽ�net.sf.json��alibaba��
//		JSONObject jobj = JSONObject.fromObject(data);
//		System.out.println(jobj.getString("phoneNumber"));
//		System.out.println(jobj.getString("token"));
		client.sendEvent("message2", "success");
//		server.s
	}

}
