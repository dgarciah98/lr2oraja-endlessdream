package bms.player.beatoraja.audio;

public enum SurroundSystem {
	STEREO(2),
	FIVE_POINT_ONE(6),
	SEVEN_POINT_ONE(8);

	public final int channels;

	private SurroundSystem(int channels) {
		this.channels = channels;
	}

	public static SurroundSystem getSurround(String surround) {
		if(surround.contains("7.1")) return SEVEN_POINT_ONE;
		else if (surround.contains("5.1")) return FIVE_POINT_ONE;
		else return STEREO;
	}
}
