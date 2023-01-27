package seunghee._혼자_공부하는_자바._13_컬렉션_프레임워크._02_LIFO와_FIFO컬렉션.ex02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "홍길동"));
		messageQueue.offer(new Message("sendKakaotalk", "홍길동"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
				case "sendMail" 		: System.out.println(message.to + "님에게 메일을 보냅니다."); break; 
				case "sendSMS" 			: System.out.println(message.to + "님에게 SMS을 보냅니다."); break; 
				case "sendKakaotalk" 	: System.out.println(message.to + "님에게 카카오톡을 보냅니다."); break; 
			}
		}
	}
}
