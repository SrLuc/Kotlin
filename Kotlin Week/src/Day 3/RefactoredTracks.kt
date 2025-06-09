import `Day 3`.tracks

data class Track(val id: Int, var name: String, val bpm: Int, val duration: Double, val type: String, val artist: List<String>){
    fun showTrackInfo():String{
        return "$name | $bpm | $duration | $type | ${artist.joinToString(", ")}"
    }
}

object TrackManager {
    private var tracks = mutableListOf<Track>()

    //GET
    fun getAllTracks():List<Track> = tracks

    //POST
    fun add(track:Track): Boolean = tracks.add(track)

    //DELETE /:id
    fun remove(id:Int): String {
        val removedTrack = tracks.removeIf{it.id == id}
        return "Track $id has deleted"
    }

    //PUT   /:id
    fun update(id:Int, newName:String) = tracks.find{it.id == id}?.name = newName

    //CREATE
    fun create(id:Int,name:String, bpm:Int, duration: Double, type:String, artist: List<String>){
        tracks.add(Track(id, name, bpm, duration, type, artist))
    }
}

fun main(){

    //creating tracks
    TrackManager.create(1, "Dracula", 145, 7.86, "Progressive", listOf("Dekel", "Gorovich"))
    TrackManager.create(2, "Technoiad", 144, 8.22, "Progressive", listOf("Dekel"))


    //Creating BOILER track
    val track1 = Track(3, "Undefined", 100, 0.0, "TDB", listOf("TBD"))
    TrackManager.add(track1)

    //Seeing all tracks register
    println("🎵 Faixas cadastradas:")
    TrackManager.getAllTracks().forEach { println(it.showTrackInfo()) }

    //Updating track by ID
    TrackManager.update(3, "Sound Of Madness")
    println("\n Faixas após update:")
    TrackManager.getAllTracks().forEach { println(it.showTrackInfo()) }

    //Removing Track
    println("\n❌ Removendo uma Track com base no ID")
    println(TrackManager.remove(3))

    println("\n📦 Faixas finais:")
    TrackManager.getAllTracks().forEach {println(it.showTrackInfo())}




}