package com.example.primerparcial;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class LayoutAdapter extends RecyclerView.Adapter<LayoutAdapter.ItemViewHolder>{
    private final Context context;
    private final ArrayList<Producto> productos;

    public LayoutAdapter(Context context, ArrayList<Producto> courseModelArrayList) {
        this.context = context;
        this.productos = courseModelArrayList;
    }

    @NonNull
    @Override
    public LayoutAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout, parent , false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LayoutAdapter.ItemViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Producto producto = productos.get(position);

        holder.producto.setText(producto.getNombre());
        holder.descripcion.setText(producto.getDescripcion());
        holder.precio.setText(producto.getPrecio());

        holder.borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                productos.remove(position);
                MainActivity.layoutAdapter.notifyDataSetChanged();
            }
        });

        holder.compartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return productos.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        TextView producto, descripcion, precio;
        Button borrar, compartir;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            producto = itemView.findViewById(R.id.nom_producto);
            descripcion = itemView.findViewById(R.id.desc_producto);
            precio = itemView.findViewById(R.id.precio_Producto);
            borrar = itemView.findViewById(R.id.quit);
            compartir = itemView.findViewById(R.id.share);

        }
    }
}
