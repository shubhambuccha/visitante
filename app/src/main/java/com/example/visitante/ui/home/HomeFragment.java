package com.example.visitante.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.visitante.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class HomeFragment extends Fragment {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    private EditText et1,et2,et3,et4,et5,et6;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_home, container, false);
        et1 = root.findViewById(R.id.editText);
        et2 = root.findViewById(R.id.editText2);
        et3 = root.findViewById(R.id.editText3);
        et4 = root.findViewById(R.id.editText4);
        et5 = root.findViewById(R.id.editText5);
        et6 = root.findViewById(R.id.editText6);



        root.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String Vname = et1.getText().toString().trim();
                final String Vemail = et2.getText().toString().trim();
                final String Vphone = et3.getText().toString().trim();
                final String Hname = et4.getText().toString().trim();
                final String Hemail = et5.getText().toString().trim();
                final String Hphone = et6.getText().toString().trim();
                final String Time1 = java.text.DateFormat.getTimeInstance().format(new Date());
                final String Time2=null;
                Map<String,Object> map = new HashMap<>();
                map.put("Visitors name",Vname);
                map.put("Visitors email",Vemail);
                map.put("Visitors phone",Vphone);
                map.put("Host name",Hname);
                map.put("Host email",Hemail);
                map.put("Host phone",Hphone);
                map.put("Check-in time",Time1);
                map.put("Check-out time",Time2);
                db.collection("Visitors").add(map).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentReference> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(root.getContext(),"Data Successfully Inserted",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        return root;
    }
}