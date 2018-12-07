package com.apress.gerber.homework;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class BlankFragment extends Fragment {

    private Button button;
    private EditText e1;
    private String s;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.blank,container,false);
        onButtonClickAction(view);
        return view;

    }
    public void onButtonClickAction(View view){
        button=(Button)view.findViewById(R.id.button3);
       e1 =(EditText)view.findViewById(R.id.editText3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=e1.getText().toString();
                Toast.makeText(getActivity(), "This is happening", Toast.LENGTH_LONG).show();
                Intent intent =new Intent(getActivity(),Main2Activity.class);
                intent.putExtra("text",s);
                startActivity(intent);
            }
        });



    }
}
