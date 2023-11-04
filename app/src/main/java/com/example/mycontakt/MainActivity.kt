package com.example.mycontakt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mycontakt.databinding.ActivityMainBinding
import com.example.mycontakt.databinding.MyItemBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    lateinit var list : ArrayList<MyContact>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.apply {
            btnSave.setOnClickListener {  }
            list = ArrayList()

            binding.apply {
                btnSave.setOnClickListener {
                    list.add(MyContact(edtName.text.toString(), edtNumber.text.toString()))
                    val myContact = MyContact(edtName.text.toString(),edtNumber.text.toString())
                    val item = MyItemBinding.inflate(layoutInflater)
                    item.tvName.text = myContact.name
                    item.tvNumber.text = myContact.number
                    binding.myLinerLayout.addView(item.root)

                }
            }
        }
            }
        }