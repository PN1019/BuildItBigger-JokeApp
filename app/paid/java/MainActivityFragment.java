
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.abhi.android_jokelibrary.JokesDisplayActivity;
import com.example.abhi.builditbigger.MainActivity;
import com.example.abhi.builditbigger.R;

import java.lang.Override;

public class MainActivityFragment extends Fragment implements View.OnClickListener{

    private ProgressBar mprogressBar;
    private Button btn_joke;
public MainActivityFragment(){}
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_main, container, false);
        btn_joke = (Button) root.findViewById(R.id.btn_joke);
        btn_joke.setOnClickListener(this);
        mprogressBar = (ProgressBar) root.findViewById(R.id.progressBar);
        mprogressBar.setVisibility(View.GONE);
        return root;
    }
@Override
public void onClick(View v){

    mprogressBar.setVisibility(View.VISIBLE);
    Toast.makeText(getActivity(), R.string.waiting_for_joke, Toast.LENGTH_SHORT);
    EndpointsAsyncTask endpointsAsyncTask= new EndpointsAsyncTask();
    endpointsAsyncTask.setListener(new EndpointsAsyncTask.TaskListener(){
        @Override
        public void getTaskResult(String result) {
            mprogressBar.setVisibility(View.GONE);
            Intent intent=new Intent(getActivity(), JokesDisplayActivity.class);
            intent.putExtra(Intent.EXTRA_TEXT,result);
                startActivity(intent);
        }
    }).execute(getActivity());

}
}