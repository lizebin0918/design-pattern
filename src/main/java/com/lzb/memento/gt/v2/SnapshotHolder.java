package com.lzb.memento.gt.v2;

import java.util.Stack;

/**
 * <br/>
 * Created on : 2021-10-13 22:08
 *
 * @author lizebin
 */
public class SnapshotHolder {

    private Stack<Snapshot> snapshots = new Stack<>();

    public Snapshot popSnapshot() {
        return snapshots.pop();
    }

    public void pushSnapshot(Snapshot snapshot) {
        snapshots.push(snapshot);
    }

}
