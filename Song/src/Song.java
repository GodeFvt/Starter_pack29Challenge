

public class Song {

    private String title;
    private String artist;
    private int duration;
    private boolean isLike;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.isLike = false;

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String addToFavorite() {
        if (this.isLike) {
            this.isLike = false;
            return getTitle() + " is disliked";
        } else {
            this.isLike = true;
            return getTitle() + " is liked";
        }
    }

    public String getFormattedDuration() {
        int minutes = duration / 60;
        int seconds = duration % 60;
        return minutes + " minutes " + seconds + " seconds";
    }

    public boolean isSameArtist(Song otherSong) {
        if (this.artist.equals(otherSong.getArtist())) {
            return true;
        } else {
            return false;
        }
    }

    public String isFavorite() {
        if (this.isLike) {
            return getTitle() + " is liked";
        } else {
            return getTitle() + " is disliked";
        }
    }

    public static void main(String[] args) {
        Song song1 = new Song("Shape of You", "Ed Sheeran", 234);
        Song song2 = new Song("Blinding Lights", "The Weeknd", 201);
        Song song3 = new Song("Someone Like You", "Adele", 278);
        Song song4 = new Song("Castle on the Hill", "Ed Sheeran", 273);

        System.out.println(song1.addToFavorite());
        System.out.println(song1.isFavorite());
        System.out.println(song1.getFormattedDuration());
        System.out.println(song1.addToFavorite());
        System.out.println(song1.isFavorite());
        
        System.out.println(song1.isSameArtist(song4));
       
    }

}
