package app.src.entitas.abstractcollect

import app.src.entitas.interfacecollect.Buah
import app.src.entitas.interfacecollect.Blender

class BuahBlender(buah: Buah) : Buah by buah, Blender by BlenderImpl() {
    override fun potong(): String {
        return buah.potong()
    }
}
