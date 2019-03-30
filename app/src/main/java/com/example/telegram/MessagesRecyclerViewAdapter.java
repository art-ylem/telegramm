package com.example.telegram;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MessagesRecyclerViewAdapter extends RecyclerView.Adapter<MessagesRecyclerViewAdapter.ViewHolder> {
    private ArrayList<Messages> messagesArrayList;
    private Context context;
    private LayoutInflater mInflater;

    public MessagesRecyclerViewAdapter(ArrayList<Messages> messagesArrayList, Context context) {
        this.messagesArrayList = messagesArrayList;
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = mInflater.inflate(R.layout.messages_recycler_view_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        int img = messagesArrayList.get(i).getMessageImage();
        viewHolder.messageImage.setImageResource(img);
        String name = messagesArrayList.get(i).getMessageName();
        viewHolder.messageName.setText(name);
        String message = messagesArrayList.get(i).getMessageMessage();
        viewHolder.messageMessage.setText(message);
        String time = messagesArrayList.get(i).getMessageTime();
        viewHolder.messageTime.setText(time);
    }

    @Override
    public int getItemCount() {
        return messagesArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView messageImage;
        private TextView messageName;
        private TextView messageMessage;
        private TextView messageTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            messageImage = itemView.findViewById(R.id.message_row_img);
            messageName = itemView.findViewById(R.id.message_row_name);
            messageMessage = itemView.findViewById(R.id.message_row_message);
            messageTime = itemView.findViewById(R.id.message_row_time);

        }
    }
}
