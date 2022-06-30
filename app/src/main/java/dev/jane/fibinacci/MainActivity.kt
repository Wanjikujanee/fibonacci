package dev.jane.fibinacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        var numberList= listOf(1,3,4,6,7,9,24,38,41,20,49,50,63,80,100,200,170,38,20)
        val numberAdapter=NumberRecyclerViewsAdapter(numberList)
        binding.rvnumbers.layoutManager= LinearLayoutManager(this)
        binding.rvnumbers.adapter=numberAdapter
    }


    fun main() {

        val read = Scanner(System.`in`)

        println("Enter number:")
        val number = read.nextInt()

        var t1 = 0
        var t2 = 1

        println("\nFibonacci series upto $number: ")

        while (t1 <= number) {
            print("$t1  ")

            val sum = t1 + t2
            t1 = t2
            t2 = sum
        }

        println("\n\nThe End")
    }



}