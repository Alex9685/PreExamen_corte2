package com.example.pre_examencorte2;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class UsuarioAdapter extends RecyclerView.Adapter<UsuarioAdapter.UsuarioViewHolder> {
    private List<Usuario> listaUsuarios;
    private Context context;

    public UsuarioAdapter(Context context, List<Usuario> listaUsuarios) {
        this.context = context;
        this.listaUsuarios = listaUsuarios;
    }

    @NonNull
    @Override
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_usuario, parent, false);
        return new UsuarioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioViewHolder holder, int position) {
        Usuario usuario = listaUsuarios.get(position);
        holder.bind(usuario);
    }

    @Override
    public int getItemCount() {
        return listaUsuarios.size();
    }

    public class UsuarioViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textViewNombreUsuario;
        private TextView textViewCorreo;

        public UsuarioViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNombreUsuario = itemView.findViewById(R.id.textViewNombreUsuario);
            textViewCorreo = itemView.findViewById(R.id.textViewCorreo);
        }

        public void bind(Usuario usuario) {
            textViewNombreUsuario.setText(usuario.getNombreUsuario());
            textViewCorreo.setText(usuario.getCorreo());


        }
    }
}
