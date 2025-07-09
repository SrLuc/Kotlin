package tests
import Fighter
import org.junit.Test
import org.junit.Assert.*

class POOTest {

    @Test
    fun shouldReturnIfAlive(){
        val baraka = Fighter(1, "Baraka", 100, 20, 10)
        val milena = Fighter(2, "Milena", 100, 10, 20)
        assertEquals(100, baraka.health)
        assertTrue(milena.isAlive())
    }


    @Test
    fun shouldReturnIfNotAlive(){
        val kabal = Fighter(3,"Kabal", 0, 20,25)
        val reptile = Fighter(4, "Reptile", 0, 60, 50)
        assertFalse(kabal.isAlive())
        assertFalse(reptile.isAlive())
    }

    @Test
    fun shouldReciveDamage(){
        val subzero = Fighter(5, "Subzero", 100, 30, 20)
        val scorpion = Fighter(6, "Scorpion", 100, 40, 30)
        val expectedHealth = subzero.health - scorpion.attack
        assertEquals(60, expectedHealth)
    }

    @Test
    fun shoudFinishHim(){
        val baraka = Fighter(1, "Baraka", 100, 20, 10)
        val milena = Fighter(2, "Milena", 40, 10, 20)
        assertEquals(0, milena.health - baraka.attack * 2)
    }

    @Test
    fun shouldCheckCharAttackPoints(){
        val baraka = Fighter(1, "Baraka", 100, 20, 10)
        assertNotEquals(19.99, baraka.attack)
        assertEquals(20,baraka.attack)
        assertNotEquals(20.01,baraka.attack)
    }

    @Test
    fun shouldCheckCharDefensePoints(){
        val baraka = Fighter(1, "Baraka", 100, 20, 10)
        assertNotEquals(9.99, baraka.defense)
        assertEquals(10,baraka.defense)
        assertNotEquals(10.01,baraka.defense)
    }

    @Test
    fun shouldCheckCharName(){
        val baraka = Fighter(1, "Baraka", 100, 20, 10)
        assertEquals("Baraka", baraka.name)
        assertNotEquals("Barakaa", baraka.name)
        assertNotEquals("Barak", baraka.name)
    }

    @Test
    fun shouldCheckLifePoints(){
        val baraka = Fighter(1, "Baraka", 100, 20, 10)
        assertEquals(100, baraka.health)
        assertNotEquals(99.9991, baraka.health)
        assertNotEquals(101.111, baraka.health)
        assertNotEquals(-101.111, baraka.health)
    }
}