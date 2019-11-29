package vo1.chapter16;

import java.util.EventListener;

public class MagicButton {

    public MagicButton() {}

    private MagicButtonListener listener;

    public void setListener(MagicButtonListener listener) {
        this.listener = listener;
    }

    public void onClickProcess() {
        if (listener != null) {
            listener.onClick();
        }
    }
}
