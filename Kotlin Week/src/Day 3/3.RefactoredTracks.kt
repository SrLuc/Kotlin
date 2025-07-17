package RefactoredTracks

data class Track(
    val id: Int,
    var name: String,
    val bpm: Int,
    val duration: Double,
    val type: String,
    val artist: List<String>
) {
    fun showTrackInfo(): String {
        return "$name | $bpm | $duration | $type | ${artist.joinToString(", ")}"
    }
}

object TrackManager {
    private val tracks = mutableListOf<Track>()

    // GET
    fun getAllTracks(): List<Track> = tracks.toList() // evitar mutabilidade externa

    // POST
    fun add(track: Track): Boolean = tracks.add(track)

    // DELETE /:id
    fun remove(id: Int): Boolean {
        return tracks.removeIf { it.id == id }
    }

    // PUT/:id
    fun update(id: Int, newName: String): Boolean {
        val track = tracks.find { it.id == id }
        return if (track != null) {
            track.name = newName
            true
        } else false
    }

    // CREATE
    fun create(id: Int, name: String, bpm: Int, duration: Double, type: String, artist: List<String>) {
        add(Track(id, name, bpm, duration, type, artist))
    }
}

fun main() {
    TrackManager.create(1, "Dracula", 145, 7.86, "Progressive", listOf("Dekel", "Gorovich"))
    TrackManager.create(2, "Technoiad", 144, 8.22, "Progressive", listOf("Dekel"))

    val boilerTrack = Track(3, "Undefined", 100, 0.0, "TDB", listOf("TBD"))

    TrackManager.add(boilerTrack)

    println("🎵 Faixas cadastradas:")
    TrackManager.getAllTracks().forEach { println(it.showTrackInfo()) }

    if (TrackManager.update(3, "Sound Of Madness")) {
        println("\n✅ Track atualizada!")
    }

    println("\n🎵 Faixas após update:")
    TrackManager.getAllTracks().forEach { println(it.showTrackInfo()) }

    if (TrackManager.remove(3)) {
        println("\n❌ Track com ID 3 removida com sucesso.")
    } else {
        println("\n⚠️ Track com ID 3 não encontrada.")
    }

    println("\n📦 Faixas finais:")
    TrackManager.getAllTracks().forEach { println(it.showTrackInfo()) }
}
