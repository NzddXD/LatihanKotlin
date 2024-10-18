package app.src.entity

class Mahasiswa {
    // Melakukan overloading method
    fun kenalan(nama : String, jenis_kelamin : String){
        println("Hai, aku $nama. Aku $jenis_kelamin")
    }

    fun kenalan(nama : String, jenis_kelamin : String, alamat : String){
        println("Hai, aku $nama. Aku $jenis_kelamin. Aku tinggal di $alamat")
    }

    fun kenalan(nama : String, hobi : String, kontak : Long){
        println("Hai, aku $nama. Hobiku $hobi, nomor kontakku adalah $kontak")
    }
}