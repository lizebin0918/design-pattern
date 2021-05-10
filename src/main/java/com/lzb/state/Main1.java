package com.lzb.state;
/**
 * <br/>
 * Created on : 2021-05-07 16:42
 * @author chenpi 
 */
public class Main1 {

    public static void main(String[] args) {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        int score = mario.getScore();
        State state = mario.getState();
        System.out.println("score:" + score + ";state:" + state);
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

        MarioStateMachine() {
            this.state = State.SMALL;
        }

        public void obtainMushRoom() {
            if (this.state == State.SMALL) {
                this.score += 100;
                this.state = State.SUPER;
            }
        }

        public void obtainCape() {
            if (state == State.SMALL || state == State.SUPER) {
                this.score += 200;
                this.state = State.CAPE;
            }
        }

        public void obtainFireFlower() {
            if (state == State.SMALL || state == State.SUPER) {
                this.score += 300;
                this.state = State.FIRE;
            }
        }

        public void meetMonster() {
            if (state == State.SMALL) {
                System.out.println("挂了.............");
                return;
            }
            if (state == State.CAPE) {
                score -= 200;
            }
            if (state == State.SUPER) {
                score -= 100;
            }
            if (state == State.FIRE) {
                score -= 300;
            }
            this.state = State.SMALL;
        }

        public int getScore() {
            return this.score;
        }

        public State getState() {
            return this.state;
        }

    }

}
