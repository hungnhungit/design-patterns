package adapter;

public class AudioPlayer implements MediaPlayer{
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		
		if(audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
		
	}
}
