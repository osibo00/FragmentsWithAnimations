package productions.darthplagueis.fragmentswithanimations;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    private View rootView;
    private EditText editText;
    private Button button;


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_first, container, false);
        editText = (EditText) rootView.findViewById(R.id.firstfrag_edittext);
        button = (Button) rootView.findViewById(R.id.firstfrag_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragment secondFragment = new SecondFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);

                Bundle bundle = new Bundle();
                bundle.putString("edittext", editText.getText().toString());
                secondFragment.setArguments(bundle);

                fragmentTransaction.replace(R.id.main_container, secondFragment);
                fragmentTransaction.addToBackStack("secondFragment");
                fragmentTransaction.commit();
            }
        });
        return rootView;
    }

}
