package app.src.entity

sealed class Jabatan(val pangkat : String){
    object DIREKTUR : Jabatan("Jabatan: Direktur")
    object MANAGER : Jabatan("Jabatan: Manager")
    object OPERATOR : Jabatan("Jabatan: Operator")
}