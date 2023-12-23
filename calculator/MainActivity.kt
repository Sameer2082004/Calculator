package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var str ="";
        val caltext:TextView=findViewById(R.id.textView)
        var str2=""
        val x= arrayListOf<Double>()
        var y=0.0
        val z= arrayListOf<String>()
        val btna:Button=findViewById(R.id.btnA)
        val btnb:Button=findViewById(R.id.btnB)
        val btnc:Button=findViewById(R.id.btnC)
        val btnd:Button=findViewById(R.id.btnD)
        val btne:Button=findViewById(R.id.btnE)
        val btnf:Button=findViewById(R.id.btnF)
        val btng:Button=findViewById(R.id.btnG)
        val btnh:Button=findViewById(R.id.btnH)
        val btni:Button=findViewById(R.id.btnI)
        val btnj:Button=findViewById(R.id.btnJ)
        val btnk:Button=findViewById(R.id.btnK)
        val btnl:Button=findViewById(R.id.btnL)
        val btnm:Button=findViewById(R.id.btnM)
        val btnn:Button=findViewById(R.id.btnN)
        val btno:Button=findViewById(R.id.btnO)
        val btnp:Button=findViewById(R.id.btnP)
        val btnz:Button=findViewById(R.id.btnz)
        val btny:Button=findViewById(R.id.btny)
        btna.setOnClickListener{
            str+=btna.text;caltext.text=str
            str2+=btna.text
        }
        btnb.setOnClickListener{
            str += btnb.text;caltext.text=str
            str2+=btnb.text
        }
        btnc.setOnClickListener{
            str += btnc.text;caltext.text=str
            str2+=btnc.text
        }
        btnd.setOnClickListener{
            str += btnd.text;caltext.text=str
            str2+=btnd.text
        }
        btne.setOnClickListener{
            str += btne.text;caltext.text=str;str2+=btne.text
        }
        btnf.setOnClickListener{
            str += btnf.text;caltext.text=str;str2+=btnf.text
        }
        btng.setOnClickListener{
            str += btng.text;caltext.text=str;str2+=btng.text
        }
        btnh.setOnClickListener{
            str += btnh.text;caltext.text=str;str2+=btnh.text
        }
        btni.setOnClickListener{
            str += btni.text;caltext.text=str;str2+=btni.text
        }
        btnz.setOnClickListener{
            str+=btnz.text;caltext.text=str
            str2+=btnz.text
        }
        btny.setOnClickListener{
            if (str!="") {
                val l = str.length
                if (str[l - 1] != '.') {
                    str += btny.text;caltext.text = str
                    str2 += btny.text
                }
            }
            else{
                str += "0"+btny.text;caltext.text =str
                str2 += btny.text
            }
        }
        btnj.setOnClickListener{
            if (str!="") {
                val l = str.length
                if (str[l - 1] != '+' && str[l - 1] != '-' && str[l - 1] != 'x' && str[l - 1] != '÷') {
                    str += btnj.text
                    caltext.text = str
                    if (str2==".")
                        str2="0"
                    x.add(str2.toDouble())
                    str2 = ""
                    z.add(btnj.text.toString())
                }
            }
        }
        btnk.setOnClickListener{
            if (str!="") {
                val l = str.length
                if (str[l - 1] != '+' && str[l - 1] != '-' && str[l - 1] != 'x' && str[l - 1] != '÷') {
                    str += btnk.text;caltext.text = str
                    if (str2==".")
                        str2="0"
                    x.add(str2.toDouble())
                    str2 = ""
                    z.add(btnk.text.toString())
                }
            }
        }
        btnm.setOnClickListener{
            if (str!="") {
                val l = str.length
                if (str[l - 1] != '+' && str[l - 1] != '-' && str[l - 1] != 'x' && str[l - 1] != '÷') {
                    str += btnm.text;caltext.text = str
                    if (str2==".")
                        str2="0"
                    x.add(str2.toDouble())
                    str2 = ""
                    z.add(btnm.text.toString())
                }
            }
        }
        btnn.setOnClickListener{
            if (str !="") {
                val l = str.length
                if (str[l - 1] != '+' && str[l - 1] != '-' && str[l - 1] != 'x' && str[l - 1] != '÷') {
                    str += btnn.text;caltext.text = str
                    if (str2==".")
                        str2="0"
                    x.add(str2.toDouble())
                    str2 = ""
                    z.add(btnn.text.toString())
                }
            }
        }
        btno.setOnClickListener{
            if(str!="")
            {
                val l=str.length
                if (str[l-1] == '+' || str[l-1] == '-' || str[l-1] == 'x' || str[l-1] == '÷' ) {
                    z.removeAt((z.size-1))
                    val x1=(x.size-1);
                    str2=x[x1].toString()
                    x.removeAt(x1)
                }
                else{
                    val l1=str2.length;str2=str2.substring(0,(l1-1))
                }
                str=str.substring(0,(l-1))
                caltext.text=str
            }
        }
        btnp.setOnClickListener{
            str="";caltext.text="";x.clear();z.clear()
        }
        btnl.setOnClickListener{
            if (str!="") {
                val l = str.length
                if (str[l - 1] != '+' && str[l - 1] != '-' && str[l - 1] != 'x' && str[l - 1] != '÷') {
                    x.add(str2.toDouble())
                    var i = z.size
                    var xy: Int
                    var abc: Int
                    while (i >= 1) {
                        xy = z.size
                        abc = 0
                        for (j in 0..<xy) {
                            if (z[j] == "÷") {
                                y = (x[j] / x[j + 1])
                                z.removeAt(j)
                                x.removeAt((j + 1))
                                x.removeAt(j)
                                x.add(index = j, element = y);abc = 1;break
                            }
                        }
                        xy = z.size
                        for (j in 0..<xy) {
                            if (z[j] == "x" && abc == 0) {
                                y = (x[j] * x[j + 1])
                                z.removeAt(j)
                                x.removeAt((j + 1))
                                x.removeAt(j)
                                x.add(index = j, element = y);abc = 1;break
                            }
                        }
                        xy = z.size
                        for (j in 0..<xy) {
                            if (z[j] == "+" && abc == 0) {
                                y = (x[j] + x[j + 1])
                                z.removeAt(j)
                                x.removeAt((j + 1))
                                x.removeAt(j)
                                x.add(index = j, element = y);abc = 1;break
                            }
                        }
                        xy = z.size
                        for (j in 0..<xy) {
                            if (z[j] == "-" && abc == 0) {
                                y = (x[j] - x[j + 1])
                                z.removeAt(j)
                                x.removeAt((j + 1))
                                x.removeAt(j)
                                x.add(index = j, element = y);break
                            }
                        }
                        i--;
                    }
                    caltext.text = y.toString()
                    str = "";str2 = ""
                    y = 0.0;x.clear();z.clear()
                }
            }
        }
    }
}