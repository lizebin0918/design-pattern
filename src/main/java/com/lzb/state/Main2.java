package com.lzb.state;


import static com.lzb.state.Main2.State.*;

/**
 * 查找表<br/>
 * Created on : 2021-05-08 09:22
 * @author chenpi 
 */
public class Main2 {

    public static void main(String[] args) {

    }

    enum Event {
        GO_MUSHROOM(0),
        GOT_CAPE(1),
        GOT_FIRE(2),
        MET_MONSTER(3);

        private int value;

        private Event(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    enum State {
        SMALL(0), SUPER(1), FIRE(2), CAPE(3);
        private int value;
        private State(int value) {
            this.value = value;
        }
    }

    private static class MarioStateMachine {
        private int score;
        private State state;

        private static final State[][] transitionTable = {
            {SUPER, CAPE, FIRE, SMALL},
            {SUPER, CAPE, FIRE, SMALL},
            {CAPE, CAPE, CAPE, SMALL},
            {FIRE, FIRE, FIRE, SMALL}
        };

        private static final int[][] actionTable = {
            {100, 200, 300, 0},
            {0, 200, 300, -100},
            {0, 0, 0, -200},
            {0, 0, 0, -300}
        };

        public MarioStateMachine() {
            this.score = 0;
            this.state = State.SMALL;
        }

        public void obtainMushRoom() {

        }

        public void obtainCape() {

        }

        public void obtainFireFlower() {

        }
    }

}
