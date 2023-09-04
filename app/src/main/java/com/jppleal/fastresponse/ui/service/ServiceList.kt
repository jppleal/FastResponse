package com.jppleal.fastresponse.ui.service
import ServiceListAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jppleal.fastresponse.R

class ServiceList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service_list)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val dataList = generateSampleData() // Replace with your actual data
        val adapter = ServiceListAdapter(dataList) // Create your custom adapter
        recyclerView.adapter = adapter
    }

    private fun generateSampleData(): List<String> {
        // Replace this with your actual data fetching logic
        return listOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")
    }
}
