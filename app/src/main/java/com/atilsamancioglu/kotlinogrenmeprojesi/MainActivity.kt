package com.atilsamancioglu.kotlinogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("merhaba kotlin")
        println(5 * 10)

        //Değişkenler && Sabitler

        //Integer

        println("----------Int---------")

        var a = 5
        var b = 10

        println(a * b)

        var yas = 50
        println(yas / 5 * 8)

        yas = 60
        println(yas / 5 * 8)

        val x = 5
        val y = 20

        println(x+y)

        // camelCase
        // snake_case

        val yasSonucu = yas * x
        println(yasSonucu)

        //Tanımlama (Defining)
        val benimIntegerim : Int

        // Başlatma, Değerini Atama (Initializing, Initialization)
        benimIntegerim = 5

        var yeniInteger : Int = 20

        println(benimIntegerim / 2)

        //Long

        println("----------Long---------")

        var benimLong : Long = 100
        benimLong = 3000000000
        println(benimLong)

        //Double & Float

        println("----------Double & Float---------")

        val pi = 3.14

        println(pi * 2)

        val floatPi : Float = 3.14f
        println(floatPi * 2)

        val yeniDouble = 5.0
        println(yeniDouble / 2)


        //String - Metin

        println("----------String---------")

        val benimString = "Benim Yeni Metnim"
        println(benimString.length)

        val isim = "Atıl"
        val soyisim = "Samancıoğlu"

        val tamisim = isim + " " + soyisim
        println(tamisim)

        val yeniBirString : String
        yeniBirString = "10"

        val baskaBirString = "20"

        println(yeniBirString+baskaBirString)

        //boolean

        println("----------Boolean---------")

        var benimBoolean = true
        benimBoolean = false

        // < -> küçüktür
        // > -> büyüktür
        // == -> eşittir
        // != -> eşit değildir
        // <= -> küçük eşittir
        // >= -> büyük eşittir
        // && -> ve
        // || -> veya

        println(3<5)
        println(4!=4)

        //Veri Tipi Dönüştürme

        println("----------Dönüştürme---------")

        val benimInt = 10
        val benimLongaCevrilenInt = benimInt.toLong()
        println(benimLongaCevrilenInt)

        val kullaniciGirdisi = "50"
        val kullaniciInt = kullaniciGirdisi.toInt()
        println(kullaniciInt / 2)

        //Koleksiyonlar

        //Array - Dizi

        println("----------Dizi---------")

        val stringOrnegi = "Atıl"

        val benimDizim = arrayOf(stringOrnegi,"Samancıoğlu","Zeynep","Kerem","Osman")

        //index
        println(benimDizim[0])
        println(benimDizim.get(1))
        println(benimDizim.get(2))
        benimDizim[2] = "Mahmut"
        println(benimDizim.get(2))
        benimDizim.set(3,"Mehmet")
        println(benimDizim[3])


        val numaraDizisi = doubleArrayOf(1.0,2.0,3.5)
        println(numaraDizisi.get(2))

        val karisikDizi = arrayOf("Atıl",24,16.5,true,false)
        println(karisikDizi.get(3))

        //ArrayList - Listeler

        println("----------ArrayList---------")

        val isimListesi = arrayListOf("Atıl","Zeynep","Osman")

        println(isimListesi[0])
        println(isimListesi.get(1))

        isimListesi.add("Mehmet")
        isimListesi.add("Atlas")
        println(isimListesi.get(4))

        val karisikArrayList = arrayListOf<Any>()
        karisikArrayList.add("Atıl")
        karisikArrayList.add(5)
        karisikArrayList.add(true)

        val intArrayList = ArrayList<Int>()
        intArrayList.add(5)
        intArrayList.add(20)
        println(intArrayList.get(1))

        //Set

        println("----------Set---------")

        val ornekDizi = arrayOf(7,8,9,9,9,8,10)
        println("index 2: ${ornekDizi[2]}")
        println("index 3: ${ornekDizi[3]}")

        println(ornekDizi.size)

        val benimSet = setOf<Int>(7,8,9,9,9,8,10)
        println(benimSet.size)

        //For Each
        benimSet.forEach {
            println(it)
        }

        val digerSet = HashSet<String>()
        digerSet.add("Atıl")
        digerSet.add("Atıl")
        digerSet.add("Atıl")
        digerSet.add("Samancıoğlu")

        digerSet.forEach {
            println(it)
        }

        //Map

        println("----------Map---------")

        //Anahtar Kelime - Değer (Key-Value Pairing)

        val yemekDizisi = arrayOf("Elma","Et","Tavuk")
        val kaloriDizisi = arrayOf(100,300,200)

        println("${yemekDizisi[0]}'nın kalorisi: ${kaloriDizisi[0]}")

        val yemekKaloriMap = hashMapOf<String, Int>()
        yemekKaloriMap.put("Elma",100)
        yemekKaloriMap.put("Et",300)
        yemekKaloriMap.put("Tavuk",200)

        println(yemekKaloriMap.get("Et"))

        val benimMapim = HashMap<String, String>()
        benimMapim.put("Örnek","Değer")

        val yeniMap = hashMapOf<String, Int>("Atıl" to 40,"Örnek" to 50)
        println(yeniMap.get("Örnek"))


        //Matematiksel İşlemler
        println("----------Matematiksel İşlemler---------")

        var sayi = 8
        println(sayi)
        sayi = sayi + 1
        println(sayi)
        sayi++
        println(sayi)
        sayi--
        println(sayi)

        var digerSayi = 10

        println(digerSayi > sayi)

        // && -> VE
        // || -> VEYA

        println(digerSayi > sayi && 2 > 3)
        println(digerSayi > sayi || 2 > 3)

        println(8+7)
        println(10-4)
        println(20*5)
        println(10/2)

        //Remainder - Kalanı Bulmak
        println(11%3)

        //If Kontrolleri
        println("----------If Statements (Eğer Kontrolleri)---------")

        val skor = 80

        if (skor < 10) {
            println("Oyunu kaybettin!")
        } else if (skor >= 10 && skor < 20) {
            println("Skorun 10 ve 20 arasında, çok iyi skor aldın")
        } else if (skor >= 20 && skor < 30) {
            println("Skorun 20 ve 30 arasında, rekorlar kırıyorsun")
        } else {
            println("Skorun 30'un üstünde, efsane oynadın")
        }

        //When - Switch
        println("----------When---------")

        var notRakami = 2
        var notStringi = ""


        when(notRakami) {
            0 -> notStringi = "Geçersiz Not"
            1 -> notStringi = "Zayıf"
            2 -> notStringi = "Kötü"
            3 -> notStringi = "Orta"
            4 -> notStringi = "İyi"
            else -> notStringi = "Pek İyi"
        }

        println(notStringi)

        /*


        if (notRakami == 0) {
            notStringi = "Geçersiz Not"
        } else if (notRakami == 1) {
            notStringi = "Zayıf"
        } else if (notRakami == 2) {
            notStringi = "Kötü"
        } else if (notRakami == 3) {
            notStringi = "Orta"
        } else if (notRakami == 4) {
            notStringi = "İyi"
        } else {
            notStringi = "Pek İyi"
        }
*/


        //Döngüler
        println("----------For Döngüsü---------")

        val baskaBirDizi = arrayOf(5,10,15,20,25,30)
        val q = baskaBirDizi[0] / 5 + 3
        println(q)


        println("döngü başladı")
        for (num in baskaBirDizi) {
            println(num / 5 + 3)
        }
        println("döngü bitti")


        for (indeks in baskaBirDizi.indices ) {
            println(baskaBirDizi[indeks] / 5 + 3)
        }

        for (b in 0..9) {
            println(b)
        }

        val benimDigerStringDizim = ArrayList<String>()
        benimDigerStringDizim.add("Atıl")
        benimDigerStringDizim.add("Samancıoğlu")

        for (str in benimDigerStringDizim) {
            println(str)
        }

        benimDigerStringDizim.forEach {
            println(it)
        }

        //While
        println("----------While Döngüsü---------")

        var j = 0

        while (j <= 10) {
            println(j)
            j = j + 1
        }

    }
}