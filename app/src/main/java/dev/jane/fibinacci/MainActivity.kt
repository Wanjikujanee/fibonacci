package dev.jane.fibinacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import androidx.recyclerview.widget.LinearLayoutManager
import dev.jane.fibinacci.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayNumbers()

    }
    fun displayNumbers(){
        var numberList= displayFabonacciNumbers(100)
        val numberAdapter=NumberRecyclerViewsAdapter(numberList)
        binding.rvnumbers.layoutManager= LinearLayoutManager(this)
        binding.rvnumbers.adapter=numberAdapter
    }


    fun displayFabonacciNumbers(size:Int):List<Int>{
        var listnumbers=ArrayList<Int>()
        var t1=0
        var t2=1
        var number=0
        while (number<=size){
            print(t1)
            var sum=t1+t2
            t1=t2
            t2=sum
            number++
            listnumbers+=sum
        }
        return listnumbers
    }
}
