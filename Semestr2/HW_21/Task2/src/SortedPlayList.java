public class SortedPlayList {
    AudioTrack[] arr;
    int n = 0;
    int campacity;

    public SortedPlayList(int campacity){
        this.campacity = campacity;
        this.arr = new AudioTrack[campacity];
    }

    //Вставляет новый трек в массив так чтобы треки остались в нём уорядочены
    public void add(AudioTrack audioTrack){
        if(n == campacity){
            throw new IllegalArgumentException("PlayList is overflow");
        }
        int c = 0;
        while (c < n && arr[c].compareTo(audioTrack) <= 0){
            c++;
        }
        if(arr[c] == null){
            arr[c] = audioTrack;
        }
        else{
            for(int i = 0; i < n - c; i++){
                arr[n - i] = arr[n - i - 1];
            }
            arr[c] = audioTrack;
        }
        n++;
    }
}
