package p22Memento;

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

    public Memento snapshot() {
        return new Memento(state);
    }

    public class Memento {
        private int state;

        private Memento(int state) {
            this.state = state;
        }

        public void restore() {
            Originator.this.state = state;
        }
    }
}
