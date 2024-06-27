package com.example.blogreader

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.blogreader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvBlogger.layoutManager = LinearLayoutManager(this)
        displayBlogger()

    }
    fun displayBlogger(){
        val blogger1 = Blogger("Martin", "The Pearl", "December 2018", "The pearl is a testament to the transformative power of love, education, and determination.")
        val blogger2 = Blogger("Joel", "After", "february 2010", "The pearl is a testament to the transformative power of love, education, and determination.")
        val blogger3 = Blogger("sydney", "River Between", "April 2021", "The pearl is a testament to the transformative power of love, education, and determination.")
        val blogger6 = Blogger("MarkDoe", "First Come", "January 2020", "The pearl is a testament to the transformative power of love, education, and determination.")
        val blogger7 = Blogger("Joesy", "The End", "february 2020", "The pearl is a testament to the transformative power of love, education, and determination.")
        val blogger8 = Blogger("Terry", "The Pearl", "March 2023", "The pearl is a testament to the transformative power of love, education, and determination.")
        val blogger9 = Blogger("Alicia", "Born A crime", "June 2020", "The pearl is a testament to the transformative power of love, education, and determination.")
        val blogger10 = Blogger("Anna", "The Pearl", "May 2020", "The pearl is a testament to the transformative power of love, education, and determination.")
        val blogger11 = Blogger("Mark", "The Pearl", "January 2020", "The pearl is a testament to the transformative power of love, education, and determination.")
        val blogger12 = Blogger("Joe", "The Pearl", "May 2020", "The pearl is a testament to the transformative power of love, education, and determination.")
        val blogger13 = Blogger("James", "Sunshine", "March 2020", "The pearl is a testament to the transformative power of love, education, and determination.")
        val blogger14 = Blogger("Alice", "Before", "April 2020", "The pearl is a testament to the transformative power of love, education, and determination.")
        val blogger15 = Blogger("Job", "The Pearl", "January2020", "The pearl is a testament to the transformative power of love, education, and determination.")

        val bloggerList = listOf(blogger1, blogger2, blogger3,blogger6, blogger7, blogger8, blogger9,
            blogger10, blogger11, blogger12,blogger13, blogger14, blogger15)
        val bloggerAdapter = BlogAdapter(bloggerList)
        binding.rvBlogger.adapter = BlogAdapter
    }
}

        }
    }
