package app.src.entitas.abstractcollect

import app.src.entitas.interfacecollect.Blender

abstract class BlenderDelegate : Blender {
    override fun blend() {
        println("BlenderDelegate memanggil blend()")
    }
}
