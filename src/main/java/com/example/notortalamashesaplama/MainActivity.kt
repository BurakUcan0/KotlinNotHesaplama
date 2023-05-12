package com.example.notortalamashesaplama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notortalamashesaplama.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonHesapla.setOnClickListener {
            if (binding.editTextNumber1.text.isNotEmpty() && binding.editTextNumber2.text.isNotEmpty()) {
                var sinav1 = binding.editTextNumber1.text.toString().toInt()
                var sinav2 = binding.editTextNumber2.text.toString().toInt()
                var ortalama:Double = (sinav1+sinav2) /2.toDouble()
                if(ortalama>=50 && sinav2>=50){
                    binding.SonucText.text = (ortalama.toString()+ " "+ "Geçtiniz")
                    binding.SonucText.setTextColor(getColor(R.color.green))

                }else{
                    binding.SonucText.text = (ortalama.toString()+ " "+ "Kaldınız")
                    binding.SonucText.setTextColor(getColor(R.color.red))
                }
            }else {
                binding.SonucText.text = "Sınav notunuzu giriniz."
                binding.SonucText.setTextColor(getColor(R.color.red))
            }
        }
    }
}