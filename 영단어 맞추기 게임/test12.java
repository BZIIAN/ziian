public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args) {
        String arr[] = {"adapation", "fund", "easy", "computer", "apple"};
        int cnt = 0;	//���� ���� ����
        char ch; 		//���� ���ڸ� ������ ����
        String word, query, yn;
        int random = (int)(Math.random()*4);
        int wrong =1;	//�ݺ� Ƚ�� ���� ����
        Scanner scan;

        while(true) {
            System.out.println("���ݺ��� ������ �����մϴ�.");
            word = arr[cnt];	//�ܾ� ����
            ch = arr[cnt].charAt(random);	//���� ���� �������� �̾Ƴ�
            String key = ""+ch;		//���� ���ڸ� stŸ������ ��ȯ
            query = word.replace(key, "-");		//���� ���ڸ� "-"�� �ٲ۴�

            for(int i=0;i<5;i++) {	//5�� �ݺ�
                System.out.println(query);
                System.out.print(">>");
                scan = new Scanner(System.in);
                String str = scan.next();

                if(str.equalsIgnoreCase(key)) {
                    break;
                }
                else{
                    if(wrong==5) {
                        System.out.println("5�� ���� �Ͽ����ϴ�.");
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
