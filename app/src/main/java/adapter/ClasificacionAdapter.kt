package adapter
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import models.ClasificacionHolder
import models.ClasificacionItem

class ClasificacionAdapter(val clasificacionLista : List<ClasificacionItem>):RecyclerView.Adapter<ClasificacionAdapter.ClasificacionHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ClasificacionHolder.ClasificacionHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ClasificacionAdapter.ClasificacionHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}