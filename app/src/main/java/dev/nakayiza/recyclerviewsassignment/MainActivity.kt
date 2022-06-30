package dev.nakayiza.recyclerviewsassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.nakayiza.recyclerviewsassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayNumbers()

    }

    fun displayNumbers(){
        var numberList=fibonacci(100)
//        println(numberList)
        binding.rvnumbers.layoutManager=LinearLayoutManager(this)
        binding.rvnumbers.adapter=number_recyclerview_adapetr(numberList)
    }
    fun fibonacci(n:Int):List<Int>{
        var list=ArrayList<Int>()
        var first_num=0
        var second_num=1


        for (i in 1..n){

            var sum=first_num+second_num
            first_num=second_num
            second_num=sum

            list+=sum
        }
        return  list
    }
}