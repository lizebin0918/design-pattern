package com.lzb.state.gt;


import static com.lzb.state.gt.Main2.State.*;

/**
 * 查找表<br/>
 * Created on : 2021-05-08 09:22
 * @author chenpi 
 */
public class Main2 {

    public static void main(String[] args) {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        System.out.println("score:" + mario.score + ";state:" + mario.state);
    }

    enum Event {
        GOT_MUSHROOM(0),
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

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
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
            executeEvent(Event.GOT_MUSHROOM);
        }

        public void obtainCape() {
            executeEvent(Event.GOT_CAPE);
        }

        public void obtainFireFlower() {
            executeEvent(Event.GOT_FIRE);
        }

        public void meetMonster() {
            executeEvent(Event.MET_MONSTER);
        }

        private void executeEvent(Event event) {
            int stateValue = state.getValue();
            int eventValue = event.getValue();
            this.state = transitionTable[stateValue][eventValue];
            this.score = actionTable[stateValue][eventValue];
        }
    }

}
