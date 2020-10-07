fun main(args: Array<String>) {
    // Ini komen satu baris

    /*Jelaskan apa itu Null Safety pada Kotlin
    * Null Safety berfungsi untuk menghilangkan bahaya dari null references
    * Untuk Menghindari NPE kita bisa menggunakan:
    * 1. Cek dengan kondisi
    * 2. Safe Calls
    * 3. Elvis Operator
    * 4. not-null assertion operator
    * 5. Safe Casts
    **/

    // Soal No 2

    // Tipe data String di Kotlin
    val tempatLahir: String = "Jakarta"
    var namaPanggilan: String = "Bry"
    val golonganDarah: String = "AB"

    // Tipe data Numbers
    var umur: Int = 20
    var nilai: Double = 80.5
    var tinggiBadan: Int = 170

    // Tipe data  boolean
    var lulusSma: Boolean = true
    var checkStatus: Boolean = false
    var jawaban: Boolean = true

    // Tipe char
    var nilaiMatematika = 'A'
    var indexCategory = 'C'
    var hurufAbjad = 'D'

    // Soal No 3
    val angkaPertama = 50
    val angkaKedua = 2
    var total: Int? = null

    // Penjumlahan
    total = angkaPertama + angkaKedua
    println(total)
    // Pengurangan
    total = angkaPertama-angkaKedua
    println(total)
    // Perkalian
    total = angkaPertama*angkaKedua
    println(total)
    // Pembagian
    total = angkaPertama/angkaKedua
    println(total)
}