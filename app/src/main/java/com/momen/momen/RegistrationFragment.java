package com.momen.momen;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegistrationFragment extends Fragment {
    EditText emailET;
    EditText nameET;
    EditText passET;
    EditText phoneET;


    Button nextbtn;

    private SingupInterface singupInterface;



    public RegistrationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_registration, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        emailET = view.findViewById(R.id.etName);
        nameET = view.findViewById(R.id.etEmail);
      phoneET = view.findViewById(R.id.etPhone);
        passET = view.findViewById(R.id.etPassword);


        nextbtn = view.findViewById(R.id.button);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = emailET.getText().toString();
                String phone = phoneET.getText().toString();
                String name= nameET.getText().toString();
                String pass= passET.getText().toString();

                singupInterface = (SingupInterface) getActivity();
                singupInterface.onSingUpComplete(email,phone,name,pass);


            }
        });




    }

    interface SingupInterface {

        void  onSingUpComplete(String email,String phone,String name,String pass);


    }
}
