import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jppleal.fastresponse.R
import com.jppleal.fastresponse.ui.service.CardItem

class CardItemAdapter(private val cardItems: List<CardItem>) :
    RecyclerView.Adapter<CardItemAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val streetTextView: TextView = itemView.findViewById(R.id.street)
        val locusTextView: TextView = itemView.findViewById(R.id.locus)
        val typeTextView: TextView = itemView.findViewById(R.id.typeOf)
        val openItemButton: Button = itemView.findViewById(R.id.buttonOpenItem)
        val openNavigationButton: Button = itemView.findViewById(R.id.buttonOpenNavigation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cardItem = cardItems[position]

        // Set data to views
        holder.streetTextView.text = cardItem.street
        holder.locusTextView.text = cardItem.locus
        holder.typeTextView.text = cardItem.type

        // Set click listeners for buttons (if needed)
        holder.openItemButton.setOnClickListener {
            // Handle opening the item here
        }

        holder.openNavigationButton.setOnClickListener {
            // Handle opening the navigation app here
        }
    }

    override fun getItemCount(): Int {
        return cardItems.size
    }
}
