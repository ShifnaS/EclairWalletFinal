package com.example.nexgensm.eclairwallet.activity;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.nexgensm.eclairwallet.R;
import com.example.nexgensm.eclairwallet.adapter.SimplePagerAdapter;
import com.example.nexgensm.eclairwallet.fragment.LightningFragment;
import com.example.nexgensm.eclairwallet.fragment.SummaryPurchaseFragment;

public class HomeActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener,LightningFragment.OnFragmentInteractionListener,SummaryPurchaseFragment.OnFragmentInteractionListener{
    //This is our tablayout
    private TabLayout tabLayout;

    //This is our viewPager
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //Adding toolbar to the activity
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Initializing the tablayout
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        //Adding the tabs using addTab() method
        tabLayout.addTab(tabLayout.newTab().setText("Lightning Collect"));
        tabLayout.addTab(tabLayout.newTab().setText("Notification"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //Initializing viewPager
        viewPager = (ViewPager) findViewById(R.id.pager);

        //Creating our pager adapter
        SimplePagerAdapter adapter = new SimplePagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

        //Adding adapter to pager
        viewPager.setAdapter(adapter);

        //Adding onTabSelectedListener to swipe views
        tabLayout.setOnTabSelectedListener(this);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

   /* @Override
    public void onBackPressed() {
        super.onBackPressed();

    }*/
}
