package hu.danielelek.android.pad.ui.main

import android.content.Context
import android.graphics.drawable.Drawable
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import hu.danielelek.android.pad.R
import hu.danielelek.android.pad.model.Api
import hu.danielelek.android.pad.model.StoredApi
import kotlinx.android.synthetic.main.card_api.view.*

class ApiAdapter constructor(
    private val context: Context,
    private var publicApis: List<StoredApi>) : RecyclerView.Adapter<ApiAdapter.ViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.card_api, viewGroup, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val publicApi = publicApis[position]
        val authIcon : Drawable
        val httpsIcon: Drawable
        val corsIcon: Drawable

        if (publicApi.auth.isNullOrBlank()  || publicApi.auth.equals("false") || publicApi.auth.equals("no") || publicApi.auth.equals("unknown")) {
            authIcon = context.getDrawable(android.R.drawable.checkbox_off_background)!!
        } else {
            authIcon = context.getDrawable(android.R.drawable.checkbox_on_background)!!
        }

        if (publicApi.https.isNullOrBlank() || publicApi.https.equals("false") || publicApi.https.equals("no") || publicApi.https.equals("unknown")) {
            httpsIcon = context.getDrawable(android.R.drawable.checkbox_off_background)!!
        } else {
            httpsIcon = context.getDrawable(android.R.drawable.checkbox_on_background)!!
        }

        if (publicApi.cors.isNullOrBlank() || publicApi.cors.equals("false") || publicApi.cors.equals("no") || publicApi.cors.equals("unknown")) {
            corsIcon = context.getDrawable(android.R.drawable.checkbox_off_background)!!
        } else {
            corsIcon = context.getDrawable(android.R.drawable.checkbox_on_background)!!
        }

        holder.tvTitle.text = publicApi.title
        Glide.with(context).load(authIcon).into(holder.ivAuth)
        Glide.with(context).load(httpsIcon).into(holder.ivHttps)
        Glide.with(context).load(corsIcon).into(holder.ivCors)
    }

    override fun getItemCount() = publicApis.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tvTitle: TextView = view.tvApiTitle
        var ivAuth: ImageView = view.ivAuth
        var ivHttps: ImageView = view.ivHttps
        var ivCors: ImageView = view.ivCors
    }
}