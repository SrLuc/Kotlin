import Tracks.Track
import org.junit.Test
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue

class TracksTest {

    @Test
    fun shouldShowTrackNameInfo(){
       val track = Track(1, "Dracula", 147, 8.77, "Progressive", listOf("Dekel"))
        assertEquals("Dracula", track.name)
    }

    @Test
    fun shouldShowArtistInfo() {
        val track = Track(1, "Dracula", 147, 8.77, "Progressive", listOf("Dekel", "Gorivich"))
        assertEquals(listOf("Dekel", "Gorivich"), track.artist)
    }

    @Test
    fun shouldShowArtistAmount(){
        val track = Track(1, "Dracula", 147, 8.77, "Progressive", listOf("Dekel", "Gorivich"))
        assertEquals(2, track.artist.size)
    }

    @Test
    fun shouldShowBPMInfo(){
        val track = Track(1, "Dracula", 147, 8.77, "Progressive", listOf("Dekel"))
        assertEquals(147, track.bpm)
    }

    @Test
    fun shouldCreateNewTrack(){
        val tracks = mutableListOf<Track>();
        val track1 = Track(1, "Dracula", 147, 8.77, "Progressive", listOf("Dekel"))
        tracks.add(track1)
        assertEquals(track1, track1)
    }

    @Test
    fun shouldCreateNewArtist(){
        val tracks = mutableListOf<Track>();
        val track = Track(1, "Dracula", 147, 8.77, "Progressive", listOf("Dekel"))
        assertEquals(track.artist[0], track.artist[0])
    }

    @Test
    fun shouldDeleteTracks(){
        val tracks = mutableListOf<Track>();
        val track = Track(1, "Dracula", 147, 8.77, "Progressive", listOf("Dekel"))
        val track2 = Track(2, "Insiede", 149, 9.19, "Progressive", listOf("Gorovich"))
        val track3 = Track(3, "Forest", 144, 8.12, "Progressive", listOf("Pateta"))

        tracks.add(track)
        tracks.add(track2)
        tracks.add(track3)
        tracks.clear()
        assertEquals(0, tracks.size);
    }

    @Test
    fun shouldUpdateTrack(){
        val tracks = mutableListOf<Track>();
        val originalTrack = Track(1, "Dracula", 147, 8.77, "Progressive", listOf("Dekel"))
        tracks.add(originalTrack)
        assertEquals(tracks.size, 1);

        val updateTrack = Track(1, "Inside", 145, 6.77, "Progressive", listOf("Gorovich"))

        val removed = tracks.removeIf { it.id == originalTrack.id }
        assertTrue(removed)
        assertEquals(0, tracks.size);

        tracks.add(updateTrack)
        assertEquals(tracks.size, 1);
        assertEquals("Inside", updateTrack.name)
        assertEquals(145, updateTrack.bpm)

    }


}