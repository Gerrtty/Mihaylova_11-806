public class AudioTrack implements Comparable<AudioTrack>{
    String author;
    String title;
    int duration;

    public AudioTrack(int duration){
        this.duration = duration;
    }

    @Override
    public int compareTo(AudioTrack o) {
        return duration > o.duration ? 1 : duration < o.duration ? -1 : 0;
    }
}