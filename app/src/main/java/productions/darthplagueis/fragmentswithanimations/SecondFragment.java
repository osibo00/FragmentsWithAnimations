package productions.darthplagueis.fragmentswithanimations;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    private View rootView;
    private TextView textView;


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_second, container, false);
        textView = (TextView) rootView.findViewById(R.id.secondfrag_textview);

        Bundle bundle = getArguments();
        String bundleText = bundle.getString("edittext");
        textView.setText(bundleText);
        return rootView;
    }

}
