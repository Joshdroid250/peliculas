package models

import adapter.ClasificacionAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.creaciondeinterfaz.databinding.ItemClasificacionBinding

inner class ClasificacionHolder(val binding : ItemClasificacionBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(clasificacion: ClasificacionItem){
        with(binding){
            TxtAbreviacion.text = clasificacion.abreviacion
            TxtNombre.text = clasificacion.nombre
            TxtId.text = Clasificacion.idClasificacion.toString()
        }
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ClasificacionHolder {
        val binding = ItemClasificacionBinding.inflate(
            LayoutInlater.from(parent.context),
            parent,
            false
        )
        return  ClasificacionHolder(binding)
    }

    override fun onBindViewHolder(holder: ClasificacionAdapter.ClasificacionHolder, position: Int){
        holder.bind(clasificacionFragment)
    }
}