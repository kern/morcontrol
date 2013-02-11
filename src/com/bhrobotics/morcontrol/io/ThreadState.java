package com.bhrobotics.morcontrol.io;

public class ThreadState {
	public static final ThreadState CONNECTING = new ThreadState();
	public static final ThreadState PAUSED = new ThreadState();
	public static final ThreadState RUNNING = new ThreadState();
	public static final ThreadState DEAD = new ThreadState();

	private ThreadState() {
	}
}
