package adam.illhaveacompany.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //for going back and forth between list and grid view
    val LIST_VIEW = "LIST_VIEW"
    val GRID_VIEW = "GRID_VIEW"

    var currentVisibleView: String = LIST_VIEW

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupListView()  //6

        fabSwitch.setOnClickListener {view ->

            if(currentVisibleView == LIST_VIEW){
                fabSwitch.setImageDrawable(
                    ContextCompat.getDrawable(this@MainActivity, R.drawable.ic_list))
                setupGridView()
            }else{
                fabSwitch.setImageDrawable(
                    ContextCompat.getDrawable(this@MainActivity, R.drawable.ic_grid))
                setupListView()
            }

        }



    }

    fun setupListView(){
        currentVisibleView = LIST_VIEW
        //makes the recycler view into a Linear Layout
        recyclerView.layoutManager = LinearLayoutManager(this)
        //getItems is confusing
        val itemAdapter = ItemAdapter(this, getItemsList() )
        recyclerView.adapter = itemAdapter
    }//7

    private fun setupGridView(){
        currentVisibleView = GRID_VIEW

        //the span is how many per row
        recyclerView.layoutManager = GridLayoutManager(this, 3)

        val itemAdapater = ItemAdapter(this, getItemsList())
        recyclerView.adapter = itemAdapater
    }


    /**
     * Generates an array list <String> which contains the amount of values as the for loop goes for.
     * Play around with the numbers to create difference size lists and seeing how recyclerview works
     */

    /**
     *  //returns the ArrayList of items
    fun getItems(): ArrayList<String> {
    var items = ArrayList<String>()

    for (number in 1..30) {
    items.add("Item$number")
    }
    return items
    }//9

     */


    private fun getItemsList(): ArrayList<String>{
        val list = ArrayList<String>()

        list.add("Item One")
        list.add("Item two")
        list.add("Item three")
        list.add("Item four")
        list.add("Item five")
        list.add("Item six")
        list.add("Item seven")
        list.add("Item 8")
        list.add("Item 9")
        list.add("Item 10")
        list.add("Item 11")
        list.add("Item 12")
        list.add("Item 13")
        list.add("Item 14")
        list.add("Item 15")
        list.add("Item 16")
        list.add("Item 17")
        list.add("Item 18")
        list.add("Item 19")
        list.add("Item 20")
        list.add("Item 21")
        list.add("Item 22")
        list.add("Item 23")
        list.add("Item 24")
        list.add("Item 25")
        list.add("Item 26")
        list.add("Item 27")
        list.add("Item 28")
        list.add("Item 29")
        list.add("Item 30")
        return list
    }




}