package skioServer;

/**   
* @author lzw   
* @date 2016年11月3日 上午10:02:31 
* @Description: 
* @version V1.0   
*/
import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.listener.DataListener;
import com.corundumstudio.socketio.protocol.Packet;
import com.corundumstudio.socketio.protocol.PacketType;

public class MessageListener implements DataListener<String> {

	public void onData(SocketIOClient client, String data, AckRequest ackSender) throws Exception {
		System.out.println("this is msg1 service");
		System.out.println(data);
//		Packet ptn=new Packet(PacketType.MESSAGE);
//		ptn.setData("sadf");
//		client.send(ptn);
		client.sendEvent("message", "success");//单用户
		
		
	}

}
