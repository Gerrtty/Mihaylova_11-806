public class Main {
    public static void main(String[] args) {
        SortedPlayList playList = new SortedPlayList(10);
        AudioTrack a = new AudioTrack(20);
        AudioTrack a2 = new AudioTrack(10);
        AudioTrack a3 = new AudioTrack(30);
        AudioTrack a4 = new AudioTrack(5);
        playList.add(a);
        playList.add(a2);
        playList.add(a3);
        playList.add(a4);
        for(int i = 0; i < 4; i++){
            System.out.println(playList.arr[i].duration);
        }
    }
}
