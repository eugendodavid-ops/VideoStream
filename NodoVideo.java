public class NodoVideo {
    public Video video;
    public NodoVideo prev;
    public NodoVideo next;

    public NodoVideo(Video video) {
        this.video = video;
        this.prev = null;
        this.next = null;
    }
}