package adam.illhaveacompany.recyclerviewdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_recycler_item.view.*


//it makes items an ArrayList of Strings, and I can find out the size of it later on.
class ItemAdapter (val context: Context, val items: ArrayList<String>) :
    RecyclerView.Adapter<ItemAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.ViewHolder {
        return ViewHolder(
            //it lays out the items from the layout (layout_recycler_item)
            LayoutInflater.from(context).inflate(R.layout.layout_recycler_item, parent, false)
        )
    }//2


    override fun getItemCount(): Int {
        return items.size
    }//3

    //called when RecyclerView needs a new ViewHolder of a given item
    //This loads the list as I scroll down
    override fun onBindViewHolder(holder: ItemAdapter.ViewHolder, position: Int) {
        //items is an arraylist of items that shows item one, item two ect.
        val item = items[position]

        //the text is from the ViewHolder class.
        holder.itemTextView.text = item

        //this changes the background color between white and grey
        if(position % 2 == 0) {
            holder.itemTextView.setBackgroundColor(
                ContextCompat.getColor(context,R.color.colorLightGray)
            )
        }else{
            holder.itemTextView.setBackgroundColor(ContextCompat.getColor(context,R.color.colorWhite))
        }
    }//4

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTextView = itemView.tvItem
    }//1

    fun getItemsCount(): Int {
        return items.size
    }//3



}

