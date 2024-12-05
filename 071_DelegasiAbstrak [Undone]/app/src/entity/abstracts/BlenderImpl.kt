package app.src.entity.abstractcollect

import app.src.entity.interfacecollect.Blender

class BlenderImpl : Blender {
    override fun blend(){
        println("Blended")
    }
}
