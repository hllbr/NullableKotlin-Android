package com.hllbr.nullablekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        Javada çok fazla karşılaşılmayan Kotlin ile kodlamaya giren kod yapısını makro ölçekte basitleştiren bir yapı == Nullability
        Nullability == Birşeyin boş olması boş olabilmesi anlamına geliyor Güvenli kod yazma açısından çok önemli bir yapı
        Eğer bir değişken tanımlayıp değer atamassam bu ifadeyi yazdıramıyorum bile

         */
        var myString : String
        /*  println(myString)//Hata veriyor bir değer atamadın şeklinde çevirebilirim Burada Initialize sorunuyla karşılaşıyorum
        Initialize yapmadan işlem yapamazmıyım ? Yapabilirim nullability bu imkanı sunuyor

        var myString2  :String = null
        Buradada bir hata ile karşılaşıyorum hatam non-null type String

        2 farklı tip var
        1) Nullable && Non-null = herhangi birşey initialize edilmeden(boşluk) oalrak duran anlamına geliyor diyebiliriz
         eğer ben String? şeklinde bir tanımlama yaparsam herhangi bir şekilde bir üste satırdaki hatayla karşılaşmıyorum

         */

        var myString3 : String? = null//Hata giderildi
        //null bir string ifade değil initialize edilmemiş değer anlamına geliyor bir boşluk olarak ifade edebilirim

        println(myString3)
        /*myString3 artık bir string değil artık nullable-String diyebilirim.Swift içerisinde  optionel olarak tanımlanana bir yapı mevcut
        bir ifade nullable sınıftayken onunla bir ifadeyi çarpmaya izin verilmiyor basic example
        println(myString3 *3) eğer benmyString3!! şeklinde bir tanımlama yaparsam bu ifadenin değeri kesin kes burada eminim anlamına geliyor ve hatam oratadan kalkıyor
         */
        var myAge :Int? = null

        println(myAge!! *3)//myAge ifadesinin değerinin kesinlikle initialize edileceğini düşünüyorsam(biliyorsam) !! koyabilirim.
        //Eğer bir ifadenin kesin initialize edildiğini söylsersek ve yapılmassa app çöker


    }
}