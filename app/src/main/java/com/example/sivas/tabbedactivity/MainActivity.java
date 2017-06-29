package com.example.sivas.tabbedactivity;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.sivas.tabbedactivity.MainActivity.PlaceholderFragment.number;

public class MainActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    private Button prevButton,nextButton;
    public static String[] myStringArray={"Manam Gelichinappudu chappatlu kottevallu manam odipoyinappudu bhujam thatte vallu naluguru lenappudu entha sampadinchina wastey",
    "Vayasu aipoina hero lu andharu rajakeya nayakulu ainattu... Fail aina premikulu andharu freinds aipoleru",
    "Vidipovadam thappadhu annapudu adhi antha twaraga jarigithey antha manchidhi",
    "Nijam cheppakapovadan abadham, abadhanni nijam cheyalanukovadam mosam",
    "Manam istamga anukunedhi adrustam balamga korukunedhi bhavisyathhu",
    "Manushulu puttakey sampradhayalu puttayi, smapradayalu puttaka manushulu puttaledhu",
    "Aada pillaku gunnani minchina asthi ledhu",
    "Oka manishini manam premisthey vallu chesey thappulni kuda manam kshaminchagalagali",
    "Adbutham jarigetappudu evaru gurtyhinchaleru, jarigina tarvatha evaru gurthinchalsina avasaram ledhu",
    "Aadapillalu entha thondharaga premistharo antha thondaraga marchipotharu",
    "Thandriki bhavisyathuki bhayapadanivadu, jeevithamlo paiki raledu",
    "Pani chesi jeetham adagochu. Appu ichi vaddi adagochu, kani..help chesi matram thanks adagakudadhu",
    "Badhalo unnavadini ela unnavu ani adagadam amayakathvam. Baagunna vadini ela unnavu ani adagadam anavasaram",
    "Kaaranam leni kopam. Istham leni gauravam. Badhyatha leni yavvanam,Gnyapakam leni Vrudhaapyam..anavasaram",
    "Sampadinchadam chetha kani variki karchu pettey arhatha ledhu",
    "Premiche vayasulo poschinche shakthi undadhu..poschinchey shakthi vachesariki..preminchey time undadhu",
    "Yudhamlo gelavadam antey sathurvu ni champadam kadu, sathruvu ni oodinchadam",
    "Dabbulunna vallandharu karchupettaleru..karchupettey vallandharu anandhinchaleru",
    "Oka manishiki untey adhi kopam, adhey kopam oka gumpuki untey adhi udhyamam"};

    Toast toast;


    public void displaytoast(String message)
    {
        if(toast!=null)
        {
            toast.cancel();
        }
        toast=Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prevButton=(Button)findViewById(R.id.prev_button);
        nextButton=(Button) findViewById(R.id.next_button);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewPager.setCurrentItem(mViewPager.getCurrentItem()+1);
                //Toast.makeText(MainActivity.this,String.valueOf(number), Toast.LENGTH_SHORT).show();
                displaytoast(String.valueOf(mViewPager.getCurrentItem()+1));
            }
        });

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewPager.setCurrentItem(mViewPager.getCurrentItem()-1);
                //Toast.makeText(MainActivity.this,String.valueOf(number), Toast.LENGTH_SHORT).show();
                displaytoast(String.valueOf(mViewPager.getCurrentItem()+1));
            }
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //test
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";
        public static int number=0;

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
           // textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
           // textView.setText(String.valueOf(getArguments().getInt(ARG_SECTION_NUMBER)));
            textView.setText(myStringArray[getArguments().getInt(ARG_SECTION_NUMBER)-1]);
            number=getArguments().getInt(ARG_SECTION_NUMBER);
            return rootView;
        }


    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return myStringArray.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
           /* switch (position) {
                case 0:
                    return "SECTION 1";
                case 1:
                    return "SECTION 2";
                case 2:
                    return "SECTION 3";
            }*/
            return "OBJECT " + (position + 1);
        }
    }
}
