
public class Main {
    public static void main(String[] args) {
        Playlist listSongs = new Playlist("Got",3);
        
        Song song1 = new Song("Shape of You", "Ed Sheeran", 234);
        Song song2 = new Song("Blinding Lights", "The Weeknd", 201);
        Song song3 = new Song("Someone Like You", "Adele", 278);
        Song song4 = new Song("Castle on the Hill", "Ed Sheeran", 273);
        
        listSongs.addSong(song1);
        listSongs.addSong(song2);
        listSongs.addSong(song3);
        listSongs.addSong(song4);
        
        System.out.println("TotalDuration: " + listSongs.totalDuration());
        
        listSongs.removeSong("Shape of You");
        System.out.println("TotalDuration: " + listSongs.totalDuration());
    }
}
