package sunshine.feldy.com.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] forcastArray = {
                "Today - Cerah - 88/63",
                "Tommorow - Mendung - 70/40",
                "Weds - Berawan - 72/63",
                "Thurs - Badai - 75/65",
                "Fri - Hujan Lebat - 65/56",
                "Sat - HELP TRAPPED IN WEATHERSTATION - 60/51",
                "Sun - Cerah - 80/68"
        };

        List<String> weekForcast = new ArrayList<String>(Arrays.asList(forcastArray));
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ArrayAdapter<String> mArrayAdapters = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forcast,
                R.id.list_item_forecast_textview,
                weekForcast);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forcast);
        listView.setAdapter(mArrayAdapters);

        return  rootView;
    }
}
;