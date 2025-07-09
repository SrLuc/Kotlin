package `Day 3`

var tracks = mutableListOf<Track>()

data class Track(val id:Int, var name:String, val bpm:Int, val duration:Double, val type:String, val artist:List<String>){


    //GET
    fun showInfoTrack(id:Int):String{
        val foundTrack = tracks.find { it.id == id }

        return if (foundTrack != null){
            "${foundTrack.name} | ${foundTrack.bpm} | ${foundTrack.duration} | ${foundTrack.type} | ${foundTrack.artist.joinToString(" ")}"
        }else{
            return "Track not found"
        }
    }

    //POST
    fun createNewTrack():String{
        tracks.add(Track(id,name, bpm, duration, type, artist))
        return "new Track $name has created"
    }

    //DELETE
    fun deleteTrack(id:Int):Boolean{
        return tracks.removeIf{it.id == id}
    }

    //POST
    fun updateTrackName(id:Int, newName:String){
        var track = tracks.find { it.id ==id }
        track?.name = newName
    }

}

var t1 = Track(1,"Dracula", 145, 7.86, "Progressive", listOf("Dekel", "Gorovich"))
var t2 = Track(2,"Technoiad", 144, 8.22, "Progressive", listOf("Dekel"))


fun main(){
    println(tracks)

    println(t2.createNewTrack())
    println(t1.createNewTrack())
    println(t2.showInfoTrack(1))


}
