package androidx.leanback.leanbackshowcase.app.details;

import android.app.Activity;
import android.os.Bundle;

import androidx.leanback.app.DetailsFragment;
import androidx.leanback.leanbackshowcase.R;

public class DetailViewRemajaActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_example);

        if (savedInstanceState == null) {
            DetailViewRemajaFragment fragment = new DetailViewRemajaFragment();
            getFragmentManager().beginTransaction()
                    .replace(R.id.details_fragment, fragment)
                    .commit();
        }
    }
}

