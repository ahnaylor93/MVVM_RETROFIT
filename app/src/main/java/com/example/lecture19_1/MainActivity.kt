package com.example.lecture19_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.example.lecture19_1.databinding.ActivityMainBinding

//Observable: Something that emits the data
//Observer: Something that listens to the data emitted by an observable
//Live data: an observable data holder class, but is lifecycle-aware (it respects the lifecycle of other
//  app components)

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("LIFECYCLE", "onCreate() Called")
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // val ld = viewModel.liveData
        viewModel.emitValue().observe(this, Observer { response ->
            if(response.status == "error"){
                val dialog = AlertDialog.Builder(baseContext)
                    .setTitle("Error")
                    .setMessage("Encountered an error while retrieving news.\nPlease try again.")
                    .create()
                dialog.show()
            }
            else{
                val description = response.news.get(0).description
                binding.tvMessage.text = description
            }
        })
    }

    override fun onStart() {
        Log.d("LIFECYCLE", "onStart() Called")
        super.onStart()
    }

    override fun onResume() {
        Log.d("LIFECYCLE", "onResume() Called")
        super.onResume()
    }

    override fun onPause() {
        Log.d("LIFECYCLE", "onPause() Called")
        super.onPause()
    }

    override fun onStop() {
        Log.d("LIFECYCLE", "onStop() Called")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("LIFECYCLE", "onDestroy() Called")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d("LIFECYCLE", "onRestart( Called")
        super.onRestart()
    }




}