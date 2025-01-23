package Assignment32;

public class Task6 {
    public static void main(String[] args) throws Exception {
    }
    interface Selectable {
        void onSelect();
    }
    interface Updatable {
        void refresh();
    }
    //напишите тут ваш код
    public class Screen implements Selectable, Updatable {
        @Override
        public void onSelect() {}

        @Override
        public void refresh() {}
    }
}
