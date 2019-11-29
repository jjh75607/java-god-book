package vo1.mission.chapter16;

public class MyPage {

    InputBox input;

    public static void main(String[] args) {
        MyPage page = new MyPage();
        page.setUI();

        page.pressKey(InputBox.KEY_DOWN);
        page.pressKey(InputBox.KEY_UP);
    }

    public void setUI() {
        input = new InputBox();

        KeyEventListener listener = new KeyEventListener() {
            @Override
            public void onKeyDown() {
                System.out.println("Key Down");
            }

            @Override
            public void onKeyUp() {
                System.out.println("key Up");
            }
        };

        input.setListener(listener);
    }

    public void pressKey(int value) {
        input.listenerCalled(value);
    }
}
