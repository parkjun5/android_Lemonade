package com.example.lemonade

fun main() {
    println("Hello, world!")
    val woodCabin = SquareCabin(12)
    println(woodCabin.buildingMaterial)
    println(woodCabin.capacity)
    println(woodCabin.hasRoom())

    with(woodCabin) {
        println("=========")
        println("Capacity : ${capacity}")
        println("BuildingMaterial : ${buildingMaterial}")
        println("HasRooM ? ${if(hasRoom()) "있음" else "없음"}")
    }

    with(RoundHut(2)) {
        println("=========")
        println("Capacity : ${capacity}")
        println("BuildingMaterial : ${buildingMaterial}")
        println("HasRooM ? ${if(hasRoom()) "있음" else "없음"}")
    }

    with(RoundTower(1)) {
        println("=========")
        println("Capacity : ${capacity}")
        println("BuildingMaterial : ${buildingMaterial}")
        println("HasRooM ? ${if(hasRoom()) "있음" else "없음"}")
    }

    with(FireTower(1, 99)) {
        println("=========")
        println("Capacity : ${capacity}")
        println("BuildingMaterial : ${buildingMaterial}")
        println("HasRooM ? ${if(hasRoom()) "있음" else "없음"}")
    }
}

abstract class Dwelling(private var residents: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int
    fun hasRoom():Boolean {
        return residents < capacity
    }
}

class SquareCabin(residents: Int) : Dwelling(residents) {
    override val buildingMaterial = "Wood"
    override val capacity = 6
}

open class RoundHut(residents: Int) : Dwelling(residents) {
    override val capacity = 4
    override val buildingMaterial = "Straw"
}

open class RoundTower(
    residents: Int,
    val floors: Int = 2) : RoundHut(residents) {
    override val capacity = 30 * floors
    override val buildingMaterial = "Stone"
}

class FireTower(
    residents: Int,
    floors: Int) : RoundTower(residents, floors) {
    override val capacity = 30 * floors
    override val buildingMaterial = "LAVA"
}
abstract class AbstractCLASSTHING {
}