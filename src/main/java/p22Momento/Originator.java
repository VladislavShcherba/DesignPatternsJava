package p22Momento;

public class Originator {
    private int state;

    public Originator() {
        state = (int)(Math.random()*1e6);
    }

    public void changeState() {
        state = (int)(Math.random()*1e6);
    }

    @Override
    public String toString() {
        return "Originator{ " + state + " }";
    }

    public Momento snapshot() {
        return new Momento(state);
    }

    public class Momento{
        private int state;

        public Momento(int state) {
            this.state = state;
        }

        public void restore() {
            Originator.this.state = state;
        }
    }
}
