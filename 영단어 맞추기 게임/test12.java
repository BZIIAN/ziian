public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args) {
        String arr[] = {"adapation", "fund", "easy", "computer", "apple"};
        int cnt = 0;	//문제 출제 순서
        char ch; 		//숨긴 문자를 저장할 변수
        String word, query, yn;
        int random = (int)(Math.random()*4);
        int wrong =1;	//반복 횟수 세는 변수
        Scanner scan;

        while(true) {
            System.out.println("지금부터 게임을 시작합니다.");
            word = arr[cnt];	//단어 저장
            ch = arr[cnt].charAt(random);	//숨길 문자 랜덤으로 뽑아냄
            String key = ""+ch;		//숨길 문자를 st타입으로 변환
            query = word.replace(key, "-");		//숨길 문자를 "-"로 바꾼다

            for(int i=0;i<5;i++) {	//5번 반복
                System.out.println(query);
                System.out.print(">>");
                scan = new Scanner(System.in);
                String str = scan.next();

                if(str.equalsIgnoreCase(key)) {
                    break;
                }
                else{
                    if(wrong==5) {
                        System.out.println("5번 실패 하였습니다.");
                    }
                    else {
                        wrong++;
                        continue;
                    }
                }
            }

            System.out.println(word);
            System.out.println("Next(y/n)?");
            scan = new Scanner(System.in);
            yn = scan.next();
            if(yn.equalsIgnoreCase("Y")) {
                wrong=1;
                cnt++;
                continue;
            }
            else {
                break;
            }
        }
    }

}





switch(wrongNum){
	case 0:
		dakldjalksd
		break;



















word = banana
char ch = n
String secret = ""+n
String query = ba_a_a
