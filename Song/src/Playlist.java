
public class Playlist {
    private Song[] songs;
    private String name;
    private int songCount; // to keep track of how many songs have been added

    public Playlist(String name, int maxSongs) {
        this.name = name;
        this.songs = new Song[maxSongs];
        this.songCount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Song[] getSongs() {
        return songs;
    }

    public void setSongs(Song[] songs) {
        this.songs = songs;
    }

    public void addSong(Song song) {
        if (songCount < songs.length) {
            this.songs[songCount] = song;
            songCount++;
            System.out.println("Add song succeed.");
        } else {
            System.out.println("The playlist is full. Cannot add more songs.");
        }
    }

    public int totalDuration() {
        int total = 0;
        for (int i = 0; i < songCount; i++) {
            total += songs[i].getDuration();
        }
        return total;
    }
    
    public void removeSong(String title) {
        boolean found = false;
        for (int i = 0; i < songCount; i++) {
            if (songs[i].getTitle().equals(title)) {
                // Shift all songs down
                found = true;
                for (int j = i; j < songCount - 1; j++) {
                    songs[j] = songs[j + 1];
                }
                // null out the last song
                songs[songCount - 1] = null;
                songCount--;
                System.out.println("Remove " + name + " succeed.");
                return;
            }
        }
         if (!found) {
            System.out.println("Remove " + name + " not found.");
        }
       
    }

    
    
}
