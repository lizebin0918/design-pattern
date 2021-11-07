package com.lzb.state.gt;

/**
 * 状态模式<br/>
 * Created on : 2021-05-10 22:07
 * @author lizebin
 */
public class Main3 {

    public static void main(String[] args) {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        mario.obtainCape();
        System.out.println("score:" + mario.score + ";state:" + mario.state.getName());
    }

    private interface IMario {
        State getName();
        void obtainMushRoom();
        void obtainCape();
        void obtainFireFlower();
        void meetMonster();
    }

    enum State {
        SMALL(0), SUPER(1), FIRE(2), CAPE(3);
        private int value;
        private State(int value) {
            this.value = value;
        }
    }

    private static class SmallMario implements IMario {

        private MarioStateMachine marioStateMachine;

        SmallMario(MarioStateMachine marioStateMachine) {
            this.marioStateMachine = marioStateMachine;
        }

        @Override
        public State getName() {
            return State.SMALL;
        }

        @Override
        public void obtainMushRoom() {
            marioStateMachine.setScore(marioStateMachine.score + 100);
            marioStateMachine.state = new SuperMario(marioStateMachine);
        }

        @Override
        public void obtainCape() {
            marioStateMachine.setScore(marioStateMachine.score + 200);
            marioStateMachine.state = new CapeMario(marioStateMachine);
        }

        @Override
        public void obtainFireFlower() {
            marioStateMachine.setScore(marioStateMachine.score + 300);
            marioStateMachine.state = new FireMario(marioStateMachine);
        }

        @Override
        public void meetMonster() {
            System.out.println("挂了........");
        }
    }

    private static class SuperMario implements IMario {

        private MarioStateMachine marioStateMachine;

        SuperMario(MarioStateMachine marioStateMachine) {
            this.marioStateMachine = marioStateMachine;
        }

        @Override
        public State getName() {
            return State.SUPER;
        }

        @Override
        public void obtainMushRoom() {
            System.out.println("要变成哥斯拉？？？");
        }

        @Override
        public void obtainCape() {
            marioStateMachine.setScore(marioStateMachine.score + 200);
            marioStateMachine.state = new CapeMario(marioStateMachine);
        }

        @Override
        public void obtainFireFlower() {
            marioStateMachine.setScore(marioStateMachine.score + 300);
            marioStateMachine.state = new FireMario(marioStateMachine);
        }

        @Override
        public void meetMonster() {
            marioStateMachine.setScore(marioStateMachine.score - 100);
            marioStateMachine.state = new SmallMario(marioStateMachine);
        }
    }

    private static class CapeMario implements IMario {

        private MarioStateMachine marioStateMachine;

        CapeMario(MarioStateMachine marioStateMachine) {
            this.marioStateMachine = marioStateMachine;
        }

        @Override
        public State getName() {
            return State.CAPE;
        }

        @Override
        public void obtainMushRoom() {

        }

        @Override
        public void obtainCape() {

        }

        @Override
        public void obtainFireFlower() {

        }

        @Override
        public void meetMonster() {
            marioStateMachine.setScore(marioStateMachine.score - 200);
            marioStateMachine.state = new SmallMario(marioStateMachine);

        }
    }

    private static class FireMario implements IMario {

        private MarioStateMachine marioStateMachine;

        FireMario(MarioStateMachine marioStateMachine) {
            this.marioStateMachine = marioStateMachine;
        }

        @Override
        public State getName() {
            return State.FIRE;
        }

        @Override
        public void obtainMushRoom() {

        }

        @Override
        public void obtainCape() {

        }

        @Override
        public void obtainFireFlower() {

        }

        @Override
        public void meetMonster() {
            marioStateMachine.setScore(marioStateMachine.score - 300);
            marioStateMachine.state = new SmallMario(marioStateMachine);
        }
    }

    private static class MarioStateMachine {
        private int score;
        private IMario state;

        public MarioStateMachine() {
            this.score = 0;
            this.state = new SmallMario(this);
        }

        public void obtainMushRoom() {
            this.state.obtainMushRoom();
        }

        public void obtainCape() {
            this.state.obtainCape();
        }

        public void obtainFireFlower() {
            this.state.obtainFireFlower();
        }

        public void meetMonster() {
            this.state.meetMonster();
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public IMario getState() {
            return state;
        }

        public void setState(IMario state) {
            this.state = state;
        }
    }
}
