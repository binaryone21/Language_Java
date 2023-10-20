package seunghee.coding.programmers.level_0.ex031_ex040;

/*
 * 머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
 * 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
 * 문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을
 * return 하도록 solution 함수를 완성해보세요.
 * 모스부호는 다음과 같습니다.
 * morse = {
    .-:a,-...:b,-.-.:c,-..:d,.:e,..-.:f,
    --.:g,....:h,..:i,.---:j,-.-:k,.-..:l,
    --:m,-.:n,---:o,.--.:p,--.-:q,.-.:r,
    ...:s,-:t,..-:u,...-:v,.--:w,-..-:x,
    -.--:y,--..:z
}
 */
public class ex_036_모스부호_1 {
	// 입력
	public static void main(String[] args) {
		print(solution(".... . .-.. .-.. ---"));		// hello
		print(solution(".--. -.-- - .... --- -."));	// python
	}


	// 연산
	public static String solution(String letter) {
		StringBuilder sb = new StringBuilder();
		for(String let : letter.split(" ")) {
			switch(let) {
				case ".-" 		: sb.append("a"); break;
				case "-..." 	: sb.append("b"); break;
				case "-.-." 	: sb.append("c"); break;
				case "-.."		: sb.append("d"); break;
				case "."		: sb.append("e"); break;
				case "..-."		: sb.append("f"); break;
				case "--."		: sb.append("g"); break;
				case "...."		: sb.append("h"); break;
				case ".."		: sb.append("i"); break;
				case ".---"		: sb.append("j"); break;
				case "-.-"		: sb.append("k"); break;
				case ".-.."		: sb.append("l"); break;
				case "--"		: sb.append("m"); break;
				case "-."		: sb.append("n"); break;
				case "---"		: sb.append("o"); break;
				case ".--."		: sb.append("p"); break;
				case "--.-"		: sb.append("q"); break;
				case ".-."		: sb.append("r"); break;
				case "..."		: sb.append("s"); break;
				case "-"		: sb.append("t"); break;
				case "..-"		: sb.append("u"); break;
				case "...-"		: sb.append("v"); break;
				case ".--"		: sb.append("w"); break;
				case "-..-"		: sb.append("x"); break;
				case "-.--"		: sb.append("y"); break;
				case "--.."		: sb.append("z"); break;
			}
		}
		return sb.toString();
	}

	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
