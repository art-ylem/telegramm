package com.example.telegram;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class MessageFragment extends Fragment {

    private ArrayList<Messages> messagesArrayList = new ArrayList<>();
    private RecyclerView recyclerView;
    private OnFragmentInteractionListener mListener;

    public MessageFragment() {
        // Required empty public constructor
    }

    public static MessageFragment newInstance() {
        MessageFragment fragment = new MessageFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_message, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
    }

    private void init(View view){
        messagesArrayList.add(new Messages(R.drawable.ic_message_image,"Ася Николаева", "https://www.youtube.com", "18:00"));
        messagesArrayList.add(new Messages(R.drawable.ic_message_image,"Мужики ЛП 173", "Евгений: списон", "Fri"));
        messagesArrayList.add(new Messages(R.drawable.ic_message_image,"Sidorov Artem", "Во сколько завтра занятие?", "19:20"));
        messagesArrayList.add(new Messages(R.drawable.ic_message_image,"Sidorov Artem", "Во сколько завтра занятие?", "19:20"));
        messagesArrayList.add(new Messages(R.drawable.ic_message_image,"Sidorov Artem", "Во сколько завтра занятие?", "19:20"));
        messagesArrayList.add(new Messages(R.drawable.ic_message_image,"Sidorov Artem", "Во сколько завтра занятие?", "19:20"));
        messagesArrayList.add(new Messages(R.drawable.ic_message_image,"Sidorov Artem", "Во сколько завтра занятие?", "19:20"));
        messagesArrayList.add(new Messages(R.drawable.ic_message_image,"Sidorov Artem", "Во сколько завтра занятие?", "19:20"));
        messagesArrayList.add(new Messages(R.drawable.ic_message_image,"Sidorov Artem", "Во сколько завтра занятие?", "19:20"));


        recyclerView = view.findViewById(R.id.message_recycler_view);
        MessagesRecyclerViewAdapter messagesRecyclerViewAdapter = new MessagesRecyclerViewAdapter(messagesArrayList, getActivity());
        recyclerView.setAdapter(messagesRecyclerViewAdapter);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onMessageFragmentInteraction();
    }
}
