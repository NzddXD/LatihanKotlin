package app.src.entitas.abstractcollect

import app.src.entitas.interfacecollect.Blender

class BlenderImpl : Blender {
    override fun blend(): String {
        return "Blending in progress"
    }

    override fun potong(): String {
        return "Cutting in progress"
    }
}
