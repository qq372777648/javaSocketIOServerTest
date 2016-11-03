package skioServer;

import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.listener.ConnectListener;
import com.corundumstudio.socketio.listener.DisconnectListener;

/**
 * @author lzw
 * @date 2016��11��3�� ����10:01:34
 * @Description:
 * @version V1.0
 */
public class SocketIOServerTest {
	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.setPort(9090);

		SocketIOServer server = new SocketIOServer(config);

		server.addConnectListener(new ConnectListener() {
			public void onConnect(SocketIOClient client) {
				System.out.println("connect:�пͻ�������");
			}
		});
		
		server.addDisconnectListener(new DisconnectListener(){
			public void onDisconnect(SocketIOClient arg0) {
				System.out.println("disconnect:�пͻ��˶Ͽ�");
			}
		});
		
		//����
		MessageListener messageListener = new MessageListener();
		server.addEventListener("message", String.class, messageListener);

		//�㲥
		MessageListener2 messageListener2 = new MessageListener2();
		messageListener2.setServer(server);
		server.addEventListener("message2", String.class, messageListener2);
		
		
		//�ͻ��б�
		MessageListener3 messageListener3 = new MessageListener3();
		messageListener3.setServer(server);
		server.addEventListener("message3", String.class, messageListener3);
		
		//�Ի�
		MessageListener4 messageListener4 = new MessageListener4();
		messageListener4.setServer(server);
		server.addEventListener("message4", String.class, messageListener4);
		

		// ��������
		server.start();
		System.out.println("start");
		try {
			Thread.sleep(Integer.MAX_VALUE);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
