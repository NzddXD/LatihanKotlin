package app.src.entity

import app.src.entity.interfacecollect.Buah
import app.src.entity.interfacecollect.Blender
import app.src.entity.abstractcollect.BuahImpl
import app.src.entity.abstractcollect.BlenderImpl

class BuahBlender(buah: Buah) : Buah by buah, Blender by BlenderImpl()
