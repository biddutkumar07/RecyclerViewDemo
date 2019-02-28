package com.example.biddutkumar.recyclerviewdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private Context context;
    private List<User> userList;

    public CustomAdapter(Context context, List<User> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View itemView=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user_item_layout,viewGroup,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        User currentUser=userList.get(position);

        viewHolder.nameTV.setText(currentUser.getName());
        viewHolder.genderTV.setText(currentUser.getGender());
        viewHolder.mobileTV.setText(currentUser.getMobileNumber());
        viewHolder.profileImageIV.setImageResource(currentUser.getProfileImage());


    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView profileImageIV;
        private TextView nameTV,genderTV,mobileTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTV=itemView.findViewById(R.id.nameTVId);
            genderTV=itemView.findViewById(R.id.genderTVId);
            mobileTV=itemView.findViewById(R.id.mobileTVId);
            profileImageIV=itemView.findViewById(R.id.profileImageIVId);

        }
    }
}
