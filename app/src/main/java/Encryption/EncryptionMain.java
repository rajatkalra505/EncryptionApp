package Encryption;

import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;

import com.example.Algorithms.R;



public class EncryptionMain extends Fragment {

    private Button Switch;
    private Button Encrypt_Buuton;
    private Button Decrypt_Buuton;
    private TextView Answer;
    private EditText Textfield_Text;
    private EditText Textfield_Key;



    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.encryption_main, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        getActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Switch = view.findViewById(R.id.Swtich);
        Encrypt_Buuton = view.findViewById(R.id.Encrypt_Buuton);
        Decrypt_Buuton = view.findViewById(R.id.Decrypt_Buuton);
        Answer = view.findViewById(R.id.Answer);
        Textfield_Text = view.findViewById(R.id.TextArea);
        Textfield_Key = view.findViewById(R.id.Key);



        return view;
    }



    public void encrypt(View view) throws Exception {


        if (Textfield_Text.length() == 0) {
            Toast.makeText(view.getContext(), "Enter a message to Encrypt", Toast.LENGTH_SHORT).show();
            return;
        }


    }
    public void decrypt(View view) throws Exception {
        if (Textfield_Text.length() == 0) {
            Toast.makeText(view.getContext(), "Enter a message to Decrypt", Toast.LENGTH_SHORT).show();
            return;
        }


    }


    public void switchAlgho(View view) {
        reset(null);
        String SwitchValue = Switch.getText().toString();
        switch (SwitchValue) {
            case "Advanced Encryption Standard":
                Switch.setText("Triple Data Encryption Standard");
               break;
            case "Triple Data Encryption Standard":
                Textfield_Key.setInputType(InputType.TYPE_CLASS_NUMBER);
                Switch.setText("Caesar Cipher");
                break;
            case "Caesar Cipher":
                Switch.setText("Advanced Encryption Standard");
                break;

        }
    }


    public void reset(View view) {
        Textfield_Text.setText("");
        Textfield_Key.setText("");
        Answer.setText("");

        if(view!=null)
        Toast.makeText(view.getContext(), "All data has been deleted", Toast.LENGTH_SHORT).show();
    }



    public void copyToClipboard(View view) {
        Toast.makeText(view.getContext(),
                "Your message has be copied", Toast.LENGTH_SHORT).show();
    }
}





















