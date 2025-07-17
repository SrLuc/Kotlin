package tests

import org.junit.Test
import org.junit.Before
import RefactoredTracks.Track
import RefactoredTracks.TrackManager
import junit.framework.TestCase.assertEquals
import org.junit.Assert.*

class RefactoredTracksTest {




    @Test
    fun shouldShowTrackInfo(){
        val track = Track(1,"Dracula", 145, 7.86, "Progressive", mutableListOf("Empirikal"))
        assertEquals("Dracula | 145 | 7.86 | Progressive | Empirikal", track.showTrackInfo())
    }

    @Test
    fun shouldCreateTrackList(){
        val trackList = mutableListOf<Track>()
        assertEquals(arrayListOf<Track>(), trackList)
    }

    @Test
    fun shouldCreateTrack(){
        TrackManager.create(1, "Dracula", 145, 7.86, "Progressive", listOf("Empirikal"))

        val tracks = TrackManager.getAllTracks()
        val track = tracks[0]

        assertEquals(1,tracks.size)
        assertEquals("Dracula", track.name)
        assertEquals(145, track.bpm)
        assertEquals(7.86, track.duration, 0.001)
        assertEquals("Progressive", track.type)
        assertEquals(listOf("Empirikal"), track.artist)
    }

    @Test
    fun shouldAddTrack(){
        val track = Track(1,"Dracula", 145, 7.86, "Progressive", mutableListOf("Empirikal"))
        val newTrack = TrackManager.add(track)
        assertTrue(newTrack)

    }

    @Test
    fun shouldRemoveTrack(){
        val track = Track(1,"Dracula", 145, 7.86, "Progressive", mutableListOf("Empirikal"))
        val addedTrack = TrackManager.add(track)
        val removedTrack = TrackManager.remove(track.id)

        assertEquals(addedTrack,removedTrack)
        assertTrue(removedTrack)
        assertTrue(TrackManager.getAllTracks().isEmpty())
    }

    @Test
    fun shouldUpdateTrack(){
        val newTrack = Track(1,"Dracula", 145, 7.86, "Progressive", mutableListOf("Empirikal"))
        TrackManager.add(newTrack)

        val allTracks = TrackManager.getAllTracks()
        val updatedTrack = TrackManager.update(newTrack.id, "Inside")

        assertTrue(updatedTrack)
        assertEquals("Inside", newTrack?.name)
        assertEquals(1, allTracks.size)
    }


    @Test
    fun shouldNotUpdateTrack(){
        val newTrack = Track(1,"Dracula", 145, 7.86, "Progressive", mutableListOf("Empirikal"))
        val otherTrack = Track(2,"Inside", 146, 7.86, "Progressive", mutableListOf("Empirikal"))
        var noTupdatedTrack = Track(3,"Boggie Naipe", 90, 7.0, "Rap", mutableListOf("Racionais"))

        TrackManager.add(newTrack)
        TrackManager.add(otherTrack)

        var updated = TrackManager.update(noTupdatedTrack.id, "Boggie Naipe")
        assertFalse(updated)
        assertEquals(false, updated)


    }


}



