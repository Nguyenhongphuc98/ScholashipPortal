package com.example.scholashipportal.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.scholashipportal.GlobalSuport;
import com.example.scholashipportal.R;
import com.example.scholashipportal.ScholashipDetailFragment;
import com.example.scholashipportal.model.ScholashipCard;

import java.util.List;

public class ScholashipCardAdaptor extends
        RecyclerView.Adapter<ScholashipCardAdaptor.ViewHolder> {

    Context context;
    private int lastPosition = -1;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View cardView = inflater.inflate(R.layout.card_scholaship_home, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(cardView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Get the data model based on position
        ScholashipCard card = mCards.get(position);

        // Set item views based on your views and data model
        TextView textView = holder.nameTextView;
        textView.setText(card.getName());

        TextView deadline = holder.deadline;
        deadline.setText(card.getmDeadline());

        holder.logoCompany.setImageResource(card.getAvatarOfCompany());
        holder.banner.setImageResource(card.getCover());

        Button button = holder.btnXem;
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                GlobalSuport.ReplaceFragment(new ScholashipDetailFragment());
            }
        });

        setAnimation(holder.banner,position);
    }

    @Override
    public int getItemCount() {
        return mCards.size();
    }

    private void setAnimation(View viewToAnimate, int position) {
        // If the bound view wasn't previously displayed on screen, it's animated
        Animation animation;
        if (position < lastPosition)
            animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
        else
            animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_out_right);

        viewToAnimate.startAnimation(animation);
        lastPosition = position;
    }

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView nameTextView;
        public TextView deadline;
        public Button btnXem;
        public ImageView logoCompany;
        public ImageView banner;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.scholarshipname);
            deadline = (TextView) itemView.findViewById(R.id.deadline);
            btnXem = (Button) itemView.findViewById(R.id.btnXemHB);
            logoCompany = (ImageView) itemView.findViewById(R.id.logoToChuc);
            banner = (ImageView) itemView.findViewById(R.id.bannerScholaship);
        }
    }

    // Store a member variable for the contacts
    private List<ScholashipCard> mCards;

    // Pass in the contact array into the constructor
    public ScholashipCardAdaptor(List<ScholashipCard> cards) {
        mCards = cards;
    }
}