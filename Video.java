public class Video {
    private String idVideo;
    private String titulo;
    private int duracionSegundos;
    private String categoria;
    private int visitas;

    public Video(String idVideo, String titulo, int duracionSegundos, String categoria, int visitas) {
        this.idVideo = idVideo;
        this.titulo = titulo;
        this.duracionSegundos = duracionSegundos;
        this.categoria = categoria;
        this.visitas = visitas;
    }

    // Getters y Setters
    public String getIdVideo() { return idVideo; }
    public void setIdVideo(String idVideo) { this.idVideo = idVideo; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getDuracionSegundos() { return duracionSegundos; }
    public void setDuracionSegundos(int duracionSegundos) { this.duracionSegundos = duracionSegundos; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public int getVisitas() { return visitas; }
    public void setVisitas(int visitas) { this.visitas = visitas; }

    @Override
    public String toString() {
        return "Video [ID=" + idVideo + ", Titulo=" + titulo + "]";
    }
}