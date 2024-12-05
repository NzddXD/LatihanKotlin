package app.src.entity.abstractcollect

import app.src.entity.interfacecollect.Blender

abstract class BlenderDelegate : Blender {
    override fun blend() {
        println("BlenderDelegate memanggil blend()")
    }
}
