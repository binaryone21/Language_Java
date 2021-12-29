package seunghee.study.혼자_공부하는_자바._13_컬렉션_프레임워크._02_LIFO와_FIFO컬렉션;

import java.util.LinkedList;
import java.util.Queue;

public class _02_QueueExample {
	public static void main(String[] args) {
		Queue<_02_Message> messageQueue = new LinkedList<_02_Message>();
		
		messageQueue.offer(new _02_Message("sendMail", "홍길동"));
		messageQueue.offer(new _02_Message("sendSMS", "홍길동"));
		messageQueue.offer(new _02_Message("sendKakaotalk", "홍길동"));
		
		while(!messageQueue.isEmpty()) {
			_02_Message message = messageQueue.poll();
			switch(message.command) {
				case "sendMail" 		: System.out.println(message.to + "님에게 메일을 보냅니다."); break; 
				case "sendSMS" 			: System.out.println(message.to + "님에게 SMS을 보냅니다."); break; 
				case "sendKakaotalk" 	: System.out.println(message.to + "님에게 카카오톡을 보냅니다."); break; 
			}
		}
	}
}
